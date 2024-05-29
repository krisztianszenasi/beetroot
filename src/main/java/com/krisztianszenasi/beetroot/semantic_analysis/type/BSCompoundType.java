package com.krisztianszenasi.beetroot.semantic_analysis.type;


import com.krisztianszenasi.beetroot.semantic_analysis.error.ErrorHandler;
import com.krisztianszenasi.beetroot.semantic_analysis.type_system.TypeSystem;

import java.util.Objects;

public class BSCompoundType extends BSType {
    private final BSType left;
    private final BSType right;

    public BSCompoundType(BSType left, BSType right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean acceptIsCompatible(BSType type) {
        return type.isCompatibleWithCompoundType(this);
    }

    @Override
    public boolean isCompatibleWithCompoundType(BSCompoundType type) {
        return left.isCompatibleWith(type.left) && right.isCompatibleWith(right);
    }

    @Override
    public BSType acceptGetCommonType(BSType type) {
        return type.getCommonTypeWithCompoundType(this);
    }

    @Override
    public BSType getCommonTypeWithCompoundType(BSCompoundType type) {
        return new BSCompoundType(
                left.getCommonTypeWith(type.left),
                right.getCommonTypeWith(type.right)
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BSCompoundType that = (BSCompoundType) o;
        return Objects.equals(left, that.left) && Objects.equals(right, that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    public BSType getLeft() {
        return left;
    }

    public BSType getRight() {
        return right;
    }

    @Override
    public TypeBuildResult acceptBuildFrom(BSType type) {
        return type.buildFromCompoundType(this);
    }

    @Override
    public String toString() {
        return String.format("%s, %s", left.toString(), right.toString());
    }
}
