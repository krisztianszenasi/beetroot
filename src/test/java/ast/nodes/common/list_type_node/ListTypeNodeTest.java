package ast.nodes.common.list_type_node;

import ast.nodes.common.type_node.helpers.TypeAlwaysEquals;
import ast.nodes.common.type_node.helpers.TypeNeverEquals;
import ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.common.ListTypeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTypeNodeTest {

    @Test
    void testEquals_WhenElementTypeSame_ReturnsTrue() {
        ListTypeNode listType1 = new ListTypeNode(new TypeAlwaysEquals());
        ListTypeNode listType2 = new ListTypeNode(new TypeAlwaysEquals());

        assertEquals(listType1, listType2);
        assertEquals(listType2, listType1);
    }

    @Test
    void testEquals_WhenElementTypeDiffers_ReturnsFalse() {
        ListTypeNode listType1 = new ListTypeNode(new TypeNeverEquals());
        ListTypeNode listType2 = new ListTypeNode(new TypeNeverEquals());

        assertNotEquals(listType1, listType2);
        assertNotEquals(listType2, listType1);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        ListTypeNode listType = new ListTypeNode(new TypeNeverEquals());
        Node differentNode = new DummyNode();


        assertNotEquals(listType, differentNode);
        assertNotEquals(differentNode, listType);
    }
}