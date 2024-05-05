package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.variable_reference_literal_node;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.VariableReferenceLiteralNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableReferenceLiteralNodeEqualsTest {

    @Test
    void testEquals_WhenNameSame_ReturnsTrue() {
        VariableReferenceLiteralNode varRef1 = new VariableReferenceLiteralNode("var name");
        VariableReferenceLiteralNode varRef2 = new VariableReferenceLiteralNode("var name");

        assertEquals(varRef1, varRef2);
        assertEquals(varRef2, varRef1);
    }

    @Test
    void testEquals_WhenNameDiffers_ReturnsFalse() {
        VariableReferenceLiteralNode varRef1 = new VariableReferenceLiteralNode("var name");
        VariableReferenceLiteralNode varRef2 = new VariableReferenceLiteralNode("different var name");

        assertNotEquals(varRef1, varRef2);
        assertNotEquals(varRef2, varRef1);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        VariableReferenceLiteralNode varRef = new VariableReferenceLiteralNode("var name");
        Node differentNode = new DummyNode();

        assertNotEquals(varRef, differentNode);
        assertNotEquals(differentNode, varRef);
    }
}