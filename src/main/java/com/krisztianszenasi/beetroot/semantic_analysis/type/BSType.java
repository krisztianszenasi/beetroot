package com.krisztianszenasi.beetroot.semantic_analysis.type;


abstract public class BSType {
    public abstract boolean acceptIsCompatible(BSType type);
    public boolean isCompatibleWith(BSType type) {
        if(equals(type)) {
            return true;
        }
        return type != null && type.acceptIsCompatible(this);
    }
    public boolean isCompatibleWithSimpleType(BSNamedType type) {
        return false;
    }
    public boolean isCompatibleWithCompoundType(BSCompoundType type) {
        return false;
    }
    public boolean isCompatibleWithWrapperType(BSWrapperType type) { return false; }
    public boolean isCompatibleWithCanBeIndexedType(BSCanBeIndexedType type) { return false; }

    public abstract BSType acceptGetCommonType(BSType type);
    public BSType getCommonTypeWith(BSType type) {
        if(equals(type)) {
            return type;
        }
        if(type != null) {
            return type.acceptGetCommonType(this);
        }
        return null;
    }
    public BSType getCommonTypeWithSimpleType(BSNamedType type) {
        return null;
    }
    public BSType getCommonTypeWithWrapperType(BSWrapperType type) {
        return null;
    }
    public BSType getCommonTypeWithCompoundType(BSCompoundType type) {
        return null;
    }
    public BSType getCommonTypeWithCanBeIndexedType(BSCanBeIndexedType type) { return null; }


    public TypeBuildResult acceptBuildFrom(BSType type) { return null; }
    public TypeBuildResult buildFrom(BSType type) {
        return type.acceptBuildFrom(this);
    }
    public TypeBuildResult buildFromSimpleType(BSNamedType type) {
        return null;
    }
    public TypeBuildResult buildFromCompoundType(BSCompoundType type) {
        return null;
    }
}
