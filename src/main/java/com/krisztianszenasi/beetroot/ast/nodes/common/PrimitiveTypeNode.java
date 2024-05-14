package com.krisztianszenasi.beetroot.ast.nodes.common;


import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.Objects;

public class PrimitiveTypeNode extends TypeNode{
    String type;

    public PrimitiveTypeNode(String type){
        this.type = type;
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
}
