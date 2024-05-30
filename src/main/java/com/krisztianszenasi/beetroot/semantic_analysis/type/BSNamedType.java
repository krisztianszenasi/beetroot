package com.krisztianszenasi.beetroot.semantic_analysis.type;

import java.util.Objects;

public class BSNamedType extends BSType {
    protected final String name;
    protected BSType parent;

    public BSNamedType(String name, BSType parent) {
        this.name = name;
        this.parent = parent;
    }

    // getter, setters
    public String getName() {
        return name;
    }

    // compatibility checks
    @Override
    public boolean acceptIsCompatible(BSType type) {
        return type.isCompatibleWithSimpleType(this);
    }

    @Override
    public boolean isCompatibleWithSimpleType(BSNamedType type) {
        return Objects.equals(name, type.name) || (parent != null && parent.isCompatibleWith(type));
    }

    // retrieve common types
    @Override
    public BSType acceptGetCommonType(BSType type) {
        return type.getCommonTypeWithSimpleType(this);
    }

    @Override
    public BSType getCommonTypeWithSimpleType(BSNamedType type) {
        BSType commonType = retrieveCommonTypeFromAboveOrBelow(type);
        if(commonType == null && parent != null) {
            commonType = parent.getCommonTypeWith(type);
        }
        return commonType;
    }

    @Override
    public BSType getCommonTypeWithWrapperType(BSWrapperType type) {
        if(type.isCompatibleWith(this)) {
            return this;
        }
        return parent.getCommonTypeWith(type);
    }

    @Override
    public BSType getCommonTypeWithCanBeIndexedType(BSCanBeIndexedType type) {
        return getCommonTypeWithWrapperType(type);
    }

    // build from related
    @Override
    public TypeBuildResult acceptBuildFrom(BSType type) {
        return type.buildFromSimpleType(this);
    }

    // anything else
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BSNamedType that = (BSNamedType) o;
        return Objects.equals(name, that.name) && Objects.equals(parent, that.parent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parent);
    }

    protected BSType retrieveCommonTypeFromAboveOrBelow(BSType type) {
        if(isCompatibleWith(type)) {
            return type;
        } else if(type.isCompatibleWith(this)) {
            return this;
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }
}
