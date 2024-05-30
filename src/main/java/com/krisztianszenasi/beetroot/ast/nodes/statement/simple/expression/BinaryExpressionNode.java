package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression;


import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.Scope;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.expression_type.BSExpressionTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

import java.util.Objects;

public class BinaryExpressionNode extends ExpressionNode {

    ExpressionNode left;
    ExpressionNode right;
    String operator;

    public BinaryExpressionNode(String operator, ExpressionNode left, ExpressionNode right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    public ExpressionNode getLeft() {
        return left;
    }

    public void setLeft(ExpressionNode left) {
        this.left = left;
    }

    public ExpressionNode getRight() {
        return right;
    }

    public void setRight(ExpressionNode right) {
        this.right = right;
    }

    public String getOperator() {return  operator;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinaryExpressionNode that = (BinaryExpressionNode) o;
        return Objects.equals(left, that.left) && Objects.equals(right, that.right) && Objects.equals(operator, that.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right, operator);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitBinaryExpressionNode(this);
    }

    @Override
    public BSType accept(BSExpressionTypeBuilder builder, Scope scope) {
        return builder.getTypeForBinaryExpressionNode(this, scope);
    }
}
