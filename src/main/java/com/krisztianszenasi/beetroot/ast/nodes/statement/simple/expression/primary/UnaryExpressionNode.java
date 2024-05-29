package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary;


import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.Scope;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.expression_type.BSExpressionTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

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
        super.accept(visitor);
        return visitor.visitUnaryExpressionNode(this);
    }

    @Override
    public BSType accept(BSExpressionTypeBuilder builder, Scope scope) {
        return null;
    }
}
