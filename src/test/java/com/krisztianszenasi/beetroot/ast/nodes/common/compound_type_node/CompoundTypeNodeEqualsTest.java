package com.krisztianszenasi.beetroot.ast.nodes.common.compound_type_node;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.common.CompoundTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.type_node.helpers.DummyType;
import com.krisztianszenasi.beetroot.ast.nodes.common.type_node.helpers.TypeAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.common.type_node.helpers.TypeNeverEquals;
import com.krisztianszenasi.beetroot.ast.nodes.node.helpers.DummyNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompoundTypeNodeEqualsTest {

    @Test
    void testEquals_WHenTypeAndInnerSame_ReturnsTrue() {
        CompoundTypeNode compType1 = new CompoundTypeNode(
                new TypeAlwaysEquals(),
                new TypeAlwaysEquals()
        );
        CompoundTypeNode compType2 = new CompoundTypeNode(
                new TypeAlwaysEquals(),
                new TypeAlwaysEquals()
        );

        assertEquals(compType1, compType2);
        assertEquals(compType2, compType1);
    }

    @Test
    void testEquals_WhenTypeDiffers_ReturnsFalse() {
        CompoundTypeNode compType1 = new CompoundTypeNode(
                new TypeNeverEquals(),
                new TypeAlwaysEquals()
        );
        CompoundTypeNode compType2 = new CompoundTypeNode(
                new TypeNeverEquals(),
                new TypeAlwaysEquals()
        );

        assertNotEquals(compType1, compType2);
        assertNotEquals(compType2, compType1);
    }

    @Test
    void testEquals_WhenInnerTypeDiffers_ReturnsFalse() {
        CompoundTypeNode compType1 = new CompoundTypeNode(
                new TypeAlwaysEquals(),
                new TypeNeverEquals()
        );
        CompoundTypeNode compType2 = new CompoundTypeNode(
                new TypeAlwaysEquals(),
                new TypeNeverEquals()
        );

        assertNotEquals(compType1, compType2);
        assertNotEquals(compType2, compType1);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnFalse() {
        CompoundTypeNode compType = new CompoundTypeNode(new DummyType(), new DummyType());
        Node differentNode = new DummyNode();

        assertNotEquals(compType, differentNode);
        assertNotEquals(differentNode, compType);
    }
}