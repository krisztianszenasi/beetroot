package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.binary;


import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;

import java.util.Objects;

abstract public class BinaryExpression extends ExpressionNode {

    ExpressionNode left;
    ExpressionNode right;

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
        return Objects.equals(left, that.left) && Objects.equals(right, that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
}
