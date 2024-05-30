package com.krisztianszenasi.beetroot.semantic_analysis.operator;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

import java.util.Objects;

abstract public class BSOperator {

    BSType resultType;
    String kind;

    public BSOperator(BSType resultType, String kind) {
        this.resultType = resultType;
        this.kind = kind;
    }

    public BSType getResultType() {
        return resultType;
    }

    public boolean isCompatibleWith(String kind) {
        return Objects.equals(kind, this.kind);
    }

    public abstract boolean accept(BSOperator operator);
    public boolean isCompatibleWith(BSOperator other) {
        return other.accept(this);
    }
    public boolean isCompatibleWithUnaryOperator(BSUnaryOperator other) {
        return false;
    }
    public boolean isCompatibleWithBinaryOperator(BSBinaryOperator other) {
        return false;
    }
}
