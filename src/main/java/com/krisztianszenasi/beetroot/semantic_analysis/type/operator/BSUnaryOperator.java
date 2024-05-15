package com.krisztianszenasi.beetroot.semantic_analysis.type.operator;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

public class BSUnaryOperator extends BSOperator {

    BSType expressionType;

    public BSUnaryOperator(BSType resultType, String kind, BSType expressionType) {
        super(resultType, kind);
        this.expressionType = expressionType;
    }

    public BSType getExpressionType() {
        return expressionType;
    }

    public boolean isCompatibleWith(String kind, BSType type) {
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
