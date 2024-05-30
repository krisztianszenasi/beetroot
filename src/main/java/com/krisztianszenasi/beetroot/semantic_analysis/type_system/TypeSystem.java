package com.krisztianszenasi.beetroot.semantic_analysis.type_system;

import com.krisztianszenasi.beetroot.semantic_analysis.operator.BSBinaryOperator;
import com.krisztianszenasi.beetroot.semantic_analysis.operator.BSOperator;
import com.krisztianszenasi.beetroot.semantic_analysis.operator.BSUnaryOperator;
import com.krisztianszenasi.beetroot.semantic_analysis.type.*;
import com.krisztianszenasi.beetroot.semantic_analysis.type.names.OperatorName;
import com.krisztianszenasi.beetroot.semantic_analysis.type.names.TypeName;

import java.util.*;

public class TypeSystem {
    protected final HashMap<String, BSNamedType> types;
    protected final HashSet<BSUnaryOperator> unaryOperators;
    protected final HashSet<BSBinaryOperator> binaryOperators;
    protected final BSMultiParentType errorType;

    public TypeSystem() {
        types = new HashMap<>();
        unaryOperators = new HashSet<>();
        binaryOperators = new HashSet<>();
        this.errorType = new BSMultiParentType(TypeName.ERROR);
    }

    public boolean add(BSNamedType type) {
        if(types.containsKey(type.getName())){
            return false;
        }
        types.put(type.getName(), type);
        errorType.addParent(type);
        return true;
    }

    public BSNamedType getType(String name) {
        if(types.containsKey(name)){
            return types.get(name);
        }
        return null;
    }

    public void register(BSType type) {
        if(type != null) {
            add(new BSBinaryOperator(type, OperatorName.PLUS, type, type));
            add(new BSBinaryOperator(type, OperatorName.MULTIPLY, getType(TypeName.INT), type));
            add(new BSBinaryOperator(type, OperatorName.MULTIPLY, type, getType(TypeName.INT)));
        }
    }

    public void add(BSUnaryOperator operator) {
        unaryOperators.add(operator);
    }

    public void add(BSBinaryOperator operator) {
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

    public BSType getErrorType() {
        return errorType;
    }
}
