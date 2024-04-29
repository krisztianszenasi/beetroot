package ast.nodes.common.primitve_type_node;

import ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.common.PrimitiveTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.enums.PrimitiveType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimitiveTypeNodeTest {

    @Test
    void testEquals_WhenPrimitiveTypeSame_ReturnsTrue() {
        PrimitiveTypeNode primitiveType1 = new PrimitiveTypeNode(PrimitiveType.INT);
        PrimitiveTypeNode primitiveType2 = new PrimitiveTypeNode(PrimitiveType.INT);

        assertEquals(primitiveType1, primitiveType2);
        assertEquals(primitiveType2, primitiveType1);
    }

    @Test
    void testEquals_WhenPrimitiveTypeDiffers_ReturnsFalse() {
        PrimitiveTypeNode primitiveType1 = new PrimitiveTypeNode(PrimitiveType.INT);
        PrimitiveTypeNode primitiveType2 = new PrimitiveTypeNode(PrimitiveType.DEC);

        assertNotEquals(primitiveType1, primitiveType2);
        assertNotEquals(primitiveType2, primitiveType1);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnFalse() {
        PrimitiveTypeNode primitiveType = new PrimitiveTypeNode(PrimitiveType.INT);
        Node differentNode = new DummyNode();

        assertNotEquals(primitiveType, differentNode);
        assertNotEquals(differentNode, primitiveType);
    }
}