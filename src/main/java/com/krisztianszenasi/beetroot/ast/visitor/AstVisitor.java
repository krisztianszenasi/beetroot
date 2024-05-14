package com.krisztianszenasi.beetroot.ast.visitor;

import com.krisztianszenasi.beetroot.ast.nodes.FileNode;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.common.DictTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.ListTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.PrimitiveTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.FunctionDefinitionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.ParameterListNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.ParameterNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.ForStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.IfStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.WhileStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.AssignmentStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.ReturnStatement;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.VariableDeclarationNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.FunctionCallExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.IndexedExpressionNode;
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
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control.BreakFlowControlStatement;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control.ContinueFlowControlStatement;

abstract public class AstVisitor<T> {

    public T visit(Node node) {
        return node.accept(this);
    }
    public abstract T visitFileNode(FileNode node);
    public abstract T visitDictElementNode(DictElementNode node);
    public abstract T visitDictionaryLiteralNode(DictionaryLiteralNode node);
    public abstract T visitListLiteralNode(ListLiteralNode node);
    public abstract T visitDecimalLiteralNode(DecimalLiteralNode node);
    public abstract T visitIntegerLiteralNode(IntegerLiteralNode node);
    public abstract T visitBoolLiteralNode(BoolLiteralNode node);
    public abstract T visitNoneLiteralNode(NoneLiteralNode node);
    public abstract T visitStringLiteralNode(StringLiteralNode node);
    public abstract T visitVariableReferenceLiteralNode(VariableReferenceLiteralNode node);
    public abstract T visitFunctionCallExpressionNode(FunctionCallExpressionNode node);
    public abstract T visitIndexedExpressionNode(IndexedExpressionNode node);
    public abstract T visitUnaryExpressionNode(UnaryExpressionNode node);
    public abstract T visitBreakFlowControlStatement(BreakFlowControlStatement node);
    public abstract T visitContinueFlowControlStatement(ContinueFlowControlStatement node);
    public abstract T visitAssignmentStatementNode(AssignmentStatementNode node);
    public abstract T visitReturnStatement(ReturnStatement node);
    public abstract T visitVariableDeclarationNode(VariableDeclarationNode node);
    public abstract T visitFunctionDefinitionNode(FunctionDefinitionNode node);
    public abstract T visitParameterListNode(ParameterListNode node);
    public abstract T visitParameterNode(ParameterNode node);
    public abstract T visitForStatementNode(ForStatementNode node);
    public abstract T visitIfStatementNode(IfStatementNode node);
    public abstract T visitWhileStatementNode(WhileStatementNode node);
    public abstract T visitBlockNode(BlockNode node);
    public abstract T visitDictTypeNode(DictTypeNode node);
    public abstract T visitListTypeNode(ListTypeNode node);
    public abstract T visitPrimitiveTypeNode(PrimitiveTypeNode node);
}
