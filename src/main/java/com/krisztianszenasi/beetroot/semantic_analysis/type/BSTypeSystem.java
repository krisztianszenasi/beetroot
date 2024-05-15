package com.krisztianszenasi.beetroot.semantic_analysis.type;

import com.krisztianszenasi.beetroot.semantic_analysis.type.operator.BSBinaryOperator;
import com.krisztianszenasi.beetroot.semantic_analysis.type.operator.BSOperator;
import com.krisztianszenasi.beetroot.semantic_analysis.type.operator.BSUnaryOperator;
import com.krisztianszenasi.beetroot.semantic_analysis.type.operator.OperationKind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class BSTypeSystem extends TypeSystem{


    protected BSTypeSystem(BSSimpleType errorType) {
        super(errorType);
    }

    private void initializeTypes() {
//        ERROR = new BSSimpleType("error");
//        ANY = new BSSimpleType("any");
//        NONE = new BSSimpleType("none");
//        DEC = new BSSimpleType("dec");
//        INT = new BSSimpleType("int");
//        BOOL = new BSSimpleType("bool");
//        STR = new BSSimpleType("str");
//        LIST = new BSSimpleType("list");
//        DICT = new BSSimpleType("dict");
//
//        ANY.addParent(ERROR);
//        NONE.addParent(ANY);
//        DEC.addParent(NONE);
//        INT.addParent(DEC);
//        BOOL.addParent(INT);
//        STR.addParent(NONE);
//        LIST.addParent(NONE);
//        DICT.addParent(NONE);
//
//        types.put(ANY.getName(), ANY);
//        types.put(NONE.getName(), NONE);
//        types.put(DEC.getName(), DEC);
//        types.put(INT.getName(), INT);
//        types.put(BOOL.getName(), BOOL);
//        types.put(STR.getName(), STR);
//        types.put(LIST.getName(), LIST);
//        types.put(DICT.getName(), DICT);
    }

    private void initializeOperators() {
        initializeBinaryOperators();
        initializeUnaryOperators();
    }


    private void initializeBinaryOperators() {
//        // integer operators
//        binaryOperators.add(new BSBinaryOperator(INT, OperationKind.PLUS, INT, INT));
//        binaryOperators.add(new BSBinaryOperator(INT, OperationKind.MINUS, INT, INT));
//        binaryOperators.add(new BSBinaryOperator(INT, OperationKind.MULTIPLY, INT, INT));
//        binaryOperators.add(new BSBinaryOperator(INT, OperationKind.DIVIDE, INT, INT));
//
//        // decimal operators
//        binaryOperators.add(new BSBinaryOperator(DEC, OperationKind.PLUS, DEC, DEC));
//        binaryOperators.add(new BSBinaryOperator(DEC, OperationKind.MINUS, DEC, DEC));
//        binaryOperators.add(new BSBinaryOperator(DEC, OperationKind.MULTIPLY, DEC, DEC));
//        binaryOperators.add(new BSBinaryOperator(DEC, OperationKind.DIVIDE, DEC, DEC));
//
//        // str operators
//        binaryOperators.add(new BSBinaryOperator(STR, OperationKind.PLUS, STR, STR));
//        binaryOperators.add(new BSBinaryOperator(STR, OperationKind.MULTIPLY, STR, INT));
//        binaryOperators.add(new BSBinaryOperator(STR, OperationKind.MULTIPLY, INT, STR));
//
//        // bool operators
//        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.AND, ANY, ANY));
//        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.OR, ANY, ANY));
//        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.EQUALS, ANY, ANY));
//        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.NOT_EQUALS, ANY, ANY));
//        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.GT, ANY, ANY));
//        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.GTE, ANY, ANY));
//        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.LT, ANY, ANY));
//        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.LTE, ANY, ANY));
//        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.IN, STR, STR));
//        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.IN, ANY, LIST));
//        binaryOperators.add(new BSBinaryOperator(BOOL, OperationKind.IN, ANY, DICT));
//
//        // list operators
//        binaryOperators.add(new BSBinaryOperator(LIST, OperationKind.PLUS, LIST, LIST));
    }

    private void initializeUnaryOperators() {

    }
}
