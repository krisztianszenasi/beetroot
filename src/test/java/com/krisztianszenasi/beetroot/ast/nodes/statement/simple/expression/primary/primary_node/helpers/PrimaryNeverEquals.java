package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.primary_node.helpers;

public class PrimaryNeverEquals extends DummyPrimary {
    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
