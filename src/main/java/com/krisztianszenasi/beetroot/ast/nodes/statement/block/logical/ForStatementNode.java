package com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical;

import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.VariableDeclarationNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.Objects;

public class ForStatementNode extends LogicalBlockNode {

    private final VariableDeclarationNode varDeclaration;

    public ForStatementNode(
            ExpressionNode expression,
            BlockNode trueBlock,
            BlockNode elseBlock,
            VariableDeclarationNode varDeclaration
    ) {
        super(expression, trueBlock);
        this.elseBlock = elseBlock;
        this.varDeclaration = varDeclaration;
    }

    public VariableDeclarationNode getVarDeclaration() {
        return varDeclaration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForStatementNode that = (ForStatementNode) o;
        return Objects.equals(varDeclaration, that.varDeclaration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(varDeclaration);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitForStatementNode(this);
    }
}
