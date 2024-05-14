package com.krisztianszenasi.beetroot.semnatic_analysis.type;

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
}
