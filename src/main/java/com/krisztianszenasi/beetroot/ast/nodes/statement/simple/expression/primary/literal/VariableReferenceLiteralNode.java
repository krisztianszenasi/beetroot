package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal;

import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.Objects;

public class VariableReferenceLiteralNode extends LiteralExpressionNode {
    private final String name;

    public VariableReferenceLiteralNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariableReferenceLiteralNode that = (VariableReferenceLiteralNode) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitVariableReferenceLiteralNode(this);
    }
}
