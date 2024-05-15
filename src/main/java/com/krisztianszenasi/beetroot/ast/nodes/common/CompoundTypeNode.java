package com.krisztianszenasi.beetroot.ast.nodes.common;

import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSDeclarationTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSTypeSystem;
import com.krisztianszenasi.beetroot.semantic_analysis.type.TypeSystem;

import java.util.Objects;

public class CompoundTypeNode extends TypeNode{
    TypeNode type;
    TypeNode innerType;

    public CompoundTypeNode(TypeNode type, TypeNode innerType) {
        this.type = type;
        this.innerType = innerType;
    }

    public TypeNode getType() {
        return type;
    }

    public TypeNode getInnerType() {
        return innerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompoundTypeNode that = (CompoundTypeNode) o;
        return Objects.equals(type, that.type) && Objects.equals(innerType, that.innerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, innerType);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCompoundTypeNode(this);
    }

    @Override
    public BSType accept(BSDeclarationTypeBuilder typeBuilder, TypeSystem typeSystem) {
        return typeBuilder.getTypeForCompoundTypeNode(this, typeSystem);
    }
}
