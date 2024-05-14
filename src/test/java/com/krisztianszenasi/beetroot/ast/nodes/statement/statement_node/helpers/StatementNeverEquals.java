package com.krisztianszenasi.beetroot.ast.nodes.statement.statement_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.StatementNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class StatementNeverEquals extends StatementNode {
    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return null;
    }
}
