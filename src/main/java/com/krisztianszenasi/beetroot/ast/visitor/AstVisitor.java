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

import java.util.Objects;

abstract public class AstVisitor<T> {

    public T visit(Node node) {
        if(node != null) {
            return node.accept(this);
        }
        return null;
    }
    public abstract T visitCompoundTypeNode(CompoundTypeNode node);
    public abstract T visitSimpleTypeNode(SimpleTypeNode node);
    public abstract T visitTypeNode(TypeNode node);
    public abstract T visitWrapperTypeNode(WrapperTypeNode node);
    public abstract T visitDeclarationBlockNode(DeclarationBlockNode node);
    public abstract T visitFunctionDefinitionNode(FunctionDefinitionNode node);
    public abstract T visitParameterListNode(ParameterListNode node);
    public abstract T visitParameterNode(ParameterNode node);
    public abstract T visitForStatementNode(ForStatementNode node);
    public abstract T visitIfStatementNode(IfStatementNode node);
    public abstract T visitLogicalBlockNode(LogicalBlockNode node);
    public abstract T visitWhileStatementNode(WhileStatementNode node);
    public abstract T visitBlockNode(BlockNode node);
    public abstract T visitCollectionLiteralNode(CollectionLiteralNode node);
    public abstract T visitDictElementNode(DictElementNode node);
    public abstract T visitDictionaryLiteralNode(DictionaryLiteralNode node);
    public abstract T visitListLiteralNode(ListLiteralNode node);
    public abstract T visitDecimalLiteralNode(DecimalLiteralNode node);
    public abstract T visitIntegerLiteralNode(IntegerLiteralNode node);
    public abstract T visitNumberLiteralNode(NumberLiteralNode node);
    public abstract T visitBoolLiteralNode(BoolLiteralNode node);
    public abstract T visitLiteralExpressionNode(LiteralExpressionNode node);
    public abstract T visitNoneLiteralNode(NoneLiteralNode node);
    public abstract T visitStringLiteralNode(StringLiteralNode node);
    public abstract T visitVariableReferenceLiteralNode(VariableReferenceLiteralNode node);
    public abstract T visitFunctionCallExpressionNode(FunctionCallExpressionNode node);
    public abstract T visitIndexedExpressionNode(IndexedExpressionNode node);
    public abstract T visitPrimaryExpressionNode(PrimaryExpressionNode node);
    public abstract T visitUnaryExpressionNode(UnaryExpressionNode node);
    public abstract T visitBinaryExpressionNode(BinaryExpressionNode node);
    public abstract T visitExpressionNode(ExpressionNode node);
    public abstract T visitBreakFlowControlStatement(BreakFlowControlStatement node);
    public abstract T visitContinueFlowControlStatement(ContinueFlowControlStatement node);
    public abstract T visitFlowControlStatement(FlowControlStatement node);
    public abstract T visitAssignmentStatementNode(AssignmentStatementNode node);
    public abstract T visitReturnStatement(ReturnStatement node);
    public abstract T visitSimpleStatementNode(SimpleStatementNode node);
    public abstract T visitVariableDeclarationNode(VariableDeclarationNode node);
    public abstract T visitStatementNode(StatementNode node);
    public abstract T visitFileNode(FileNode node);
    public abstract T visitNode(Node node);
}
