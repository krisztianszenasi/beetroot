package com.krisztianszenasi.beetroot.semantic_analysis.type.bs_compound_type;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSCompoundType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.bs_type.helpers.BSTypeAlwaysEqualsAndAlwaysCompatible;
import com.krisztianszenasi.beetroot.semantic_analysis.type.bs_type.helpers.BSTypeNeverEqualsAndNeverCompatible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSCompoundTypeIsCompatibleWithTest {

    @Test
    void testIsCompatibleWith_WhenTypeAndInnerCompatible_ReturnsTrue() {
        BSCompoundType compType1 = new BSCompoundType(
                new BSTypeAlwaysEqualsAndAlwaysCompatible(),
                new BSTypeAlwaysEqualsAndAlwaysCompatible()
        );
        BSCompoundType compType2 = new BSCompoundType(
                new BSTypeAlwaysEqualsAndAlwaysCompatible(),
                new BSTypeAlwaysEqualsAndAlwaysCompatible()
        );

        assertTrue(compType1.isCompatibleWith(compType2));
        assertTrue(compType2.isCompatibleWith(compType1));
    }

    @Test
    void testIsCompatibleWith_WhenTypeNotCompatible_ReturnsFalse() {
        BSCompoundType compType1 = new BSCompoundType(
                new BSTypeNeverEqualsAndNeverCompatible(),
                new BSTypeAlwaysEqualsAndAlwaysCompatible()
        );
        BSCompoundType compType2 = new BSCompoundType(
                new BSTypeNeverEqualsAndNeverCompatible(),
                new BSTypeAlwaysEqualsAndAlwaysCompatible()
        );

        assertFalse(compType1.isCompatibleWith(compType2));
        assertFalse(compType2.isCompatibleWith(compType1));
    }

    @Test
    void testISCompatibleWith_WhenInnerNotCompatible_ReturnsFalse() {
        BSCompoundType compType1 = new BSCompoundType(
                new BSTypeAlwaysEqualsAndAlwaysCompatible(),
                new BSTypeNeverEqualsAndNeverCompatible()
        );
        BSCompoundType compType2 = new BSCompoundType(
                new BSTypeAlwaysEqualsAndAlwaysCompatible(),
                new BSTypeNeverEqualsAndNeverCompatible()
        );

        assertFalse(compType1.isCompatibleWith(compType2));
        assertFalse(compType2.isCompatibleWith(compType1));
    }
}