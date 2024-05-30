package com.krisztianszenasi.beetroot.semantic_analysis.operator;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

import java.util.Objects;

public class BSUnaryOperator extends BSOperator {

    BSType expressionType;

    public BSUnaryOperator(BSType resultType, String kind, BSType expressionType) {
        super(resultType, kind);
        this.expressionType = expressionType;
    }

    public boolean isCompatibleWith(String kind, BSType typeToMatch) {
        return isCompatibleWith(kind) && typeToMatch.isCompatibleWith(expressionType);
    }

    @Override
    public boolean accept(BSOperator operator) {
        return operator.isCompatibleWithUnaryOperator(this);
    }

    @Override
    public boolean isCompatibleWithUnaryOperator(BSUnaryOperator other) {
        return Objects.equals(kind, other.kind) && expressionType.isCompatibleWith(other.expressionType);
    }
}
