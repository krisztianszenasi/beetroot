package com.krisztianszenasi.beetroot.ast.visitor;


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

public class AstVisitorDefaultVoid extends AstVisitor<Void> {

    @Override
    public Void visitCompoundTypeNode(CompoundTypeNode node) {
        return null;
    }

    @Override
    public Void visitSimpleTypeNode(SimpleTypeNode node) {
        return null;
    }

    @Override
    public Void visitTypeNode(TypeNode node) {
        return null;
    }

    @Override
    public Void visitWrapperTypeNode(WrapperTypeNode node) {
        return null;
    }

    @Override
    public Void visitDeclarationBlockNode(DeclarationBlockNode node) {
        return null;
    }

    @Override
    public Void visitFunctionDefinitionNode(FunctionDefinitionNode node) {
        return null;
    }

    @Override
    public Void visitParameterListNode(ParameterListNode node) {
        return null;
    }

    @Override
    public Void visitParameterNode(ParameterNode node) {
        return null;
    }

    @Override
    public Void visitForStatementNode(ForStatementNode node) {
        return null;
    }

    @Override
    public Void visitIfStatementNode(IfStatementNode node) {
        return null;
    }

    @Override
    public Void visitLogicalBlockNode(LogicalBlockNode node) {
        return null;
    }

    @Override
    public Void visitWhileStatementNode(WhileStatementNode node) {
        return null;
    }

    @Override
    public Void visitBlockNode(BlockNode node) {
        return null;
    }

    @Override
    public Void visitCollectionLiteralNode(CollectionLiteralNode node) {
        return null;
    }

    @Override
    public Void visitDictElementNode(DictElementNode node) {
        return null;
    }

    @Override
    public Void visitDictionaryLiteralNode(DictionaryLiteralNode node) {
        return null;
    }

    @Override
    public Void visitListLiteralNode(ListLiteralNode node) {
        return null;
    }

    @Override
    public Void visitDecimalLiteralNode(DecimalLiteralNode node) {
        return null;
    }

    @Override
    public Void visitIntegerLiteralNode(IntegerLiteralNode node) {
        return null;
    }

    @Override
    public Void visitNumberLiteralNode(NumberLiteralNode node) {
        return null;
    }

    @Override
    public Void visitBoolLiteralNode(BoolLiteralNode node) {
        return null;
    }

    @Override
    public Void visitLiteralExpressionNode(LiteralExpressionNode node) {
        return null;
    }

    @Override
    public Void visitNoneLiteralNode(NoneLiteralNode node) {
        return null;
    }

    @Override
    public Void visitStringLiteralNode(StringLiteralNode node) {
        return null;
    }

    @Override
    public Void visitVariableReferenceLiteralNode(VariableReferenceLiteralNode node) {
        return null;
    }

    @Override
    public Void visitFunctionCallExpressionNode(FunctionCallExpressionNode node) {
        return null;
    }

    @Override
    public Void visitIndexedExpressionNode(IndexedExpressionNode node) {
        return null;
    }

    @Override
    public Void visitPrimaryExpressionNode(PrimaryExpressionNode node) {
        return null;
    }

    @Override
    public Void visitUnaryExpressionNode(UnaryExpressionNode node) {
        return null;
    }

    @Override
    public Void visitBinaryExpressionNode(BinaryExpressionNode node) {
        return null;
    }

    @Override
    public Void visitExpressionNode(ExpressionNode node) {
        return null;
    }

    @Override
    public Void visitBreakFlowControlStatement(BreakFlowControlStatement node) {
        return null;
    }

    @Override
    public Void visitContinueFlowControlStatement(ContinueFlowControlStatement node) {
        return null;
    }

    @Override
    public Void visitFlowControlStatement(FlowControlStatement node) {
        return null;
    }

    @Override
    public Void visitAssignmentStatementNode(AssignmentStatementNode node) {
        return null;
    }

    @Override
    public Void visitReturnStatement(ReturnStatement node) {
        return null;
    }

    @Override
    public Void visitSimpleStatementNode(SimpleStatementNode node) {
        return null;
    }

    @Override
    public Void visitVariableDeclarationNode(VariableDeclarationNode node) {
        return null;
    }

    @Override
    public Void visitStatementNode(StatementNode node) {
        return null;
    }

    @Override
    public Void visitFileNode(FileNode node) {
        return null;
    }

    @Override
    public Void visitNode(Node node) {
        return null;
    }
}
