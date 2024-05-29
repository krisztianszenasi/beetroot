package com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration;

import com.krisztianszenasi.beetroot.ast.nodes.common.type.TypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.Objects;

public class FunctionDefinitionNode extends DeclarationBlockNode {

    private String name;
    private TypeNode returnType;
    private ParameterListNode parameters;

    public FunctionDefinitionNode(
            String name,
            TypeNode returnType,
            ParameterListNode parameters,
            BlockNode block
    ) {
        super(block);
        this.name = name;
        this.returnType = returnType;
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeNode getReturnType() {
        return returnType;
    }

    public void setReturnType(TypeNode returnType) {
        this.returnType = returnType;
    }

    public ParameterListNode getParameters() {
        return parameters;
    }

    public void setParameters(ParameterListNode parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FunctionDefinitionNode that = (FunctionDefinitionNode) o;
        return Objects.equals(name, that.name) && Objects.equals(returnType, that.returnType) && Objects.equals(parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, returnType, parameters);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitFunctionDefinitionNode(this);
    }
}
