package com.krisztianszenasi.beetroot.ast.nodes.common.primitve_type_node;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.common.PrimitiveTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.node.helpers.DummyNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimitiveTypeNodeTest {

    @Test
    void testEquals_WhenPrimitiveTypeSame_ReturnsTrue() {
        PrimitiveTypeNode primitiveType1 = new PrimitiveTypeNode("type");
        PrimitiveTypeNode primitiveType2 = new PrimitiveTypeNode("type");

        assertEquals(primitiveType1, primitiveType2);
        assertEquals(primitiveType2, primitiveType1);
    }

    @Test
    void testEquals_WhenPrimitiveTypeDiffers_ReturnsFalse() {
        PrimitiveTypeNode primitiveType1 = new PrimitiveTypeNode("type");
        PrimitiveTypeNode primitiveType2 = new PrimitiveTypeNode("other type");

        assertNotEquals(primitiveType1, primitiveType2);
        assertNotEquals(primitiveType2, primitiveType1);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnFalse() {
        PrimitiveTypeNode primitiveType = new PrimitiveTypeNode("type");
        Node differentNode = new DummyNode();

        assertNotEquals(primitiveType, differentNode);
        assertNotEquals(differentNode, primitiveType);
    }
}