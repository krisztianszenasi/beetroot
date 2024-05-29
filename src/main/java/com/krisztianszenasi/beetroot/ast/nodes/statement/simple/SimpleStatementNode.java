package com.krisztianszenasi.beetroot.ast.nodes.statement.simple;

import com.krisztianszenasi.beetroot.ast.nodes.statement.StatementNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

abstract public class SimpleStatementNode extends StatementNode {

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitSimpleStatementNode(this);
    }
}
