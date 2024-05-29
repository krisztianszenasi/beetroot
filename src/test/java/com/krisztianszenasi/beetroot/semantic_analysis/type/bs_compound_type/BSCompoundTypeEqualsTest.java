package com.krisztianszenasi.beetroot.semantic_analysis.type.bs_compound_type;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSCompoundType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.bs_type.helpers.BSTypeAlwaysEqualsAndAlwaysCompatible;
import com.krisztianszenasi.beetroot.semantic_analysis.type.bs_type.helpers.BSTypeNeverEqualsAndNeverCompatible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSCompoundTypeEqualsTest {

    @Test
    void testEquals_WhenLeftAndRightSame_ReturnsTrue() {
        BSCompoundType myCompound1 = new BSCompoundType(
                new BSTypeAlwaysEqualsAndAlwaysCompatible(),
                new BSTypeAlwaysEqualsAndAlwaysCompatible()
        );
        BSCompoundType myCompound2 = new BSCompoundType(
                new BSTypeAlwaysEqualsAndAlwaysCompatible(),
                new BSTypeAlwaysEqualsAndAlwaysCompatible()
        );

        assertEquals(myCompound1, myCompound2);
        assertEquals(myCompound2, myCompound1);
    }

    @Test
    void testEquals_WhenLeftDiffers_ReturnsFalse() {
        BSCompoundType myCompound1 = new BSCompoundType(
                new BSTypeNeverEqualsAndNeverCompatible(),
                new BSTypeAlwaysEqualsAndAlwaysCompatible()
        );
        BSCompoundType myCompound2 = new BSCompoundType(
                new BSTypeNeverEqualsAndNeverCompatible(),
                new BSTypeAlwaysEqualsAndAlwaysCompatible()
        );

        assertNotEquals(myCompound1, myCompound2);
        assertNotEquals(myCompound2, myCompound1);
    }

    @Test
    void testEquals_WhenRightDiffers_ReturnsFalse() {
        BSCompoundType myCompound1 = new BSCompoundType(
                new BSTypeAlwaysEqualsAndAlwaysCompatible(),
                new BSTypeNeverEqualsAndNeverCompatible()
        );
        BSCompoundType myCompound2 = new BSCompoundType(
                new BSTypeAlwaysEqualsAndAlwaysCompatible(),
                new BSTypeNeverEqualsAndNeverCompatible()
        );

        assertNotEquals(myCompound1, myCompound2);
        assertNotEquals(myCompound2, myCompound1);
    }
}