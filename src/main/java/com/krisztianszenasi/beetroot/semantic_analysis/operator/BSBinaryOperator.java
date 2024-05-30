package com.krisztianszenasi.beetroot.semantic_analysis.operator;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

import java.util.Objects;

public class BSBinaryOperator extends BSOperator {
    BSType leftExpressionType;
    BSType rightExpressionType;

    public BSBinaryOperator(
            BSType resultType,
            String kind,
            BSType leftExpressionType,
            BSType rightExpressionType
    ) {
        super(resultType, kind);
        this.leftExpressionType = leftExpressionType;
        this.rightExpressionType = rightExpressionType;
    }

    public boolean isCompatibleWith(String kind, BSType leftType, BSType rightType) {
        boolean leftIsCompatible = leftType.isCompatibleWith(leftExpressionType);
        boolean rightIsCompatible = rightType.isCompatibleWith(rightExpressionType);
        return isCompatibleWith(kind) && leftIsCompatible && rightIsCompatible;
    }

    @Override
    public boolean accept(BSOperator operator) {
        return operator.isCompatibleWithBinaryOperator(this);
    }

    @Override
    public boolean isCompatibleWithBinaryOperator(BSBinaryOperator other) {
        boolean kindMatches = Objects.equals(kind, other.kind);
        boolean leftIsCompatible = leftExpressionType.isCompatibleWith(other.leftExpressionType);
        boolean rightIsCompatible = rightExpressionType.isCompatibleWith(other.rightExpressionType);
        return kindMatches && leftIsCompatible && rightIsCompatible;
    }
}
