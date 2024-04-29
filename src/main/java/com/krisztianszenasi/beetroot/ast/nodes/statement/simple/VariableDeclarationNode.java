package com.krisztianszenasi.beetroot.ast.nodes.statement.simple;

import com.krisztianszenasi.beetroot.ast.nodes.common.TypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.enums.Mutability;

import java.util.Objects;

public class VariableDeclarationNode extends SimpleStatementNode{

    private final Mutability mutability;
    private final String variableName;
    private final TypeNode declarationType;
    private AssignmentStatementNode initialAssignment;

    public VariableDeclarationNode(
            Mutability mutability,
            String variableName,
            TypeNode declarationType
    ) {
        this.mutability = mutability;
        this.variableName = variableName;
        this.declarationType = declarationType;
    }

    public Mutability getMutability() {
        return mutability;
    }

    public String getVariableName() {
        return variableName;
    }

    public TypeNode getDeclarationType() {
        return declarationType;
    }

    public AssignmentStatementNode getInitialAssignment() {
        return initialAssignment;
    }

    public void setInitialAssignment(AssignmentStatementNode initialAssignment) {
        this.initialAssignment = initialAssignment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariableDeclarationNode that = (VariableDeclarationNode) o;
        return mutability == that.mutability && Objects.equals(variableName, that.variableName) && Objects.equals(declarationType, that.declarationType) && Objects.equals(initialAssignment, that.initialAssignment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mutability, variableName, declarationType, initialAssignment);
    }
}
