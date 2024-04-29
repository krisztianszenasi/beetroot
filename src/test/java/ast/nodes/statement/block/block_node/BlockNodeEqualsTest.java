package ast.nodes.statement.block.block_node;

import ast.nodes.node.helpers.DummyNode;
import ast.nodes.statement.statement_node.helpers.DummyStatement;
import ast.nodes.statement.statement_node.helpers.StatementAlwaysEquals;
import ast.nodes.statement.statement_node.helpers.StatementNeverEquals;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlockNodeEqualsTest {

    @Test
    void testEquals_WhenBothEmpty_ReturnsTrue() {
        BlockNode block1 = new BlockNode();
        BlockNode block2 = new BlockNode();

        assertEquals(block1, block2);
        assertEquals(block2, block1);
    }

    @Test
    void testEquals_WhenSameLengthAndSameStatements_ReturnsTrue() {
        BlockNode block1 = new BlockNode();
        block1.addStatement(new StatementAlwaysEquals());

        BlockNode block2 = new BlockNode();
        block2.addStatement(new DummyStatement());

        assertEquals(block1, block2);
    }

    @Test
    void testEquals_WhenSameLengthAndDifferentStatements_ReturnsFalse() {
        BlockNode block1 = new BlockNode();
        block1.addStatement(new StatementNeverEquals());

        BlockNode block2 = new BlockNode();
        block2.addStatement(new DummyStatement());

        assertNotEquals(block1, block2);
    }

    @Test
    void testEquals_WhenDifferentLengthWithSameElements_ReturnsFalse() {
        BlockNode block1 = new BlockNode();
        block1.addStatement(new StatementAlwaysEquals());
        block1.addStatement(new StatementAlwaysEquals());

        BlockNode block2 = new BlockNode();
        block2.addStatement(new DummyStatement());


        assertNotEquals(block1, block2);
    }

    @Test
    void testEquals_WhenSameLengthWithDifferentStatements_ReturnsFalse() {
        BlockNode block1 = new BlockNode();
        block1.addStatement(new StatementNeverEquals());

        BlockNode block2 = new BlockNode();
        block2.addStatement(new DummyStatement());


        assertNotEquals(block1, block2);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        BlockNode block = new BlockNode();
        Node differentNode = new DummyNode();

        assertNotEquals(block, differentNode);
        assertNotEquals(differentNode, block);
    }

}