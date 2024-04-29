package ast.nodes.statement.simple.expression.primary.literal.string_literal_node;

import ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.StringLiteralNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringLiteralNodeEqualsTest {

    @Test
    void testEquals_WhenValuesSame_ReturnsTrue() {
        StringLiteralNode string1 = new StringLiteralNode("text");
        StringLiteralNode string2 = new StringLiteralNode("text");

        assertEquals(string1, string2);
        assertEquals(string2, string1);
    }

    @Test
    void testEquals_WhenValueDiffers_ReturnsFalse() {
        StringLiteralNode string1 = new StringLiteralNode("text");
        StringLiteralNode string2 = new StringLiteralNode("different text");

        assertNotEquals(string1, string2);
        assertNotEquals(string2, string1);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        StringLiteralNode string = new StringLiteralNode("text");
        Node differentNode = new DummyNode();

        assertNotEquals(string, differentNode);
        assertNotEquals(differentNode, string);
    }
}