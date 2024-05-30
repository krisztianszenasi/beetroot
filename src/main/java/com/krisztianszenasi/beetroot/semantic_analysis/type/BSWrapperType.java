package com.krisztianszenasi.beetroot.semantic_analysis.type;

import com.krisztianszenasi.beetroot.semantic_analysis.error.TypeError;

import java.util.Objects;

public class BSWrapperType extends BSNamedType {

    BSType inner;

    public BSWrapperType(String name, BSType parent, BSType inner) {
        super(name, parent);
//        this.inner = Validate.notNull(inner, "Argument inner cannot be null!");
        this.inner = inner;
    }

    // getter, setters
    public BSType getInner() {
        return inner;
    }

    // compatibility related
    @Override
    public boolean acceptIsCompatible(BSType type) {
        return type.isCompatibleWithWrapperType(this);
    }

    @Override
    public boolean isCompatibleWithWrapperType(BSWrapperType type) {
        boolean outerTypesAreCompatible = isCompatibleWithSimpleType(type);
        boolean innerTypesAreCompatible = inner != null && inner.isCompatibleWith(type.inner);
        boolean bothInnerTypesAreNull = inner == null && type.inner == null;
        return outerTypesAreCompatible && (innerTypesAreCompatible || bothInnerTypesAreNull);
    }

    // retrieve common type related
    @Override
    public BSType acceptGetCommonType(BSType type) {
        return type.getCommonTypeWithWrapperType(this);
    }

    @Override
    public BSType getCommonTypeWithSimpleType(BSNamedType type) {
        return type.getCommonTypeWith(this);
    }

    @Override
    public BSType getCommonTypeWithWrapperType(BSWrapperType type) {
        BSType innerMostCommon = inner.getCommonTypeWith(type.inner);
        if(isCompatibleWithSimpleType(type)) {
            return type.buildWith(innerMostCommon);
        } else if(type.isCompatibleWithSimpleType(this)) {
            return buildWith(innerMostCommon);
        }
        return parent.getCommonTypeWith(type);
    }

    // build from related
    @Override
    public TypeBuildResult buildFromSimpleType(BSNamedType type) {
        TypeBuildResult buildResult = new TypeBuildResult();
        if(type.isCompatibleWith(inner)) {
            buildResult.setType(new BSWrapperType(name, parent, type));
            return buildResult;
        }
        buildResult.addError(TypeError.buildIncompatibleElementTypeError(
                name,
                inner.toString(),
                type.toString(),
                -1,
                -1
        ));
        return buildResult;
    }



    // anything else
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BSWrapperType that = (BSWrapperType) o;
        return Objects.equals(inner, that.inner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), inner);
    }



    public BSWrapperType buildWith(BSType inner) {
        return new BSWrapperType(name, parent, inner);
    }

    @Override
    public String toString() {
        String innerName = (this == inner) ? super.toString() : inner.toString();
        return String.format("%s[%s]", super.toString(), innerName);
    }
}
