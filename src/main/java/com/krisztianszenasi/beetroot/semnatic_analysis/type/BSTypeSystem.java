package com.krisztianszenasi.beetroot.semnatic_analysis.type;

import com.krisztianszenasi.beetroot.semnatic_analysis.type.operator.BSBinaryOperator;
import com.krisztianszenasi.beetroot.semnatic_analysis.type.operator.BSOperator;
import com.krisztianszenasi.beetroot.semnatic_analysis.type.operator.BSUnaryOperator;
import com.krisztianszenasi.beetroot.semnatic_analysis.type.operator.OperationKind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class BSTypeSystem {
    private final HashMap<String, BSSimpleType> types;
    private final HashSet<BSUnaryOperator> unaryOperators;
    private final HashSet<BSBinaryOperator> binaryOperators;

    public BSTypeSystem() {
        types = new HashMap<>();
        unaryOperators = new HashSet<>();
        binaryOperators = new HashSet<>();
        initializeTypes();
        initializeOperators();
    }

    private void initializeTypes() {
        ERROR = new BSSimpleType("error");
        ANY = new BSSimpleType("any");
        NONE = new BSSimpleType("none");
        DEC = new BSSimpleType("dec");
        INT = new BSSimpleType("int");
        BOOL = new BSSimpleType("bool");
        STR = new BSSimpleType("str");
        LIST = new BSSimpleType("list");
        DICT = new BSSimpleType("dict");

        ANY.addParent(ERROR);
        NONE.addParent(ANY);
        DEC.addParent(NONE);
        INT.addParent(DEC);
        BOOL.addParent(INT);
        STR.addParent(NONE);
        LIST.addParent(NONE);
        DICT.addParent(NONE);

        types.put(ANY.getName(), ANY);
        types.put(NONE.getName(), NONE);
        types.put(DEC.getName(), DEC);
        types.put(INT.getName(), INT);
        types.put(BOOL.getName(), BOOL);
        types.put(STR.getName(), STR);
        types.put(LIST.getName(), LIST);
        types.put(DICT.getName(), DICT);
    }

    private void initializeOperators() {
        initializeBinaryOperators();
        initializeUnaryOperators();
    }


    private void initializeBinaryOperators() {
        // integer operators
        binaryOperators.add(new BSBinaryOperator(INT, OperationKind.PLUS, INT, INT));
        binaryOperators.add(new BSBinaryOperator(INT, OperationKind.MINUS, INT, INT));
        binaryOperators.add(new BSBinaryOperator(INT, OperationKind.MULTIPLY, INT, INT));
        binaryOperators.add(new BSBinaryOperator(INT, OperationKind.DIVIDE, INT, INT));

        // decimal operators
        binaryOperators.add(new BSBinaryOperator(DEC, OperationKind.PLUS, DEC, DEC));
        binaryOperators.add(new BSBinaryOperator(DEC, OperationKind.MINUS, DEC, DEC));
        binaryOperators.add(new BSBinaryOperator(DEC, OperationKind.MULTIPLY, DEC, DEC));
        binaryOperators.add(new BSBinaryOperator(DEC, OperationKind.DIVIDE, DEC, DEC));

        // str operators
        binaryOperators.add(new BSBinaryOperator(STR, OperationKind.PLUS, STR, STR));
        binaryOperators.add(new BSBinaryOperator(STR, OperationKind.MULTIPLY, STR, INT));
        binaryOperators.add(new BSBinaryOperator(STR, OperationKind.MULTIPLY, INT, STR));

        // bool operators
        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.AND, ANY, ANY));
        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.OR, ANY, ANY));
        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.EQUALS, ANY, ANY));
        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.NOT_EQUALS, ANY, ANY));
        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.GT, ANY, ANY));
        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.GTE, ANY, ANY));
        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.LT, ANY, ANY));
        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.LTE, ANY, ANY));
        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.IN, STR, STR));
        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.IN, ANY, LIST));
        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.IN, ANY, DICT));

        // list operators
        binaryOperators.add(new BSBinaryOperator(LIST, OperationKind.PLUS, LIST, LIST));
    }

    private void initializeUnaryOperators() {

    }

    BSSimpleType INT;
    BSSimpleType DEC;
    BSSimpleType STR;
    BSSimpleType BOOL;
    BSSimpleType NONE;
    BSSimpleType ANY;
    BSSimpleType DICT;
    BSSimpleType LIST;
    BSSimpleType ERROR;

    public BSSimpleType getType(String name) {
        if(types.containsKey(name)){
            return types.get(name);
        }
        return null;
    }


    public BSOperator getBinaryFor(OperationKind kind, BSType leftType, BSType rightType) {
        return getMostSpecificFrom(getBinaryOperatorsFor(kind, leftType, rightType));
    }

    public BSOperator getUnaryFor(OperationKind kind, BSType type) {
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

    private List<BSOperator> getUnaryOperatorsFor(OperationKind kind, BSType type) {
        List<BSOperator> operators = new ArrayList<>();
        for(BSUnaryOperator operator : unaryOperators) {
            if(operator.isCompatibleWith(kind, type)) {
                operators.add(operator);
            }
        }
        return operators;
    }

    private List<BSOperator> getBinaryOperatorsFor(OperationKind kind, BSType leftType, BSType rightType) {
        List<BSOperator> operators = new ArrayList<>();
        for(BSBinaryOperator operator : binaryOperators) {
            if(operator.isCompatibleWith(kind, leftType, rightType)) {
                operators.add(operator);
            }
        }
        return operators;
    }
}
