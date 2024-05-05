package com.krisztianszenasi.beetroot.ast.nodes.file_node;

import com.krisztianszenasi.beetroot.ast.nodes.FileNode;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.block_node.helpers.BlockAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.block_node.helpers.BlockNeverEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FileNodeEqualsTest {

    @Test
    void testEquals_WhenSameBlocks_ReturnsTrue() {
        FileNode fileNode1 = new FileNode(new BlockAlwaysEquals());
        FileNode fileNode2 = new FileNode(new BlockNode());

        assertEquals(fileNode1, fileNode2);
    }

    @Test
    void tesEquals_WhenDifferentBlocks_ReturnsFalse() {
        FileNode fileNode1 = new FileNode(new BlockNeverEquals());
        FileNode fileNode2 = new FileNode(new BlockNode());

        assertNotEquals(fileNode1, fileNode2);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        FileNode fileNode = new FileNode(new BlockAlwaysEquals());
        Node differentNode = new DummyNode();

        assertNotEquals(fileNode, differentNode);
    }
}