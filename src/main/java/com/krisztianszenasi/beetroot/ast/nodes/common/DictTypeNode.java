package com.krisztianszenasi.beetroot.ast.nodes.common;


import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSDeclarationTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSTypeSystem;

import java.util.Objects;

public class DictTypeNode extends CollectionTypeNode{

    TypeNode keyType;
    TypeNode valueType;

    public DictTypeNode(TypeNode keyType, TypeNode valueType) {
        this.keyType = keyType;
        this.valueType = valueType;
    }

    public TypeNode getKeyType() {
        return keyType;
    }

    public TypeNode getValueType() {
        return valueType;
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

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitDictTypeNode(this);
    }

    @Override
    public BSType accept(BSDeclarationTypeBuilder typeBuilder, BSTypeSystem typeSystem) {
        return typeBuilder.getTypeForDictTypeNode(this, typeSystem);
    }
}
