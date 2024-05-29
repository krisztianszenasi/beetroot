package com.krisztianszenasi.beetroot.semantic_analysis;

import com.krisztianszenasi.beetroot.ast.nodes.FileNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.StatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.FunctionDefinitionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.ParameterListNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.ParameterNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.ForStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.IfStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.LogicalBlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.WhileStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.AssignmentStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.ReturnStatement;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.VariableDeclarationNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control.BreakFlowControlStatement;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control.ContinueFlowControlStatement;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitorDefaultVoid;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.FunctionBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.declaration_type.BSDeclarationTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.expression_type.BSExpressionTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.error.*;
import com.krisztianszenasi.beetroot.semantic_analysis.validators.*;
import com.krisztianszenasi.beetroot.semantic_analysis.symbol.BuiltInFunctions;
import com.krisztianszenasi.beetroot.semantic_analysis.symbol.FunctionSymbol;
import com.krisztianszenasi.beetroot.semantic_analysis.symbol.VariableSymbol;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;
import com.krisztianszenasi.beetroot.semantic_analysis.type_system.TypeSystem;

public class SemanticAnalyser extends AstVisitorDefaultVoid {

    private Scope current;
    private FunctionBuilder currentFuncBuilder = null;
    private final TypeSystem typeSystem;
    private final ErrorHandler errorHandler;
    private final BSExpressionTypeBuilder expressionTypeBuilder;
    private final BSDeclarationTypeBuilder declarationTypeBuilder;
    private int logicalBlockDepths = 0;

    public SemanticAnalyser(TypeSystem typeSystem, ErrorHandler errorHandler) {
        this.typeSystem = typeSystem;
        this.errorHandler = errorHandler;
        this.current = new Scope();
        this.declarationTypeBuilder = new BSDeclarationTypeBuilder(typeSystem, errorHandler);
        this.expressionTypeBuilder = new BSExpressionTypeBuilder(typeSystem, errorHandler);
        BuiltInFunctions.register(current, typeSystem);
    }

    @Override
    public Void visitFileNode(FileNode node) {
        visit(node.getBlock());
        return null;
    }

    @Override
    public Void visitExpressionNode(ExpressionNode node) {
        expressionTypeBuilder.getTypeFor(node, current);
        return null;
    }

    @Override
    public Void visitBreakFlowControlStatement(BreakFlowControlStatement node) {
        if(outsideLogicalBlock()) {
            errorHandler.addOutsideOfLoopError(node,"break");
        }
        return null;
    }

    @Override
    public Void visitContinueFlowControlStatement(ContinueFlowControlStatement node) {
        if(outsideLogicalBlock()) {
            errorHandler.addOutsideOfLoopError(node, "continue");
        }
        return null;
    }



    @Override
    public Void visitAssignmentStatementNode(AssignmentStatementNode node) {
        if(AssignmentValidator.cannotBeAssigned(node.getPrimary())) {
            AssignmentValidator.addCannotBeAssignedError(errorHandler, node);
            return null;
        }
        AssignmentValidator.validateUnMutableVariables(node.getPrimary(), current, errorHandler);
        TypeValidator.validateCompatibility(
                expressionTypeBuilder.getTypeFor(node.getExpression(), current),
                expressionTypeBuilder.getTypeFor(node.getPrimary(), current),
                errorHandler,
                node
        );
        return null;
    }

    @Override
    public Void visitReturnStatement(ReturnStatement node) {
        if(insideFunction()) {
            FunctionValidator.validateReturnType(
                    expressionTypeBuilder.getTypeFor(node.getExpressionNode(), current),
                    currentFuncBuilder,
                    errorHandler,
                    node
            );
            return null;
        }
        errorHandler.addReturnOutsideOfFunction(node);
        return null;
    }

    @Override
    public Void visitBlockNode(BlockNode node) {
        enterBlock();
        for(StatementNode statement : node.getStatements()) {
            visit(statement);
        }
        leaveBlock();
        return null;
    }


    @Override
    public Void visitVariableDeclarationNode(VariableDeclarationNode node) {
        VarDecValidator validator = new VarDecValidator(node);
        if(validator.variableNotYetDefined(current)) {
            validator.validateMutability(errorHandler);
            validator.validateTypeDeclarationAndInitialValue(
                    declarationTypeBuilder.getTypeFor(node.getDeclarationType()),
                    expressionTypeBuilder.getTypeFor(node.getInitialValue(), current),
                    errorHandler
            );
            current.add(validator.buildVarSymbol(typeSystem.getErrorType()));
            return null;
        }
        errorHandler.addVariableAlreadyExists(node);
        return null;
    }

    @Override
    public Void visitFunctionDefinitionNode(FunctionDefinitionNode node) {
        startFunctionBuilding(
                new FunctionSymbol(
                        node.getName(),
                        declarationTypeBuilder.getTypeFor(node.getReturnType())
                )
        );
        visit(node.getParameters());
        visit(node.getBlock());
        stopFunctionBuilding();
        return null;
    }

    @Override
    public Void visitParameterListNode(ParameterListNode node) {
        for(ParameterNode param : node.getParameters()) {
            visit(param);
        }
        return null;
    }

    @Override
    public Void visitParameterNode(ParameterNode node) {
        BSType argType = declarationTypeBuilder.getTypeFor(node.getType());
        currentFuncBuilder.addArgType(argType);
        current.add(
                new VariableSymbol(
                    node.getName(),
                    argType,
                    true,
                    true
                )
        );
        return null;
    }

    @Override
    public Void visitForStatementNode(ForStatementNode node) {
        ForStatementValidator validator = new ForStatementValidator(node);

        BSType explicitType = declarationTypeBuilder.getTypeFor(node.getVarDeclaration().getDeclarationType());
        BSType expressionType = expressionTypeBuilder.getTypeFor(node.getExpression(), current);

        validator.validateVariableType(explicitType, expressionType, errorHandler);
        current.add(validator.buildSymbol(typeSystem.getErrorType()));

        handleLogicalBlock(node);
        return null;
    }

    @Override
    public Void visitIfStatementNode(IfStatementNode node) {
        expressionTypeBuilder.getTypeFor(node.getExpression(), current);
       handleLogicalBlock(node);
        return null;
    }

    @Override
    public Void visitWhileStatementNode(WhileStatementNode node) {
        expressionTypeBuilder.getTypeFor(node.getExpression(), current);
        handleLogicalBlock(node);
        return null;
    }


    // helpers
    public boolean wereAnyErrors() {
        return errorHandler.wereAnyErrors();
    }
    private void enterBlock() {
        current = new Scope(current);
    }

    private void leaveBlock() {
        current = current.getPrevious();
    }

    private void startFunctionBuilding(FunctionSymbol function) {
        current.add(function);
        currentFuncBuilder = new FunctionBuilder(currentFuncBuilder, function);
        enterBlock();
    }

    private void stopFunctionBuilding() {
        currentFuncBuilder = currentFuncBuilder.getPrevious();
        leaveBlock();
    }

    private boolean insideFunction() {
        return currentFuncBuilder != null;
    }

    private boolean outsideLogicalBlock() {
        return logicalBlockDepths < 0;
    }

    public void printErrors() {
        errorHandler.printErrors();
    }

    private void handleLogicalBlock(LogicalBlockNode node) {
        logicalBlockDepths++;
        visit(node.getTrueBlock());
        visit(node.getElseBlock());
        logicalBlockDepths--;
    }
}
