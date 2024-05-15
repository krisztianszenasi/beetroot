package com.krisztianszenasi.beetroot.semantic_analysis.type.bs_simple_type;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSSimpleType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSSimpleTypeEqualsTest {

    private static BSSimpleType parent1;
    private static BSSimpleType parent2;

    @BeforeAll
    static void init() {
        parent1 = new BSSimpleType("parent1");
        parent2 = new BSSimpleType("parent2");
    }

    @Test
    void testEquals_WhenNameAndParentsSame_ReturnsTrue() {
        BSSimpleType myType1 = new BSSimpleType("myType");
        myType1.addParent(parent1);
        BSSimpleType myType2 = new BSSimpleType("myType");
        myType2.addParent(parent1);

        assertEquals(myType1, myType2);
        assertEquals(myType2, myType1);
    }

    @Test
    void testEquals_WhenNameDiffers_ReturnsFalse() {
        BSSimpleType myType = new BSSimpleType("myType");
        myType.addParent(parent1);
        BSSimpleType myDifferentType = new BSSimpleType("myDifferentType");
        myDifferentType.addParent(parent1);

        assertNotEquals(myType, myDifferentType);
        assertNotEquals(myDifferentType, myType);
    }

    @Test
    void testEquals_WhenParentsDiffers_ReturnsFalse() {
        BSSimpleType myType1 = new BSSimpleType("myType");
        myType1.addParent(parent1);
        BSSimpleType myType2 = new BSSimpleType("myType");
        myType2.addParent(parent2);

        assertNotEquals(myType1, myType2);
        assertNotEquals(myType2, myType1);
    }
}