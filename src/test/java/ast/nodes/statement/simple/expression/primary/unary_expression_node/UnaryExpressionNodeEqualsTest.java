package ast.nodes.statement.simple.expression.primary.unary_expression_node;

import ast.nodes.node.helpers.DummyNode;
import ast.nodes.statement.simple.expression.expression_node.helpers.DummyExpression;
import ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionAlwaysEquals;
import ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionNeverEquals;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.UnaryExpressionNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnaryExpressionNodeEqualsTest {

    private static UnaryExpressionNode dummyUnary;

    @BeforeAll
    static void init() {
        dummyUnary = new UnaryExpressionNode(new DummyExpression());
    }

    @Test
    void testEquals_WhenExpressionSame_ReturnsTrue() {
        UnaryExpressionNode unaryEquals = new UnaryExpressionNode(new ExpressionAlwaysEquals());
        assertEquals(unaryEquals, dummyUnary);
    }

    @Test
    void testEquals_WhenExpressionDiffers_ReturnsFalse() {
        UnaryExpressionNode unaryNotEquals = new UnaryExpressionNode(new ExpressionNeverEquals());
        assertNotEquals(unaryNotEquals, dummyUnary);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        UnaryExpressionNode unary = new UnaryExpressionNode(new ExpressionAlwaysEquals());
        Node differentNode = new DummyNode();

        assertNotEquals(unary, differentNode);
    }
}