package com.krisztianszenasi.beetroot.semantic_analysis.type_system.fixtures;

import com.krisztianszenasi.beetroot.semantic_analysis.operator.BSBinaryOperator;
import org.junit.jupiter.api.BeforeAll;

public class TypeSystemOperatorFixture extends TypeSystemTypeFixture{
    protected static BSBinaryOperator intPlusIntInt;
    protected static BSBinaryOperator decPlusDecDec;
    protected static BSBinaryOperator strPlusStrStr;
    protected static BSBinaryOperator nonExistentPlusNonExistentNonExistent;


    @BeforeAll
    static void initializeOperators() {
        // binary operators
        intPlusIntInt = new BSBinaryOperator(intType, "+", intType, intType);
        decPlusDecDec = new BSBinaryOperator(decType, "+", decType, decType);
        strPlusStrStr = new BSBinaryOperator(strType, "+", strType, strType);
        nonExistentPlusNonExistentNonExistent = new BSBinaryOperator(
                nonExistentSimpleType,
                "+",
                nonExistentSimpleType,
                nonExistentWrapperType
        );

        typeSystem.add(intPlusIntInt);
        typeSystem.add(decPlusDecDec);
        typeSystem.add(strPlusStrStr);
    }
}
