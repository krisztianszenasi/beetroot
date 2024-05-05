package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary;


import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.Objects;

public class UnaryExpressionNode extends PrimaryExpressionNode {
    ExpressionNode expression;

    public UnaryExpressionNode(ExpressionNode expression) {
        this.expression = expression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnaryExpressionNode that = (UnaryExpressionNode) o;
        return Objects.equals(expression, that.expression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expression);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitUnaryExpressionNode(this);
    }
}
