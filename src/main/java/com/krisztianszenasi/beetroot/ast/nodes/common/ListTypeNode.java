package com.krisztianszenasi.beetroot.ast.nodes.common;


import java.util.Objects;

public class ListTypeNode extends CollectionTypeNode {
    TypeNode elementType;

    public ListTypeNode(TypeNode elementType) {
        this.elementType = elementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListTypeNode that = (ListTypeNode) o;
        return Objects.equals(elementType, that.elementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elementType);
    }
}
