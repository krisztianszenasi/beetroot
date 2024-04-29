package com.krisztianszenasi.beetroot.ast.nodes.common;


import java.util.Objects;

public class DictTypeNode extends CollectionTypeNode{

    TypeNode keyType;
    TypeNode valueType;

    public DictTypeNode(TypeNode keyType, TypeNode valueType) {
        this.keyType = keyType;
        this.valueType = valueType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictTypeNode that = (DictTypeNode) o;
        return Objects.equals(keyType, that.keyType) && Objects.equals(valueType, that.valueType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyType, valueType);
    }
}
