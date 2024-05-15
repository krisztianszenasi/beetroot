package com.krisztianszenasi.beetroot.semantic_analysis.type.operator;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

import java.util.Objects;

abstract public class BSOperator {

    BSType resultType;
    String kind;

    public BSOperator(BSType resultType, String kind) {
        this.resultType = resultType;
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public BSType getResultType() {
        return resultType;
    }

    public boolean isCompatibleWith(String kind) {
        return Objects.equals(this.kind, kind);
    }

    public abstract boolean isCompatibleWith(BSOperator other);
}
