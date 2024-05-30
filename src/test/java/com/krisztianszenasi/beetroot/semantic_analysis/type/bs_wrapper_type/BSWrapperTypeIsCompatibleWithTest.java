package com.krisztianszenasi.beetroot.semantic_analysis.type.bs_wrapper_type;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSWrapperType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSWrapperTypeIsCompatibleWithTest {



    @Test
    void testIsCompatibleWithWrapperType_WhenNameIsSameAndInnerIsNull_ReturnsTrue() {
        BSWrapperType wrapperWithInnerNull1 = new BSWrapperType(
                "wrapper with null",
                null,
                null
        );
        BSWrapperType wrapperWithInnerNull2 = new BSWrapperType(
                "wrapper with null",
                null,
                null
        );
        assertTrue(wrapperWithInnerNull1.isCompatibleWith(wrapperWithInnerNull2));
        assertTrue(wrapperWithInnerNull2.isCompatibleWith(wrapperWithInnerNull1));
    }
}