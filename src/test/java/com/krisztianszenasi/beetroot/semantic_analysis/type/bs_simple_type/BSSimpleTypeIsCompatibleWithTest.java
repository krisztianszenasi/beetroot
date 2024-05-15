package com.krisztianszenasi.beetroot.semantic_analysis.type.bs_simple_type;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSSimpleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSSimpleTypeIsCompatibleWithTest {

    @Test
    void testIsCompatibleWith_WhenSameTypes_ReturnsTrue() {
        BSSimpleType type1 = new BSSimpleType("type");
        BSSimpleType type2 = new BSSimpleType("type");

        assertTrue(type1.isCompatibleWith(type2));
        assertTrue(type2.isCompatibleWith(type1));
    }

    @Test
    void testIsCompatibleWith_WhenDifferentTypes_ReturnsFalse() {
        BSSimpleType type = new BSSimpleType("type");
        BSSimpleType otherType = new BSSimpleType("other type");

        assertFalse(type.isCompatibleWith(otherType));
        assertFalse(otherType.isCompatibleWith(type));
    }

    @Test
    void testIsCompatibleWith_WhenChildComparedToParent_ReturnsTrue() {
        BSSimpleType parent = new BSSimpleType("parent");
        BSSimpleType child = new BSSimpleType("child");
        child.addParent(parent);

        assertTrue(child.isCompatibleWith(parent));
    }

    @Test
    void testIsCompatibleWith_WhenParentComparedToChild_ReturnsFalse() {
        BSSimpleType parent = new BSSimpleType("parent");
        BSSimpleType child = new BSSimpleType("child");
        child.addParent(parent);

        assertFalse(parent.isCompatibleWith(child));
    }
}