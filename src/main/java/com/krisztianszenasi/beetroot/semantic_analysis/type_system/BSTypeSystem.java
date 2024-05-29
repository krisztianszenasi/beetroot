package com.krisztianszenasi.beetroot.semantic_analysis.type_system;

import com.krisztianszenasi.beetroot.semantic_analysis.operator.BSBinaryOperator;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSCanBeIndexedType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSNamedType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.names.OperatorName;
import com.krisztianszenasi.beetroot.semantic_analysis.type.names.TypeName;

public class BSTypeSystem extends TypeSystem{

    private BSNamedType ANY;
    private BSNamedType NUM;
    private BSNamedType DEC;
    private BSNamedType INT;
    private BSNamedType BOOL;
    private BSNamedType STR;
    private BSNamedType LIST;
    private BSNamedType DICT;


    public BSTypeSystem() {
        super();
        initializeTypes();
        initializeBinaryOperators();
    }

    private void initializeTypes() {
        ANY = new BSNamedType(TypeName.ANY, null);
        // simple types
        NUM = new BSNamedType(TypeName.NUM, ANY);
        DEC = new BSNamedType(TypeName.DEC, NUM);
        INT = new BSNamedType(TypeName.INT, DEC);
        BOOL = new BSNamedType(TypeName.BOOL, INT);
        // can be indexed types
        STR = new BSCanBeIndexedType(TypeName.STR, ANY, INT);
        LIST = new BSCanBeIndexedType(TypeName.LIST, ANY, INT, ANY);
        DICT = new BSCanBeIndexedType(TypeName.DICT, ANY, ANY, ANY);

        add(ANY);
        add(DEC);
        add(INT);
        add(BOOL);
        add(STR);
        add(LIST);
        add(DICT);
    }

    private void initializeBinaryOperators() {
        register(LIST);

        // range operators
        add(new BSBinaryOperator(LIST.buildFrom(INT).getType(), OperatorName.RANGE, INT, INT));

        // basic operators for integers
        add(new BSBinaryOperator(INT, OperatorName.PLUS, INT, INT));
        add(new BSBinaryOperator(INT, OperatorName.MINUS, INT, INT));
        add(new BSBinaryOperator(INT, OperatorName.MULTIPLY, INT, INT));
        add(new BSBinaryOperator(INT, OperatorName.DIVIDE, INT, INT));
        add(new BSBinaryOperator(INT, OperatorName.REMINDER, INT, INT));

        // basic operators for dec
        add(new BSBinaryOperator(DEC, OperatorName.PLUS, DEC, DEC));
        add(new BSBinaryOperator(DEC, OperatorName.MINUS, DEC, DEC));
        add(new BSBinaryOperator(DEC, OperatorName.MULTIPLY, DEC, DEC));
        add(new BSBinaryOperator(DEC, OperatorName.DIVIDE, DEC, DEC));
        add(new BSBinaryOperator(DEC, OperatorName.REMINDER, DEC, DEC));

        // comparisons for numbers
        add(new BSBinaryOperator(BOOL, OperatorName.LEAST_THAN, NUM, NUM));
        add(new BSBinaryOperator(BOOL, OperatorName.GREATER_THAN, NUM, NUM));
        add(new BSBinaryOperator(BOOL, OperatorName.LEAST_THAN_EQUAL, NUM, NUM));
        add(new BSBinaryOperator(BOOL, OperatorName.GREATER_THAN_EQUAL, NUM, NUM));

        // str operators
        add(new BSBinaryOperator(STR, OperatorName.PLUS, STR, STR));
        add(new BSBinaryOperator(STR, OperatorName.MULTIPLY, STR, INT));
        add(new BSBinaryOperator(STR, OperatorName.MULTIPLY, INT, STR));

        // logical operators
        add(new BSBinaryOperator(BOOL, OperatorName.EQUALS, ANY, ANY));
        add(new BSBinaryOperator(BOOL, OperatorName.NOT_EQUALS, ANY, ANY));
        add(new BSBinaryOperator(BOOL, OperatorName.AND, ANY, ANY));
        add(new BSBinaryOperator(BOOL, OperatorName.OR, ANY, ANY));
        add(new BSBinaryOperator(BOOL, OperatorName.IN, ANY, ANY));
    }
}
