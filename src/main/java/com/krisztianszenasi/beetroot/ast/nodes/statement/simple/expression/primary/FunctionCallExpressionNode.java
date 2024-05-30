package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.Scope;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.expression_type.BSExpressionTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FunctionCallExpressionNode extends PrimaryExpressionNode{
    private final String functionName;
    private final List<ExpressionNode> arguments = new ArrayList<>();

    public FunctionCallExpressionNode(String functionName) {
        this.functionName = functionName;
    }

    public void addArgument(ExpressionNode argument) {
        arguments.add(argument);
    }

    public ExpressionNode getArgument(int idx) {
        return arguments.get(idx);
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    public String getFunctionName() {
        return functionName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FunctionCallExpressionNode that = (FunctionCallExpressionNode) o;
        return Objects.equals(functionName, that.functionName) && Objects.equals(arguments, that.arguments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionName, arguments);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitFunctionCallExpressionNode(this);
    }


    @Override
    public BSType accept(BSExpressionTypeBuilder builder, Scope scope) {
        return builder.getTypeForFunctionCallExpressionNode(this, scope);
    }
}
