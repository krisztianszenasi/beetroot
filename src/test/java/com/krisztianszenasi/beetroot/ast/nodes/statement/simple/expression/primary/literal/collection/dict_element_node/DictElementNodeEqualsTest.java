package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.dict_element_node;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionNeverEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.DictElementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.dict_element_node.helpers.DummyDictElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictElementNodeEqualsTest {

    private static DictElementNode dummyElement;

    @BeforeAll
    static void init() {
        dummyElement = DummyDictElement.getInstance();
    }

    @Test
    void testEquals_WhenKeyAndValueSame_ReturnsTrue() {
        DictElementNode element = new DictElementNode(
                new ExpressionAlwaysEquals(),
                new ExpressionAlwaysEquals()
        );

        assertEquals(element, dummyElement);
    }

    @Test
    void testEquals_WhenKeyDiffers_ReturnsFalse() {
        DictElementNode element = new DictElementNode(
                new ExpressionNeverEquals(),
                new ExpressionAlwaysEquals()
        );

        assertNotEquals(element, dummyElement);
    }

    @Test
    void testEquals_WhenValueDiffers_ReturnsFalse() {
        DictElementNode element = new DictElementNode(
                new ExpressionAlwaysEquals(),
                new ExpressionNeverEquals()
        );

        assertNotEquals(element, dummyElement);
    }

    @Test
    void testEquals_DifferentNode_ReturnsFalse() {
        DictElementNode element = new DictElementNode(
                new ExpressionAlwaysEquals(),
                new ExpressionNeverEquals()
        );
        Node differentNode = new DummyNode();

        assertNotEquals(element, dummyElement);
    }
}