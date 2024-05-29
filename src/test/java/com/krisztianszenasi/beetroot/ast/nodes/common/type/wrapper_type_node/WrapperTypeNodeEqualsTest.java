package com.krisztianszenasi.beetroot.ast.nodes.common.type.wrapper_type_node;

import com.krisztianszenasi.beetroot.ast.nodes.common.type.WrapperTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.type_node.helpers.TypeAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.type_node.helpers.TypeNeverEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapperTypeNodeEqualsTest {

    @Test
    void testEquals_WhenNameAndInnerMatches_ReturnsTrue() {
        WrapperTypeNode wrapper1 = new WrapperTypeNode(
                "name",
                new TypeAlwaysEquals()
        );
        WrapperTypeNode wrapper2 = new WrapperTypeNode(
                "name",
                new TypeAlwaysEquals()
        );

        assertEquals(wrapper1, wrapper2);
        assertEquals(wrapper2, wrapper1);
    }

    @Test
    void testEquals_WhenNameDiffers_ReturnsFalse() {
        WrapperTypeNode wrapper1 = new WrapperTypeNode(
                "name",
                new TypeAlwaysEquals()
        );
        WrapperTypeNode wrapper2 = new WrapperTypeNode(
                "different name",
                new TypeAlwaysEquals()
        );

        assertNotEquals(wrapper1, wrapper2);
        assertNotEquals(wrapper2, wrapper1);
    }

    @Test
    void testEquals_WhenInnerDiffers_ReturnsFalse() {
        WrapperTypeNode wrapper1 = new WrapperTypeNode(
                "name",
                new TypeNeverEquals()
        );
        WrapperTypeNode wrapper2 = new WrapperTypeNode(
                "name",
                new TypeNeverEquals()
        );

        assertNotEquals(wrapper1, wrapper2);
        assertNotEquals(wrapper2, wrapper1);
    }
}