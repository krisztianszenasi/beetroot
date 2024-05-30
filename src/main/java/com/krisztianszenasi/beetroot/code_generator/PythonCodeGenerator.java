package com.krisztianszenasi.beetroot.code_generator;


import com.krisztianszenasi.beetroot.ast.nodes.FileNode;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.CompoundTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.SimpleTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.TypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.WrapperTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.StatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.DeclarationBlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.FunctionDefinitionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.ParameterListNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.ParameterNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.ForStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.IfStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.LogicalBlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.WhileStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.AssignmentStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.ReturnStatement;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.SimpleStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.VariableDeclarationNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.BinaryExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.FunctionCallExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.IndexedExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.PrimaryExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.UnaryExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.*;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.CollectionLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.DictElementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.DictionaryLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.ListLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.number.DecimalLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.number.IntegerLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.number.NumberLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control.BreakFlowControlStatement;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control.ContinueFlowControlStatement;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control.FlowControlStatement;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.Objects;
import java.util.stream.Collectors;

public class PythonCodeGenerator extends CodeGenerator {

    private int tabCount = -1;

    @Override
    public String visitFunctionDefinitionNode(FunctionDefinitionNode node) {
        return String.format(
                "def %s(%s):\n%s",
                node.getName(),
                visit(node.getParameters()),
                visit(node.getBlock())
        );
    }

    @Override
    public String visitParameterListNode(ParameterListNode node) {
        return node.getParameters().stream().map(ParameterNode::getName).collect(Collectors.joining(", "));
    }

    @Override
    public String visitForStatementNode(ForStatementNode node) {
        StringBuilder code = new StringBuilder();
        code.append(String.format(
                "for %s in %s:\n%s",
                node.getVarDeclaration().getVariableName(),
                visit(node.getExpression()),
                visit(node.getTrueBlock())
        ));
        if(node.getElseBlock() != null) {
            code.append(String.format("else:\n%s", visit(node.getElseBlock())));
        }
        return code.toString();
    }

    @Override
    public String visitIfStatementNode(IfStatementNode node) {
        StringBuilder code = new StringBuilder();
        code.append(String.format(
                "if %s:\n%s",
                visit(node.getExpression()),
                visit(node.getTrueBlock())
        ));
        if(node.getElseBlock() != null) {
            code.append(String.format("else:\n%s", visit(node.getElseBlock())));
        }
        return code.toString();
    }

    @Override
    public String visitLogicalBlockNode(LogicalBlockNode node) {
        return null;
    }

    @Override
    public String visitWhileStatementNode(WhileStatementNode node) {
        StringBuilder code = new StringBuilder();
        code.append(String.format(
                "while %s:\n%s",
                visit(node.getExpression()),
                visit(node.getTrueBlock())
        ));
        if(node.getElseBlock() != null) {
            code.append(String.format("else:\n%s", visit(node.getElseBlock())));
        }
        return code.toString();
    }

    @Override
    public String visitBlockNode(BlockNode node) {
        StringBuilder blockCode = new StringBuilder();
        tabCount++;
        String tabs = String.join("", java.util.Collections.nCopies(tabCount, "\t"));
        for(StatementNode statement : node.getStatements()) {
            blockCode.append(
                    String.format(
                            "%s%s\n",
                            tabs,
                            visit(statement)
                    )
            );
        }
        tabCount--;
        return blockCode.toString();
    }

    @Override
    public String visitCollectionLiteralNode(CollectionLiteralNode node) {
        return null;
    }

    @Override
    public String visitDictElementNode(DictElementNode node) {
        return String.format(
                "%s: %s",
                visit(node.getKey()),
                visit(node.getValue())
        );
    }

    @Override
    public String visitDictionaryLiteralNode(DictionaryLiteralNode node) {
        return String.format(
                "{%s}",
                node.getElements().stream().map(this::visit).collect(Collectors.joining(", "))
        );
    }

    @Override
    public String visitListLiteralNode(ListLiteralNode node) {
        return String.format(
                "[%s]",
                node.getElements().stream().map(this::visit).collect(Collectors.joining(", "))
        );
    }

    @Override
    public String visitDecimalLiteralNode(DecimalLiteralNode node) {
        return node.getValue().toString();
    }

    @Override
    public String visitIntegerLiteralNode(IntegerLiteralNode node) {
        return node.getValue().toString();
    }

    @Override
    public String visitNumberLiteralNode(NumberLiteralNode node) {
        return null;
    }

    @Override
    public String visitBoolLiteralNode(BoolLiteralNode node) {
        String lowercase = node.getValue().toString();
        return lowercase.substring(0, 1).toUpperCase() + lowercase.substring(1);
    }

    @Override
    public String visitLiteralExpressionNode(LiteralExpressionNode node) {
        return null;
    }

    @Override
    public String visitNoneLiteralNode(NoneLiteralNode node) {
        return "None";
    }

    @Override
    public String visitStringLiteralNode(StringLiteralNode node) {
        return node.getValue();
    }

    @Override
    public String visitVariableReferenceLiteralNode(VariableReferenceLiteralNode node) {
        return node.getName();
    }

    @Override
    public String visitFunctionCallExpressionNode(FunctionCallExpressionNode node) {
        return String.format(
                "%s(%s)",
                node.getFunctionName(),
                node.getArguments().stream().map(this::visit).collect(Collectors.joining(", "))
        );
    }

    @Override
    public String visitIndexedExpressionNode(IndexedExpressionNode node) {
        return String.format(
                "%s[%s]",
                visit(node.getIndexed()),
                visit(node.getIndexPosition())
        );
    }

    @Override
    public String visitPrimaryExpressionNode(PrimaryExpressionNode node) {
        return null;
    }

    @Override
    public String visitUnaryExpressionNode(UnaryExpressionNode node) {
        return null;
    }

    @Override
    public String visitBinaryExpressionNode(BinaryExpressionNode node) {
        if(!Objects.equals(node.getOperator(), "range")) {
            return String.format(
                    "%s %s %s",
                    visit(node.getLeft()),
                    node.getOperator(),
                    visit(node.getRight())
            );
        }
        return String.format(
                "range(%s, %s)",
                visit(node.getLeft()),
                visit(node.getRight())
        );
    }

    @Override
    public String visitExpressionNode(ExpressionNode node) {
        return null;
    }

    @Override
    public String visitBreakFlowControlStatement(BreakFlowControlStatement node) {
        return "break";
    }

    @Override
    public String visitContinueFlowControlStatement(ContinueFlowControlStatement node) {
        return "continue";
    }

    @Override
    public String visitFlowControlStatement(FlowControlStatement node) {
        return null;
    }

    @Override
    public String visitAssignmentStatementNode(AssignmentStatementNode node) {
        return String.format(
                "%s %s %s",
                visit(node.getPrimary()),
                node.getOperator(),
                visit(node.getExpression())
        );
    }

    @Override
    public String visitReturnStatement(ReturnStatement node) {
        return String.format("return %s", visit(node.getExpressionNode()));
    }

    @Override
    public String visitSimpleStatementNode(SimpleStatementNode node) {
        return null;
    }

    @Override
    public String visitVariableDeclarationNode(VariableDeclarationNode node) {
        if(node.getInitialValue() != null) {
            return String.format(
                    "%s = %s",
                    node.getVariableName(),
                    visit(node.getInitialValue())
            );
        }
        return node.getVariableName();
    }

    @Override
    public String visitStatementNode(StatementNode node) {
        return null;
    }

    @Override
    public String visitFileNode(FileNode node) {
        return super.visitFileNode(node) + visit(node.getBlock());
    }

    @Override
    public String visitNode(Node node) {
        return null;
    }

    @Override
    public String visitCompoundTypeNode(CompoundTypeNode node) {
        return null;
    }

    @Override
    public String visitSimpleTypeNode(SimpleTypeNode node) {
        return null;
    }

    @Override
    public String visitTypeNode(TypeNode node) {
        return null;
    }

    @Override
    public String visitWrapperTypeNode(WrapperTypeNode node) {
        return null;
    }

    @Override
    public String visitDeclarationBlockNode(DeclarationBlockNode node) {
        return null;
    }

    @Override
    public String visitParameterNode(ParameterNode node) {
        return null;
    }

    @Override
    public String buildFilename(String filename) {
        return filename + ".py";
    }

    @Override
    public String getCommentChars() {
        return "#";
    }
}
