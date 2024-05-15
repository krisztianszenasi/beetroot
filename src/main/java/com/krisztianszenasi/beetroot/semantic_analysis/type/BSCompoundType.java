package com.krisztianszenasi.beetroot.semantic_analysis.type;

import java.util.Objects;

public class BSCompoundType extends BSType {
    private final BSType type;
    private final BSType innerType;

    public BSCompoundType(BSType type, BSType innerType) {
        this.type = type;
        this.innerType = innerType;
    }

    @Override
    public boolean isCompatibleWith(BSType otherType) {
        if(type.isCompatibleWith(otherType)) {
            if(otherType instanceof BSCompoundType otherCompound) {
                return innerType.isCompatibleWith(otherCompound.innerType);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BSCompoundType that = (BSCompoundType) o;
        return Objects.equals(type, that.type) && Objects.equals(innerType, that.innerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, innerType);
    }
}
