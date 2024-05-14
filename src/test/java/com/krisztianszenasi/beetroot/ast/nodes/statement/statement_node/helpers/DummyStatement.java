package com.krisztianszenasi.beetroot.ast.nodes.statement.statement_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.StatementNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class DummyStatement extends StatementNode {
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return null;
    }
}
