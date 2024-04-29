package ast.nodes.statement.simple.expression.primary.literal.number.integer_literal_node;

import ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.number.IntegerLiteralNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerLiteralNodeEqualsTest {
    @Test
    void testEquals_WhenValuesSame_ReturnsTrue() {
        IntegerLiteralNode integer1 = new IntegerLiteralNode(1);
        IntegerLiteralNode integer2 = new IntegerLiteralNode(1);

        assertEquals(integer1, integer2);
        assertEquals(integer2, integer1);
    }

    @Test
    void testEquals_WhenValuesDiffer_ReturnsFalse() {
        IntegerLiteralNode integer1 = new IntegerLiteralNode(1);
        IntegerLiteralNode integer2 = new IntegerLiteralNode(2);

        assertNotEquals(integer1, integer2);
        assertNotEquals(integer2, integer1);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        IntegerLiteralNode integer = new IntegerLiteralNode(1);
        Node differentNode = new DummyNode();

        assertNotEquals(integer, differentNode);
        assertNotEquals(differentNode, integer);
    }
}