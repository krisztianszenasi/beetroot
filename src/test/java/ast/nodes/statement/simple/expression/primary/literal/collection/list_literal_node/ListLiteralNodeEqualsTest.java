package ast.nodes.statement.simple.expression.primary.literal.collection.list_literal_node;

import ast.nodes.node.helpers.DummyNode;
import ast.nodes.statement.simple.expression.expression_node.helpers.DummyExpression;
import ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionAlwaysEquals;
import ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionNeverEquals;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.ListLiteralNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListLiteralNodeEqualsTest {

    @Test
    void testEquals_WhenBothEmpty_ReturnsTrue() {
        ListLiteralNode list1 = new ListLiteralNode();
        ListLiteralNode list2 = new ListLiteralNode();

        assertEquals(list1, list2);
        assertEquals(list2, list1);
    }

    @Test
    void testEquals_WhenSameLengthAndSameElements_ReturnsTrue() {
        ListLiteralNode list1 = new ListLiteralNode();
        list1.addElement(new ExpressionAlwaysEquals());

        ListLiteralNode list2 = new ListLiteralNode();
        list2.addElement(new DummyExpression());

        assertEquals(list1, list2);
    }

    @Test
    void testEquals_WhenSameLengthAndDifferentElements_ReturnsFalse() {
        ListLiteralNode list1 = new ListLiteralNode();
        list1.addElement(new ExpressionNeverEquals());

        ListLiteralNode list2 = new ListLiteralNode();
        list2.addElement(new DummyExpression());

        assertNotEquals(list1, list2);
    }

    @Test
    void testEquals_WhenDifferentLengthWithSameElements_ReturnsFalse() {
        ListLiteralNode list1 = new ListLiteralNode();
        list1.addElement(new ExpressionAlwaysEquals());
        list1.addElement(new ExpressionAlwaysEquals());

        ListLiteralNode list2 = new ListLiteralNode();
        list2.addElement(new DummyExpression());


        assertNotEquals(list1, list2);
    }

    @Test
    void testEquals_WhenSameLengthWithDifferentElements_ReturnsFalse() {
        ListLiteralNode list1 = new ListLiteralNode();
        list1.addElement(new ExpressionNeverEquals());

        ListLiteralNode list2 = new ListLiteralNode();
        list2.addElement(new DummyExpression());


        assertNotEquals(list1, list2);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        ListLiteralNode list = new ListLiteralNode();
        Node differentNode = new DummyNode();

        assertNotEquals(list, differentNode);
        assertNotEquals(differentNode, list);
    }
}