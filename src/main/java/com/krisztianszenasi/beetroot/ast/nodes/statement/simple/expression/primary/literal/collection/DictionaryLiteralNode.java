package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DictionaryLiteralNode extends CollectionLiteralNode {
    List<DictElementNode> elements = new ArrayList<>();

    public void addElement(DictElementNode element) {
        elements.add(element);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictionaryLiteralNode that = (DictionaryLiteralNode) o;
        return Objects.equals(elements, that.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements);
    }
}
