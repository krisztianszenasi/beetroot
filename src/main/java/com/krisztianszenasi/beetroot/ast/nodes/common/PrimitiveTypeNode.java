package com.krisztianszenasi.beetroot.ast.nodes.common;


import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSDeclarationTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSTypeSystem;
import com.krisztianszenasi.beetroot.semantic_analysis.type.TypeSystem;

import java.util.Objects;

public class PrimitiveTypeNode extends TypeNode{
    String type;

    public PrimitiveTypeNode(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrimitiveTypeNode that = (PrimitiveTypeNode) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitPrimitiveTypeNode(this);
    }

    @Override
    public BSType accept(BSDeclarationTypeBuilder typeBuilder, TypeSystem typeSystem) {
        return typeBuilder.getTypeForPrimitiveTypeNode(this, typeSystem);
    }
}
