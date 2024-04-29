package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.number;

import java.util.Objects;

public class DecimalLiteralNode extends NumberLiteralNode {
    Double value;

    public DecimalLiteralNode(String decimalString) {
        this.value = Double.parseDouble(decimalString);
    }

    public DecimalLiteralNode(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DecimalLiteralNode that = (DecimalLiteralNode) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
