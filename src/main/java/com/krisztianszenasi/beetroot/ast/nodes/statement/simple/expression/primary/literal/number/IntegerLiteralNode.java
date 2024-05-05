package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.number;

import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.Objects;

public class IntegerLiteralNode extends NumberLiteralNode{
    Integer value;

    public IntegerLiteralNode(String integerString) {
        this.value = Integer.parseInt(integerString);
    }

    public IntegerLiteralNode(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerLiteralNode that = (IntegerLiteralNode) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitIntegerLiteralNode(this);
    }
}
