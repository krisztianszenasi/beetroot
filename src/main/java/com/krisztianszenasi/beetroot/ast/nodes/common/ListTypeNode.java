package com.krisztianszenasi.beetroot.ast.nodes.common;


import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSDeclarationTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSTypeSystem;

import java.util.Objects;

public class ListTypeNode extends CollectionTypeNode {
    TypeNode elementType;

    public ListTypeNode(TypeNode elementType) {
        this.elementType = elementType;
    }

    public TypeNode getElementType() {
        return elementType;
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

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitListTypeNode(this);
    }

    @Override
    public BSType accept(BSDeclarationTypeBuilder typeBuilder, BSTypeSystem typeSystem) {
        return typeBuilder.getTypeForListTypeNode(this, typeSystem);
    }
}
