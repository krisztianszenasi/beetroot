package com.krisztianszenasi.beetroot.ast.nodes.common;


import com.krisztianszenasi.beetroot.ast.nodes.common.enums.PrimitiveType;

import java.util.Objects;

public class PrimitiveTypeNode extends TypeNode{
    PrimitiveType primitiveType;

    public PrimitiveTypeNode(PrimitiveType primitiveType){
        this.primitiveType = primitiveType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrimitiveTypeNode that = (PrimitiveTypeNode) o;
        return primitiveType == that.primitiveType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(primitiveType);
    }
}
