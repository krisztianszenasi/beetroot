package com.krisztianszenasi.beetroot.semnatic_analysis.type.operator;

import com.krisztianszenasi.beetroot.semnatic_analysis.type.BSType;

abstract public class BSOperator {
    BSType resultType;
    OperationKind kind;

    public BSOperator(BSType resultType, OperationKind kind) {
        this.resultType = resultType;
        this.kind = kind;
    }

    public OperationKind getKind() {
        return kind;
    }

    public BSType getResultType() {
        return resultType;
    }

    public boolean isCompatibleWith(OperationKind kind) {
        return this.kind == kind;
    }

    public abstract boolean isCompatibleWith(BSOperator other);
}
