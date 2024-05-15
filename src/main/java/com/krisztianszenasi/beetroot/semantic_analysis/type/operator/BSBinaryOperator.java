package com.krisztianszenasi.beetroot.semantic_analysis.type.operator;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

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

    public BSType getLeftExpressionType() {
        return leftExpressionType;
    }

    public BSType getRightExpressionType() {
        return rightExpressionType;
    }

    public boolean isCompatibleWith(String kind, BSType leftType, BSType rightType) {
        boolean kindMatches = isCompatibleWith(kind);
        boolean leftsAreCompatible = leftType.isCompatibleWith(leftExpressionType);
        boolean rightsAreCompatible = rightType.isCompatibleWith(rightExpressionType);

        return kindMatches && leftsAreCompatible && rightsAreCompatible;
    }

    @Override
    public boolean isCompatibleWith(BSOperator other) {
        if(!(other instanceof BSBinaryOperator otherBinary)) {
            return false;
        }
        return otherBinary.isCompatibleWith(kind, leftExpressionType, rightExpressionType);
    }

    public boolean leftIsCompatibleWith(BSType type) {
        return leftExpressionType.isCompatibleWith(type);
    }

    public boolean rightIsCompatibleWith(BSType type) {
        return rightExpressionType.isCompatibleWith(type);
    }
}
