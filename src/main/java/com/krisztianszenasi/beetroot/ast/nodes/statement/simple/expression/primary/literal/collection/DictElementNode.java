package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.Objects;

public class DictElementNode extends Node {
    ExpressionNode key;
    ExpressionNode value;

    public DictElementNode(ExpressionNode key, ExpressionNode value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictElementNode that = (DictElementNode) o;
        return Objects.equals(key, that.key) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitDictElementNode(this);
    }
}
