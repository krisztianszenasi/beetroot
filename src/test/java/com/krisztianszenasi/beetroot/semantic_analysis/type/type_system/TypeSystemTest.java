package com.krisztianszenasi.beetroot.semantic_analysis.type.type_system;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.operator.BSOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeSystemTest extends TypeSystemFixture{

    @Test
    void testGetType_WhenTypeExists_ReturnsIt(){
        BSType parentResult = typeSystem.getType("parent");
        BSType childResult = typeSystem.getType("child");

        assertEquals(parentResult, parentType);
        assertEquals(childResult, childType);
    }

    @Test
    void testGetType_WhenTypeDoesNotExist_ReturnsError(){
        BSType nonExistentResult = typeSystem.getType("something that does not exist");
        assertEquals(nonExistentResult, errorType);
    }

    @Test
    void testGetBinaryOperator_WhenOneCompatibleOperatorExists_ReturnsIt() {
        BSOperator operatorFound = typeSystem.getBinaryFor("operator", parentType, parentType);
        assertEquals(operatorFound, parentOperatorParentParent);
    }

    @Test
    void testGetBinaryOperator_WhenMultipleCompatibleOperatorsExist_ReturnsMostSpecific() {
        BSOperator operatorFound = typeSystem.getBinaryFor("operator", childType, childType);
        assertEquals(operatorFound, childOperatorChildChild);
    }

    @Test
    void testGetBinaryOperator_WhenNoCompatibleOperatorExists_ReturnsNull() {
        BSOperator operatorFound = typeSystem.getBinaryFor("operator", otherType, otherType);
        assertNull(operatorFound);
    }

    @Test
    void testGetUnaryOperator_WhenOneCompatibleOperatorExists_ReturnsIt() {
        BSOperator operatorFound = typeSystem.getUnaryFor("operator", parentType);
        assertEquals(operatorFound, parentOperatorParent);
    }

    @Test
    void testGetUnaryOperator_WhenMultipleCompatibleOperatorsExist_ReturnsMostSpecific() {
        BSOperator operatorFound = typeSystem.getUnaryFor("operator", childType);
        assertEquals(operatorFound, childOperatorChild);
    }

    @Test
    void testGetUnaryOperator_WhenNoCompatibleOperatorExists_ReturnsNull() {
        BSOperator operatorFound = typeSystem.getUnaryFor("operator", otherType);
        assertNull(operatorFound);
    }
}