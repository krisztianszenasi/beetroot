package com.krisztianszenasi.beetroot.ast.nodes.statement;


import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

abstract public class StatementNode extends Node {

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitStatementNode(this);
    }
}
