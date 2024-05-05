package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal;

import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.Objects;

public class StringLiteralNode extends LiteralExpressionNode {
    String value;

    public StringLiteralNode(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringLiteralNode that = (StringLiteralNode) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitStringLiteralNode(this);
    }
}
