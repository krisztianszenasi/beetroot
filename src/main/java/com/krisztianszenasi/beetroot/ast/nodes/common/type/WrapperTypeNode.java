package com.krisztianszenasi.beetroot.ast.nodes.common.type;

import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.declaration_type.BSDeclarationTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

import java.util.Objects;

public class WrapperTypeNode extends SimpleTypeNode {
    TypeNode inner;
    public WrapperTypeNode(String type, TypeNode inner) {
        super(type);
        this.inner = inner;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitWrapperTypeNode(this);
    }

    @Override
    public BSType accept(BSDeclarationTypeBuilder typeBuilder) {
        return typeBuilder.getTypeForWrapperTypeNode(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WrapperTypeNode that = (WrapperTypeNode) o;
        return Objects.equals(inner, that.inner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), inner);
    }

    public TypeNode getInner() {
        return inner;
    }
}
