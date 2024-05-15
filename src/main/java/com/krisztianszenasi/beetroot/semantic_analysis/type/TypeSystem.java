package com.krisztianszenasi.beetroot.semantic_analysis.type;

import com.krisztianszenasi.beetroot.semantic_analysis.type.operator.BSBinaryOperator;
import com.krisztianszenasi.beetroot.semantic_analysis.type.operator.BSOperator;
import com.krisztianszenasi.beetroot.semantic_analysis.type.operator.BSUnaryOperator;
import com.krisztianszenasi.beetroot.semantic_analysis.type.operator.OperationKind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TypeSystem {
    protected final HashMap<String, BSSimpleType> types;
    protected final HashSet<BSUnaryOperator> unaryOperators;
    protected final HashSet<BSBinaryOperator> binaryOperators;
    protected final BSSimpleType ERROR;

    public TypeSystem(BSSimpleType errorType) {
        types = new HashMap<>();
        unaryOperators = new HashSet<>();
        binaryOperators = new HashSet<>();
        this.ERROR = errorType;
    }


    public BSSimpleType getType(String name) {
        if(types.containsKey(name)){
            return types.get(name);
        }
        return ERROR;
    }

    public boolean addType(BSSimpleType type) {
        if(!types.containsKey(type.getName())) {
            types.put(type.getName(), type);
            return true;
        }
        return  false;
    }

    public void addUnary(BSUnaryOperator operator) {
        unaryOperators.add(operator);
    }

    public void addBinary(BSBinaryOperator operator) {
        binaryOperators.add(operator);
    }


    public BSOperator getBinaryFor(String kind, BSType leftType, BSType rightType) {
        return getMostSpecificFrom(getBinaryOperatorsFor(kind, leftType, rightType));
    }

    public BSOperator getUnaryFor(String kind, BSType type) {
        return getMostSpecificFrom(getUnaryOperatorsFor(kind, type));
    }

    private BSOperator getMostSpecificFrom(List<BSOperator> operators) {
        BSOperator mostSpecific = null;
        int highestCompCount = 0;
        for(BSOperator currentOperator: operators) {
            int compCount = 0;
            for(BSOperator otherOperator: operators) {
                if(currentOperator.isCompatibleWith(otherOperator)) {
                    compCount++;
                }
            }
            if(compCount > highestCompCount) {
                mostSpecific = currentOperator;
                highestCompCount = compCount;
            }
        }
        return mostSpecific;
    }

    private List<BSOperator> getUnaryOperatorsFor(String kind, BSType type) {
        List<BSOperator> operators = new ArrayList<>();
        for(BSUnaryOperator operator : unaryOperators) {
            if(operator.isCompatibleWith(kind, type)) {
                operators.add(operator);
            }
        }
        return operators;
    }

    private List<BSOperator> getBinaryOperatorsFor(String kind, BSType leftType, BSType rightType) {
        List<BSOperator> operators = new ArrayList<>();
        for(BSBinaryOperator operator : binaryOperators) {
            if(operator.isCompatibleWith(kind, leftType, rightType)) {
                operators.add(operator);
            }
        }
        return operators;
    }
}
