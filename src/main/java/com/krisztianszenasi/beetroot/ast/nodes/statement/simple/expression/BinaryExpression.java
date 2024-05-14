package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression;


import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.Objects;

public class BinaryExpression extends ExpressionNode {

    ExpressionNode left;
    ExpressionNode right;
    String operator;

    public BinaryExpression(String operator, ExpressionNode left, ExpressionNode right) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinaryExpression that = (BinaryExpression) o;
        return Objects.equals(left, that.left) && Objects.equals(right, that.right) && Objects.equals(operator, that.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right, operator);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return null;
    }
}
