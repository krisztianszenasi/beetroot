package ast.nodes.statement.block.declaration.delaration_block_node;

import ast.nodes.node.helpers.DummyNode;
import ast.nodes.statement.block.block_node.helpers.BlockAlwaysEquals;
import ast.nodes.statement.block.block_node.helpers.BlockNeverEquals;
import ast.nodes.statement.block.declaration.delaration_block_node.helpers.DummyDeclarationBlock;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.DeclarationBlockNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeclarationBlockNodeEqualsTest {

    @Test
    void testEquals_WhenSameBlocks_ReturnsTrue() {
        DeclarationBlockNode block1 = new DummyDeclarationBlock(new BlockAlwaysEquals());
        DeclarationBlockNode block2 = new DummyDeclarationBlock(new BlockNode());

        assertEquals(block1, block2);
    }

    @Test
    void tesEquals_WhenDifferentBlocks_ReturnsFalse() {
        DeclarationBlockNode block1 = new DummyDeclarationBlock(new BlockNeverEquals());
        DeclarationBlockNode block2 = new DummyDeclarationBlock(new BlockNode());

        assertNotEquals(block1, block2);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        DeclarationBlockNode block = new DummyDeclarationBlock(new BlockAlwaysEquals());
        Node differentNode = new DummyNode();

        assertNotEquals(block, differentNode);
    }
}