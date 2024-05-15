package com.krisztianszenasi.beetroot.semantic_analysis.type;

import java.util.HashSet;
import java.util.Objects;

public class BSSimpleType extends BSType {
    private final String name;
    private final HashSet<BSType> parents = new HashSet<>();

    public BSSimpleType(String name) {
        this.name = name;
    }

    public void addParent(BSType parent) {
        parents.add(parent);
    }

    public boolean isCompatibleWith(BSType otherType) {
        return equals(otherType) || parents.stream().anyMatch(parent -> parent.isCompatibleWith(otherType));
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BSSimpleType that = (BSSimpleType) o;
        return Objects.equals(name, that.name) && Objects.equals(parents, that.parents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parents);
    }
}
