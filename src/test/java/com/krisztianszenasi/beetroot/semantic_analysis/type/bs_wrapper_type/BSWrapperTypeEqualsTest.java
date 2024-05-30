package com.krisztianszenasi.beetroot.semantic_analysis.type.bs_wrapper_type;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSWrapperType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.bs_type.helpers.BSTypeAlwaysEqualsAndAlwaysCompatible;
import com.krisztianszenasi.beetroot.semantic_analysis.type.bs_type.helpers.BSTypeNeverEqualsAndNeverCompatible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSWrapperTypeEqualsTest {

    @Test
    void testEquals_WhenNameAndInnerSame_ReturnsTrue() {
        BSWrapperType wrapper1 = new BSWrapperType(
                "wrapper",
                null,
                new BSTypeAlwaysEqualsAndAlwaysCompatible()
        );
        BSWrapperType wrapper2 = new BSWrapperType(
                "wrapper",
                null,
                new BSTypeAlwaysEqualsAndAlwaysCompatible()
        );

        assertEquals(wrapper1, wrapper2);
        assertEquals(wrapper2, wrapper1);
    }

    @Test
    void testEquals_WhenNameDiffers_ReturnsFalse() {
        BSWrapperType wrapper1 = new BSWrapperType(
                "wrapper",
                null,
                new BSTypeAlwaysEqualsAndAlwaysCompatible()
        );
        BSWrapperType wrapper2 = new BSWrapperType(
                "wrapper other",
                null,
                new BSTypeAlwaysEqualsAndAlwaysCompatible()
        );

        assertNotEquals(wrapper1, wrapper2);
        assertNotEquals(wrapper2, wrapper1);
    }

    @Test
    void testEquals_WhenInnerDiffers_ReturnsFalse() {
        BSWrapperType wrapper1 = new BSWrapperType(
                "wrapper",
                null,
                new BSTypeNeverEqualsAndNeverCompatible()
        );
        BSWrapperType wrapper2 = new BSWrapperType(
                "wrapper",
                null,
                new BSTypeNeverEqualsAndNeverCompatible()
        );

        assertNotEquals(wrapper1, wrapper2);
        assertNotEquals(wrapper2, wrapper1);
    }
}