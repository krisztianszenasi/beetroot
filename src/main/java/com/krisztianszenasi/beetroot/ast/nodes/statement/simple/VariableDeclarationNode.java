package com.krisztianszenasi.beetroot.ast.nodes.statement.simple;

import com.krisztianszenasi.beetroot.ast.nodes.common.TypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.enums.Mutability;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.Objects;

public class VariableDeclarationNode extends SimpleStatementNode{

    private final Mutability mutability;
    private final String variableName;
    private final TypeNode declarationType;
    private final ExpressionNode initialValue;

    public VariableDeclarationNode(
            Mutability mutability,
            String variableName,
            TypeNode declarationType,
            ExpressionNode initialValue
    ) {
        this.mutability = mutability;
        this.variableName = variableName;
        this.declarationType = declarationType;
        this.initialValue = initialValue;
    }

    public Mutability getMutability() {
        return mutability;
    }

    public String getVariableName() {
        return variableName;
    }

    public TypeNode getDeclarationType() { return declarationType; }
    public ExpressionNode getInitialValue() {  return initialValue; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariableDeclarationNode that = (VariableDeclarationNode) o;
        return mutability == that.mutability && Objects.equals(variableName, that.variableName) && Objects.equals(declarationType, that.declarationType) && Objects.equals(initialValue, that.initialValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mutability, variableName, declarationType, initialValue);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitVariableDeclarationNode(this);
    }
}
