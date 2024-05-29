package com.krisztianszenasi.beetroot.semantic_analysis.type.bs_simple_type;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSCanBeIndexedType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSCompoundType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSNamedType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSWrapperType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSNamedTypeIsCompatibleWithTest {

    // Compared to BSSimpleType instances
    @Test
    void testIsCompatibleWithSimpleType_WhenSameTypes_ReturnsTrue() {
        BSNamedType type1 = new BSNamedType("type", null);
        BSNamedType type2 = new BSNamedType("type", null);

        assertTrue(type1.isCompatibleWith(type2));
        assertTrue(type2.isCompatibleWith(type1));
    }

    @Test
    void testIsCompatibleWithSimpleType_WhenDifferentTypes_ReturnsFalse() {
        BSNamedType type = new BSNamedType("type", null);
        BSNamedType otherType = new BSNamedType("different type", null);

        assertFalse(type.isCompatibleWith(otherType));
        assertFalse(otherType.isCompatibleWith(type));
    }

    @Test
    void testIsCompatibleWithSimpleType_ChildAndParentComparisons() {
        BSNamedType parent = new BSNamedType("parent", null);
        BSNamedType child = new BSNamedType("child", parent);

        assertTrue(child.isCompatibleWith(parent));
        assertFalse(parent.isCompatibleWith(child));
    }


    // Compared to BSWrapperType instances

    @Test
    void testIsCompatibleWithWrapperType_WhenDifferentTypes_ReturnsFalse() {
        BSNamedType simpleType = new BSNamedType("type", null);
        BSWrapperType wrapperType = new BSWrapperType("different type", null, null);

        assertFalse(simpleType.isCompatibleWith(wrapperType));
    }

    // Compared to BSCompoundType instances
    @Test
    void testIsCompatibleWithCompoundType_AlwaysReturnsFalse() {
        BSNamedType parent = new BSNamedType("parent", null);
        BSNamedType child = new BSNamedType("child", parent);
        BSCompoundType compound = new BSCompoundType(parent, child);

        assertFalse(child.isCompatibleWith(compound));
    }

    // Compared to BSCanBeIndexed instances


    @Test
    void testIsCompatibleWitCanBeIndexedType_WhenDifferentTypes_ReturnsFalse() {
        BSNamedType simpleType = new BSNamedType("type", null);
        BSCanBeIndexedType canBeIndexed = new BSCanBeIndexedType(
                "different type", null, null, null
        );

        assertFalse(simpleType.isCompatibleWith(canBeIndexed));
    }
}