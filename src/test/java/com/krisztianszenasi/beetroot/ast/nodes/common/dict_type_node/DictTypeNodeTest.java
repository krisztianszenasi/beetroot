package com.krisztianszenasi.beetroot.ast.nodes.common.dict_type_node;

import com.krisztianszenasi.beetroot.ast.nodes.common.DictTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.type_node.helpers.TypeAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.common.type_node.helpers.TypeNeverEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictTypeNodeTest {

    @Test
    void testEquals_WhenKeyTypeAndValueTypeSame_ReturnsTrue() {
        DictTypeNode dictType1 = new DictTypeNode(
                new TypeAlwaysEquals(),
                new TypeAlwaysEquals()
        );
        DictTypeNode dictType2 = new DictTypeNode(
                new TypeAlwaysEquals(),
                new TypeAlwaysEquals()
        );

        assertEquals(dictType1, dictType2);
        assertEquals(dictType2, dictType1);
    }

    @Test
    void testEquals_WhenKeyTypeDiffers_ReturnsFalse() {
        DictTypeNode dictType1 = new DictTypeNode(
                new TypeNeverEquals(),
                new TypeAlwaysEquals()
        );
        DictTypeNode dictType2 = new DictTypeNode(
                new TypeNeverEquals(),
                new TypeAlwaysEquals()
        );

        assertNotEquals(dictType1, dictType2);
        assertNotEquals(dictType2, dictType1);
    }

    @Test
    void testEquals_WhenValueTypeDiffers_ReturnsFalse() {
        DictTypeNode dictType1 = new DictTypeNode(
                new TypeAlwaysEquals(),
                new TypeNeverEquals()
        );
        DictTypeNode dictType2 = new DictTypeNode(
                new TypeAlwaysEquals(),
                new TypeNeverEquals()
        );

        assertNotEquals(dictType1, dictType2);
        assertNotEquals(dictType2, dictType1);
    }
}