package com.krisztianszenasi.beetroot.ast.nodes.common.type;


import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.declaration_type.BSDeclarationTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

import java.util.Objects;

public class SimpleTypeNode extends TypeNode{
    String type;

    public SimpleTypeNode(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleTypeNode that = (SimpleTypeNode) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitSimpleTypeNode(this);
    }

    @Override
    public BSType accept(BSDeclarationTypeBuilder typeBuilder) {
        return typeBuilder.getTypeForSimpleTypeNode(this);
    }
}
