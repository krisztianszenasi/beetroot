package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListLiteralNode extends CollectionLiteralNode{
    List<ExpressionNode> elements = new ArrayList<>();

    public void addElement(ExpressionNode element) {
        elements.add(element);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListLiteralNode that = (ListLiteralNode) o;
        return Objects.equals(elements, that.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements);
    }
}
