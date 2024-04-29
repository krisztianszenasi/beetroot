package ast.nodes.statement.simple.expression.primary.literal.collection.dictionary_literal_node;

import ast.nodes.node.helpers.DummyNode;
import ast.nodes.statement.simple.expression.primary.literal.collection.dict_element_node.helpers.DictElementAlwaysEquals;
import ast.nodes.statement.simple.expression.primary.literal.collection.dict_element_node.helpers.DictElementNeverEquals;
import ast.nodes.statement.simple.expression.primary.literal.collection.dict_element_node.helpers.DummyDictElement;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.DictionaryLiteralNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryLiteralNodeEqualsTest {

    @Test
    void testEquals_WhenBothEmpty_ReturnsTrue() {
        DictionaryLiteralNode dict1 = new DictionaryLiteralNode();
        DictionaryLiteralNode dict2 = new DictionaryLiteralNode();

        assertEquals(dict1, dict2);
        assertEquals(dict2, dict1);
    }

    @Test
    void testEquals_WhenSameLengthAndElements_ReturnsTrue() {
        DictionaryLiteralNode dict1 = new DictionaryLiteralNode();
        dict1.addElement(DictElementAlwaysEquals.getInstance());

        DictionaryLiteralNode dict2 = new DictionaryLiteralNode();
        dict2.addElement(DummyDictElement.getInstance());


        assertEquals(dict1, dict2);
    }

    @Test
    void testEquals_WhenSameLengthDifferentElements_ReturnsFalse() {
        DictionaryLiteralNode dict1 = new DictionaryLiteralNode();
        dict1.addElement(DictElementNeverEquals.getInstance());

        DictionaryLiteralNode dict2 = new DictionaryLiteralNode();
        dict2.addElement(DummyDictElement.getInstance());


        assertNotEquals(dict1, dict2);
    }

    @Test
    void testEquals_WhenDifferentLengthWithSameElements_ReturnsFalse() {
        DictionaryLiteralNode dict1 = new DictionaryLiteralNode();
        dict1.addElement(DictElementAlwaysEquals.getInstance());
        dict1.addElement(DictElementAlwaysEquals.getInstance());

        DictionaryLiteralNode dict2 = new DictionaryLiteralNode();
        dict2.addElement(DummyDictElement.getInstance());


        assertNotEquals(dict1, dict2);
    }

    @Test
    void testEquals_WhenSameLengthWithDifferentElements_ReturnsFalse() {
        DictionaryLiteralNode dict1 = new DictionaryLiteralNode();
        dict1.addElement(DictElementNeverEquals.getInstance());

        DictionaryLiteralNode dict2 = new DictionaryLiteralNode();
        dict2.addElement(DummyDictElement.getInstance());


        assertNotEquals(dict1, dict2);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        DictionaryLiteralNode dict = new DictionaryLiteralNode();
        Node differentNode = new DummyNode();

        assertNotEquals(dict, differentNode);
        assertNotEquals(differentNode, dict);
    }
}