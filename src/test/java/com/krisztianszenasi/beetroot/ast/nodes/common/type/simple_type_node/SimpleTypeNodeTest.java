package com.krisztianszenasi.beetroot.ast.nodes.common.type.simple_type_node;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.SimpleTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.node.helpers.DummyNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTypeNodeTest {

    @Test
    void testEquals_WhenPrimitiveTypeSame_ReturnsTrue() {
        SimpleTypeNode primitiveType1 = new SimpleTypeNode("type");
        SimpleTypeNode primitiveType2 = new SimpleTypeNode("type");

        assertEquals(primitiveType1, primitiveType2);
        assertEquals(primitiveType2, primitiveType1);
    }

    @Test
    void testEquals_WhenPrimitiveTypeDiffers_ReturnsFalse() {
        SimpleTypeNode primitiveType1 = new SimpleTypeNode("type");
        SimpleTypeNode primitiveType2 = new SimpleTypeNode("other type");

        assertNotEquals(primitiveType1, primitiveType2);
        assertNotEquals(primitiveType2, primitiveType1);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnFalse() {
        SimpleTypeNode primitiveType = new SimpleTypeNode("type");
        Node differentNode = new DummyNode();

        assertNotEquals(primitiveType, differentNode);
        assertNotEquals(differentNode, primitiveType);
    }
}