package com.krisztianszenasi.beetroot.ast.nodes.statement.simple;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.PrimaryExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.Objects;

public class AssignmentStatementNode extends SimpleStatementNode{
    PrimaryExpressionNode primary;
    ExpressionNode expression;
    String operator;

    public AssignmentStatementNode(PrimaryExpressionNode primary, String operator, ExpressionNode expression) {
        this.primary = primary;
        this.operator = operator;
        this.expression = expression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssignmentStatementNode that = (AssignmentStatementNode) o;
        return Objects.equals(primary, that.primary) && Objects.equals(expression, that.expression) && Objects.equals(operator, that.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primary, expression, operator);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitAssignmentStatementNode(this);
    }
}
