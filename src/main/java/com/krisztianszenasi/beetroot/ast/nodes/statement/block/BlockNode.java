package com.krisztianszenasi.beetroot.ast.nodes.statement.block;


import com.krisztianszenasi.beetroot.ast.nodes.common.StatementsHolder;
import com.krisztianszenasi.beetroot.ast.nodes.statement.StatementNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BlockNode extends StatementNode implements StatementsHolder {

    private final List<StatementNode> statements = new ArrayList<>();

    public void addStatement(StatementNode statement) {
        if(statement != null) {
            statements.add(statement);
        }
    }
    public List<StatementNode> getStatements() {
        return statements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlockNode blockNode = (BlockNode) o;
        return Objects.equals(statements, blockNode.statements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statements);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitBlockNode(this);
    }
}
