package com.krisztianszenasi.beetroot.ast;


import com.krisztianszenasi.beetroot.ast.nodes.FileNode;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.common.*;
import com.krisztianszenasi.beetroot.ast.nodes.common.enums.Mutability;
import com.krisztianszenasi.beetroot.ast.nodes.common.enums.PrimitiveType;
import com.krisztianszenasi.beetroot.ast.nodes.statement.StatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.FunctionDefinitionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.ParameterNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.ParameterListNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.ForStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.IfStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.WhileStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.AssignmentStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.ReturnStatement;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.VariableDeclarationNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.BinaryExpression;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.FunctionCallExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.PrimaryExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.UnaryExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.BoolLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.NoneLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.StringLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.VariableReferenceLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.DictElementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.DictionaryLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.ListLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.number.DecimalLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.number.IntegerLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.number.NumberLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control.BreakFlowControlStatement;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control.ContinueFlowControlStatement;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control.FlowControlStatement;
import com.krisztianszenasi.beetroot.gen.BeetrootBaseVisitor;
import com.krisztianszenasi.beetroot.gen.BeetrootParser;

public class AstBuilder extends BeetrootBaseVisitor<Node> {

    private final BlockTracker tracker = new BlockTracker();

    @Override
    public Node visitFile(BeetrootParser.FileContext ctx) {
        return new FileNode(visitBlock(ctx.block()));
    }

    @Override
    public BlockNode visitBlock(BeetrootParser.BlockContext ctx) {
        tracker.stepInto(new BlockNode());
        super.visitBlock(ctx);
        return tracker.stepOut();
    }

    @Override
    public Node visitStatement(BeetrootParser.StatementContext ctx) {
        StatementNode statement = (StatementNode) super.visitStatement(ctx);
        tracker.addStatement(statement);
        return statement;
    }

    @Override
    public Node visitIfStatement(BeetrootParser.IfStatementContext ctx) {
        IfStatementNode ifStatement = new IfStatementNode(
                (ExpressionNode) visit(ctx.expression()),
                visitBlock(ctx.block())
        );

        IfStatementNode previousElIf = ifStatement;
        for(BeetrootParser.ElifBlockContext elIfCtx : ctx.elifBlock()) {
            IfStatementNode currentElIf = visitElifBlock(elIfCtx);
            BlockNode elseBlock = new BlockNode();
            elseBlock.addStatement(currentElIf);
            previousElIf.setElseBlock(elseBlock);
            previousElIf = currentElIf;
        }
        previousElIf.setElseBlock(visitElseBlock(ctx.elseBlock()));

        return ifStatement;
    }

    @Override
    public Node visitWhileStatement(BeetrootParser.WhileStatementContext ctx) {
        return new WhileStatementNode(
                (ExpressionNode) visit(ctx.expression()),
                visitBlock(ctx.block()),
                visitElseBlock(ctx.elseBlock())
        );
    }

    @Override
    public Node visitForStatement(BeetrootParser.ForStatementContext ctx) {
        return new ForStatementNode(
                (ExpressionNode) visit(ctx.forHeader().expression()),
                visitBlock(ctx.block()),
                visitElseBlock(ctx.elseBlock()),
                new VariableDeclarationNode(
                        Mutability.MUTABLE,
                        retrieveVariableName(ctx.forHeader().variableName()),
                        visitType(ctx.forHeader().type()),
                        null
                )
        );
    }

    @Override
    public Node visitFunctionDefinition(BeetrootParser.FunctionDefinitionContext ctx) {
        TypeNode returnType = ctx.functionReturnType() == null ? null : visitType(ctx.functionReturnType().type());
        ParameterListNode parameters = visitFunctionParameters(ctx.functionParameters());

        return new FunctionDefinitionNode(
                retrieveFunctionName(ctx.functionName()),
                returnType,
                parameters,
                visitBlock(ctx.block())
        );
    }

    @Override
    public ParameterListNode visitFunctionParameters(BeetrootParser.FunctionParametersContext ctx) {
        ParameterListNode parameters = new ParameterListNode();
        for(BeetrootParser.FunctionParameterContext paramCtx : ctx.functionParameter()) {
            parameters.addParameter(visitFunctionParameter(paramCtx));
        }
        return parameters;
    }

    @Override
    public IfStatementNode visitElifBlock(BeetrootParser.ElifBlockContext ctx) {
        return ctx == null ? null : new IfStatementNode(
                (ExpressionNode) visit(ctx.expression()),
                visitBlock(ctx.block())
        );
    }

    @Override
    public BlockNode visitElseBlock(BeetrootParser.ElseBlockContext ctx) {
        return ctx == null ? null : visitBlock(ctx.block());
    }

    @Override
    public VariableDeclarationNode visitVariableDeclaration(BeetrootParser.VariableDeclarationContext ctx) {
        return new VariableDeclarationNode(
                retrieveMutability(ctx.mutability()),
                retrieveVariableName(ctx.variableName()),
                visitDeclarationType(ctx.declarationType()),
                ctx.expression() == null ? null : (ExpressionNode) visit(ctx.expression())
        );
    }

    @Override
    public Node visitAssignmentStatement(BeetrootParser.AssignmentStatementContext ctx) {
        PrimaryExpressionNode primary = (PrimaryExpressionNode) visit(ctx.primary());

        return new AssignmentStatementNode(
                primary,
                ctx.assignment().children.get(0).toString(),
                ctx.expression() == null ? null : (ExpressionNode) visit(ctx.expression())
        );
    }

    @Override
    public TypeNode visitDeclarationType(BeetrootParser.DeclarationTypeContext ctx) {
        if(ctx == null)
            return null;
        return (TypeNode) super.visitDeclarationType(ctx);
    }

    @Override
    public Node visitParenthesizedExpression(BeetrootParser.ParenthesizedExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public UnaryExpressionNode visitUnaryExpression(BeetrootParser.UnaryExpressionContext ctx) {
        return new UnaryExpressionNode((ExpressionNode) visit(ctx.expression()));
    }

    @Override
    public FunctionCallExpressionNode visitFunctionCall(BeetrootParser.FunctionCallContext ctx) {
        FunctionCallExpressionNode functionCall = new FunctionCallExpressionNode(
            retrieveFunctionName(ctx.functionName())
        );
        for(BeetrootParser.ExpressionContext argCtx : ctx.expression()) {
            functionCall.addArgument((ExpressionNode) visit(argCtx));
        }
        return functionCall;
    }

    @Override
    public StringLiteralNode visitStringLiteral(BeetrootParser.StringLiteralContext ctx) {
        return new StringLiteralNode(ctx.STR_LIT().toString());
    }

    @Override
    public NumberLiteralNode visitNumberLiteral(BeetrootParser.NumberLiteralContext ctx) {
        if(ctx.DEC_LIT() != null) {
            return new DecimalLiteralNode(ctx.DEC_LIT().toString());
        } else {
            return new IntegerLiteralNode(ctx.INT_LIT().toString());
        }
    }

    @Override
    public ListLiteralNode visitListLiteral(BeetrootParser.ListLiteralContext ctx) {
        ListLiteralNode listLiteral = new ListLiteralNode();
        for(BeetrootParser.ExpressionContext elementCtx : ctx.expression()) {
            listLiteral.addElement((ExpressionNode) visit(elementCtx));
        }
        return listLiteral;
    }

    @Override
    public DictionaryLiteralNode visitDictLiteral(BeetrootParser.DictLiteralContext ctx) {
        DictionaryLiteralNode dictLiteral = new DictionaryLiteralNode();
        for(BeetrootParser.DictElementContext dictElementCtx : ctx.dictElement()) {
            dictLiteral.addElement((DictElementNode) visit(dictElementCtx));
        }
        return dictLiteral;
    }

    @Override
    public DictElementNode visitDictElement(BeetrootParser.DictElementContext ctx) {
        return new DictElementNode(
            (ExpressionNode) visit(ctx.key()),
            (ExpressionNode) visit(ctx.value())
        );
    }

    @Override
    public NoneLiteralNode visitNoneLiteral(BeetrootParser.NoneLiteralContext ctx) {
        return new NoneLiteralNode();
    }

    @Override
    public Node visitVariableReference(BeetrootParser.VariableReferenceContext ctx) {
        return new VariableReferenceLiteralNode(retrieveVariableName(ctx.variableName()));
    }

    @Override
    public Node visitBoolLiteral(BeetrootParser.BoolLiteralContext ctx) {
        return new BoolLiteralNode(ctx.TRUE_LIT() != null);
    }

    @Override
    public Node visitMulDivExpression(BeetrootParser.MulDivExpressionContext ctx) {
        return new BinaryExpression(
                ctx.mulDivOp().children.get(0).toString(),
                (ExpressionNode) visit(ctx.expression(0)),
                (ExpressionNode) visit(ctx.expression(1))
        );
    }

    @Override
    public Node visitAddSubExpression(BeetrootParser.AddSubExpressionContext ctx) {
        return new BinaryExpression(
                ctx.addSubOp().children.get(0).toString(),
                (ExpressionNode) visit(ctx.expression(0)),
                (ExpressionNode) visit(ctx.expression(1))
        );
    }

    @Override
    public Node visitCompairExpression(BeetrootParser.CompairExpressionContext ctx) {
        return new BinaryExpression(
                ctx.compairOp().children.get(0).toString(),
                (ExpressionNode) visit(ctx.expression(0)),
                (ExpressionNode) visit(ctx.expression(1))
        );
    }

    @Override
    public Node visitLogicalExpression(BeetrootParser.LogicalExpressionContext ctx) {
        return new BinaryExpression(
                ctx.logicalOp().children.get(0).toString(),
                (ExpressionNode) visit(ctx.expression(0)),
                (ExpressionNode) visit(ctx.expression(1))
        );
    }

    @Override
    public Node visitRangeExpression(BeetrootParser.RangeExpressionContext ctx) {
        return new BinaryExpression(
                "range",
                (ExpressionNode) visit(ctx.expression(0)),
                (ExpressionNode) visit(ctx.expression(1))
        );
    }

    @Override
    public PrimitiveTypeNode visitPrimitiveType(BeetrootParser.PrimitiveTypeContext ctx) {
        return buildPrimitiveNodeFrom(ctx);
    }

    @Override
    public CollectionTypeNode visitCollectionType(BeetrootParser.CollectionTypeContext ctx) {
        if(ctx.LIST_T() != null) {
            return buildListTypeNodeFrom(ctx);
        } else {
            return buildDictTypeNodeFrom(ctx);
        }
    }

    @Override
    public ReturnStatement visitReturnStatement(BeetrootParser.ReturnStatementContext ctx) {
        return new ReturnStatement((ExpressionNode) visit(ctx.expression()));
    }

    @Override
    public FlowControlStatement visitFlowControl(BeetrootParser.FlowControlContext ctx) {
        if(ctx.BREAK() != null) {
            return new BreakFlowControlStatement();
        } else {
            return new ContinueFlowControlStatement();
        }
    }

    @Override
    public ParameterNode visitFunctionParameter(BeetrootParser.FunctionParameterContext ctx) {
        String paramName = retrieveVariableName(ctx.variableName());
        TypeNode paramType = (TypeNode) visit(ctx.type());

        return new ParameterNode(paramName, paramType);
    }

    @Override
    public TypeNode visitType(BeetrootParser.TypeContext ctx) {
        return ctx == null ? null : (TypeNode) super.visitType(ctx);
    }

    // =================
    // Helpers TODO: probably best to move these to separate helper class or classes
    // =================

    private PrimitiveTypeNode buildPrimitiveNodeFrom(BeetrootParser.PrimitiveTypeContext ctx) {
        PrimitiveType selectedType = PrimitiveType.ANY;

        if(ctx.INT_T() != null) {
            selectedType = PrimitiveType.INT;
        }
        else if(ctx.DEC_T() != null) {
            selectedType = PrimitiveType.DEC;
        }
        else if(ctx.STR_T() != null) {
            selectedType = PrimitiveType.STR;
        }
        else if(ctx.BOOL_T() != null) {
            selectedType = PrimitiveType.BOOL;
        }
        else if(ctx.NONE_LIT() != null) {
            selectedType = PrimitiveType.NONE;
        }

        return new PrimitiveTypeNode(selectedType);
    }

    private ListTypeNode buildListTypeNodeFrom(BeetrootParser.CollectionTypeContext ctx) {
        TypeNode elementType = (TypeNode) visit(ctx.valueType());
        return new ListTypeNode(elementType);
    }

    private DictTypeNode buildDictTypeNodeFrom(BeetrootParser.CollectionTypeContext ctx) {
        TypeNode keyType = (TypeNode) visit(ctx.dictElementType().keyType());
        TypeNode valueType = (TypeNode) visit(ctx.dictElementType().valueType());
        return new DictTypeNode(keyType, valueType);
    }


    private Mutability retrieveMutability(BeetrootParser.MutabilityContext ctx) {
        if(ctx.VAL() != null) {
            return Mutability.UN_MUTABLE;
        } else {
            return Mutability.MUTABLE;
        }
    }

    private String retrieveVariableName(BeetrootParser.VariableNameContext ctx) {
        return ctx.ID().toString();
    }

    private String retrieveFunctionName(BeetrootParser.FunctionNameContext ctx) {
        return ctx.ID().toString();
    }
}
