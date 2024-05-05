package com.krisztianszenasi.beetroot.ast.nodes;

import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

abstract public class Node {
    public abstract <T> T accept(AstVisitor<T> visitor);
}
