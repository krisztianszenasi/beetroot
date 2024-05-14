package com.krisztianszenasi.beetroot.semnatic_analysis.type.operator;

import com.krisztianszenasi.beetroot.semnatic_analysis.type.BSType;
import com.krisztianszenasi.beetroot.semnatic_analysis.type.operator.BSOperator;

public class BSUnaryOperator extends BSOperator {

    BSType expressionType;

    public BSUnaryOperator(BSType resultType, OperationKind kind, BSType expressionType) {
        super(resultType, kind);
        this.expressionType = expressionType;
    }

    public BSType getExpressionType() {
        return expressionType;
    }

    public boolean isCompatibleWith(OperationKind kind, BSType type) {
        boolean kindMatches = isCompatibleWith(kind);
        boolean typesAreCompatible = type.isCompatibleWith(expressionType);

        return kindMatches && typesAreCompatible;
    }

    @Override
    public boolean isCompatibleWith(BSOperator other) {
        if(!(other instanceof BSUnaryOperator otherUnary)){
            return false;
        }
        return otherUnary.isCompatibleWith(kind, expressionType);
    }
}
