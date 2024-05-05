package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal;

import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.Objects;

public class BoolLiteralNode extends LiteralExpressionNode {
    private final Boolean value;

    public BoolLiteralNode(String boolString) {
        this.value = Boolean.parseBoolean(boolString);
    }

    public BoolLiteralNode(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoolLiteralNode that = (BoolLiteralNode) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitBoolLiteralNode(this);
    }
}
