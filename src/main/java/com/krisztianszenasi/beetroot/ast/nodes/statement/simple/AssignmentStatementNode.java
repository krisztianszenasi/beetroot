package com.krisztianszenasi.beetroot.ast.nodes.statement.simple;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.PrimaryExpressionNode;

import java.util.Objects;

public class AssignmentStatementNode extends SimpleStatementNode{
    PrimaryExpressionNode primary;
    ExpressionNode expression;

    public AssignmentStatementNode(PrimaryExpressionNode primary, ExpressionNode expression) {
        this.primary = primary;
        this.expression = expression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssignmentStatementNode that = (AssignmentStatementNode) o;
        return Objects.equals(primary, that.primary) && Objects.equals(expression, that.expression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primary, expression);
    }
}
