package com.krisztianszenasi.beetroot.ast.nodes.common.type;

import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.declaration_type.BSDeclarationTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

import java.util.Objects;

public class CompoundTypeNode extends TypeNode{
    TypeNode left;
    TypeNode right;

    public CompoundTypeNode(TypeNode left, TypeNode right) {
        this.left = left;
        this.right = right;
    }

    public TypeNode getLeft() {
        return left;
    }

    public TypeNode getRight() {
        return right;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitCompoundTypeNode(this);
    }

    @Override
    public BSType accept(BSDeclarationTypeBuilder typeBuilder) {
        return typeBuilder.getTypeForCompoundTypeNode(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompoundTypeNode that = (CompoundTypeNode) o;
        return Objects.equals(left, that.left) && Objects.equals(right, that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
}
