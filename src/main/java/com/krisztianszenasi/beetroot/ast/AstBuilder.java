package com.krisztianszenasi.beetroot.ast;


import com.krisztianszenasi.beetroot.ast.nodes.FileNode;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.common.*;
import com.krisztianszenasi.beetroot.ast.nodes.common.enums.Mutability;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.CompoundTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.SimpleTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.TypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.WrapperTypeNode;
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
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.BinaryExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.FunctionCallExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.IndexedExpressionNode;
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
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public class AstBuilder extends BeetrootBaseVisitor<Node> {

    private final BlockTracker tracker = new BlockTracker();

    @Override
    public Node visit(ParseTree tree) {
        if(tree == null) {
            return null;
        }

        Node result =  super.visit(tree);
        setTokenLocation(result, tree);
        return result;
    }

    @Override
    public Node visitFile(BeetrootParser.FileContext ctx) {
        return new FileNode((BlockNode) visit(ctx.block()));
    }

    @Override
    public BlockNode visitBlock(BeetrootParser.BlockContext ctx) {
        tracker.stepInto(new BlockNode());
        for(BeetrootParser.StatementContext statementCtx : ctx.statement()) {
            visit(statementCtx);
        }
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
                (BlockNode) visit(ctx.block())
        );

        IfStatementNode previousElIf = ifStatement;
        for(BeetrootParser.ElifBlockContext elIfCtx : ctx.elifBlock()) {
            IfStatementNode currentElIf = (IfStatementNode) visit(elIfCtx);
            BlockNode elseBlock = new BlockNode();
            elseBlock.addStatement(currentElIf);
            previousElIf.setElseBlock(elseBlock);
            previousElIf = currentElIf;
        }

        previousElIf.setElseBlock(safeVisit(() -> visit(ctx.elseBlock()), BlockNode.class));

        return ifStatement;
    }

    @Override
    public Node visitWhileStatement(BeetrootParser.WhileStatementContext ctx) {
        return new WhileStatementNode(
                (ExpressionNode) visit(ctx.expression()),
                (BlockNode) visit(ctx.block()),
                safeVisit(() -> visit(ctx.elseBlock()), BlockNode.class)
        );
    }

    @Override
    public Node visitForStatement(BeetrootParser.ForStatementContext ctx) {
        return new ForStatementNode(
                (ExpressionNode) visit(ctx.forHeader().expression()),
                (BlockNode) visit(ctx.block()),
                safeVisit(() -> visit(ctx.elseBlock()), BlockNode.class),
                new VariableDeclarationNode(
                        Mutability.MUTABLE,
                        getFullSource(ctx.forHeader().variableName()),
                        safeVisit(() -> visit(ctx.forHeader().type()), TypeNode.class),
                        null
                )
        );
    }

    @Override
    public Node visitFunctionDefinition(BeetrootParser.FunctionDefinitionContext ctx) {
        return new FunctionDefinitionNode(
                getFullSource(ctx.functionName()),
                safeVisit(() -> visit(ctx.functionReturnType().type()), TypeNode.class),
                (ParameterListNode) visit(ctx.functionParameters()),
                (BlockNode) visit(ctx.block())
        );
    }

    @Override
    public ParameterListNode visitFunctionParameters(BeetrootParser.FunctionParametersContext ctx) {
        ParameterListNode parameters = new ParameterListNode();
        for(BeetrootParser.FunctionParameterContext paramCtx : ctx.functionParameter()) {
            parameters.addParameter((ParameterNode) visit(paramCtx));
        }
        return parameters;
    }

    @Override
    public IfStatementNode visitElifBlock(BeetrootParser.ElifBlockContext ctx) {
        return ctx == null ? null : new IfStatementNode(
                (ExpressionNode) visit(ctx.expression()),
                (BlockNode) visit(ctx.block())
        );
    }

    @Override
    public VariableDeclarationNode visitVariableDeclaration(BeetrootParser.VariableDeclarationContext ctx) {
        return new VariableDeclarationNode(
                retrieveMutability(ctx.mutability()),
                getFullSource(ctx.variableName()),
                safeVisit(() -> visit(ctx.declarationType().type()), TypeNode.class),
                safeVisit(() -> visit(ctx.expression()), ExpressionNode.class)
        );
    }

    @Override
    public Node visitAssignmentStatement(BeetrootParser.AssignmentStatementContext ctx) {
        return new AssignmentStatementNode(
                (PrimaryExpressionNode) visit(ctx.primary()),
                getFullSource(ctx.assignment()),
                (ExpressionNode) visit(ctx.expression())
        );
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
            getFullSource(ctx.functionName())
        );
        for(BeetrootParser.ExpressionContext argCtx : ctx.expression()) {
            functionCall.addArgument((ExpressionNode) visit(argCtx));
        }
        return functionCall;
    }

    @Override
    public StringLiteralNode visitStringLiteral(BeetrootParser.StringLiteralContext ctx) {
        return new StringLiteralNode(getFullSource(ctx));
    }

    @Override
    public NumberLiteralNode visitNumberLiteral(BeetrootParser.NumberLiteralContext ctx) {
        if(ctx.DEC_LIT() != null) {
            return new DecimalLiteralNode(getFullSource(ctx));
        } else {
            return new IntegerLiteralNode(getFullSource(ctx));
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
        return new VariableReferenceLiteralNode(getFullSource(ctx.variableName()));
    }

    @Override
    public Node visitBoolLiteral(BeetrootParser.BoolLiteralContext ctx) {
        return new BoolLiteralNode(ctx.TRUE_LIT() != null);
    }

    @Override
    public Node visitMulDivExpression(BeetrootParser.MulDivExpressionContext ctx) {
        return new BinaryExpressionNode(
                getFullSource(ctx.mulDivOp()),
                (ExpressionNode) visit(ctx.expression(0)),
                (ExpressionNode) visit(ctx.expression(1))
        );
    }

    @Override
    public Node visitAddSubExpression(BeetrootParser.AddSubExpressionContext ctx) {
        return new BinaryExpressionNode(
                getFullSource(ctx.addSubOp()),
                (ExpressionNode) visit(ctx.expression(0)),
                (ExpressionNode) visit(ctx.expression(1))
        );
    }

    @Override
    public Node visitCompairExpression(BeetrootParser.CompairExpressionContext ctx) {
        return new BinaryExpressionNode(
                getFullSource(ctx.compairOp()),
                (ExpressionNode) visit(ctx.expression(0)),
                (ExpressionNode) visit(ctx.expression(1))
        );
    }

    @Override
    public Node visitLogicalExpression(BeetrootParser.LogicalExpressionContext ctx) {
        return new BinaryExpressionNode(
                getFullSource(ctx.logicalOp()),
                (ExpressionNode) visit(ctx.expression(0)),
                (ExpressionNode) visit(ctx.expression(1))
        );
    }

    @Override
    public Node visitRangeExpression(BeetrootParser.RangeExpressionContext ctx) {
        return new BinaryExpressionNode(
                "range",
                (ExpressionNode) visit(ctx.expression(0)),
                (ExpressionNode) visit(ctx.expression(1))
        );
    }

    @Override
    public SimpleTypeNode visitPrimitiveType(BeetrootParser.PrimitiveTypeContext ctx) {
        return new SimpleTypeNode(getFullSource(ctx));
    }

    @Override
    public Node visitDictType(BeetrootParser.DictTypeContext ctx) {
        return new WrapperTypeNode(
                ctx.DICT_T().toString(),
                new CompoundTypeNode(
                        (TypeNode) visit(ctx.keyType().type()),
                        (TypeNode) visit(ctx.valueType().type())
                )
        );
    }

    @Override
    public Node visitListType(BeetrootParser.ListTypeContext ctx) {
        return new WrapperTypeNode(
                ctx.LIST_T().toString(),
                (TypeNode) visit(ctx.valueType().type())
        );
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
        String paramName = getFullSource(ctx.variableName());
        TypeNode paramType = (TypeNode) visit(ctx.type());

        return new ParameterNode(paramName, paramType);
    }

    @Override
    public Node visitPrimary(BeetrootParser.PrimaryContext ctx) {
        if(ctx.primary() != null) {
            return new IndexedExpressionNode(
                    (PrimaryExpressionNode) visit(ctx.primary()),
                    (ExpressionNode) visit(ctx.expression())
            );
        }
        return super.visitPrimary(ctx);
    }

    // =================
    // Helpers
    // =================

    private Mutability retrieveMutability(BeetrootParser.MutabilityContext ctx) {
        if(ctx.VAL() != null) {
            return Mutability.UN_MUTABLE;
        } else {
            return Mutability.MUTABLE;
        }
    }

    private void setTokenLocation(Node node, ParseTree tree) {
        if (tree instanceof ParserRuleContext context && node != null) {
            Token startToken = context.getStart();
            int line = startToken.getLine();
            int column = startToken.getCharPositionInLine();
            node.setPosition(line, column);
        }
    }

    private String getFullSource(ParserRuleContext context) {
        CharStream cs = context.start.getTokenSource().getInputStream();
        int stopIndex = context.stop != null ? context.stop.getStopIndex() : -1;
        return cs.getText(new Interval(context.start.getStartIndex(), stopIndex));
    }

    private <T extends Node> T safeVisit(Callable<Node> callable, Class<T> resultClass) {
        try {
            return resultClass.cast(callable.call());
        } catch (Exception e) {
            return null;
        }
    }
}
