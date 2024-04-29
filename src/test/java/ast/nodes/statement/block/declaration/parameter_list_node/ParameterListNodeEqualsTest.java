package ast.nodes.statement.block.declaration.parameter_list_node;

import ast.nodes.node.helpers.DummyNode;
import ast.nodes.statement.block.declaration.parameter_node.helpers.ParameterAlwaysEquals;
import ast.nodes.statement.block.declaration.parameter_node.helpers.ParameterNeverEquals;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.ParameterListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParameterListNodeEqualsTest {

    @Test
    void testEquals_WhenBothEmpty_ReturnsTrue() {
        ParameterListNode paramList1 = new ParameterListNode();
        ParameterListNode paramList2 = new ParameterListNode();

        assertEquals(paramList1, paramList2);
        assertEquals(paramList1, paramList2);
    }

    @Test
    void testEquals_WhenSameLengthAndSameParams_ReturnsTrue() {
        ParameterListNode paramList1 = new ParameterListNode();
        paramList1.addParameter(ParameterAlwaysEquals.getInstance());

        ParameterListNode paramList2 = new ParameterListNode();
        paramList2.addParameter(ParameterAlwaysEquals.getInstance());

        assertEquals(paramList1, paramList2);
        assertEquals(paramList2, paramList1);
    }

    @Test
    void testEquals_WhenSameLengthAndDifferentParams_ReturnsFalse() {
        ParameterListNode paramList1 = new ParameterListNode();
        paramList1.addParameter(ParameterNeverEquals.getInstance());

        ParameterListNode paramList2 = new ParameterListNode();
        paramList2.addParameter(ParameterNeverEquals.getInstance());

        assertNotEquals(paramList1, paramList2);
        assertNotEquals(paramList2, paramList1);
    }

    @Test
    void testEquals_WhenDifferentLengthWithSameParams_ReturnsFalse() {
        ParameterListNode paramList1 = new ParameterListNode();
        paramList1.addParameter(ParameterAlwaysEquals.getInstance());
        paramList1.addParameter(ParameterAlwaysEquals.getInstance());

        ParameterListNode paramList2 = new ParameterListNode();
        paramList2.addParameter(ParameterAlwaysEquals.getInstance());

        assertNotEquals(paramList1, paramList2);
        assertNotEquals(paramList2, paramList1);
    }

    @Test
    void testEquals_WhenSameLengthWithDifferentParams_ReturnsFalse() {
        ParameterListNode paramList1 = new ParameterListNode();
        paramList1.addParameter(ParameterNeverEquals.getInstance());

        ParameterListNode paramList2 = new ParameterListNode();
        paramList2.addParameter(ParameterNeverEquals.getInstance());

        assertNotEquals(paramList1, paramList2);
        assertNotEquals(paramList2, paramList1);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        ParameterListNode paramList = new ParameterListNode();
        Node differentNode = new DummyNode();

        assertNotEquals(paramList, differentNode);
        assertNotEquals(differentNode, paramList);
    }

}