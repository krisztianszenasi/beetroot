package com.krisztianszenasi.beetroot.semantic_analysis.type.bs_simple_type;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSNamedType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSNamedTypeEqualsTest {

    private static BSNamedType parent1;
    private static BSNamedType parent2;

    @BeforeAll
    static void init() {
        parent1 = new BSNamedType("parent1", null);
        parent2 = new BSNamedType("parent2", null);
    }

    @Test
    void testEquals_WhenNameAndParentsSame_ReturnsTrue() {
        BSNamedType myType1 = new BSNamedType("myType", parent1);
        BSNamedType myType2 = new BSNamedType("myType", parent1);

        assertEquals(myType1, myType2);
        assertEquals(myType2, myType1);
    }

    @Test
    void testEquals_WhenNameDiffers_ReturnsFalse() {
        BSNamedType myType = new BSNamedType("myType", parent1);
        BSNamedType myDifferentType = new BSNamedType("myDifferentType", parent1);

        assertNotEquals(myType, myDifferentType);
        assertNotEquals(myDifferentType, myType);
    }

    @Test
    void testEquals_WhenParentsDiffers_ReturnsFalse() {
        BSNamedType myType1 = new BSNamedType("myType", parent1);
        BSNamedType myType2 = new BSNamedType("myType", parent2);

        assertNotEquals(myType1, myType2);
        assertNotEquals(myType2, myType1);
    }
}