package ast.nodes.statement.statement_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.StatementNode;

public class StatementNeverEquals extends StatementNode {
    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
