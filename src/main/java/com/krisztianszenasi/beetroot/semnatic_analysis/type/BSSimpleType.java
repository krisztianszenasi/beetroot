package com.krisztianszenasi.beetroot.semnatic_analysis.type;

import java.util.HashSet;

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
        return this == otherType || parents.stream().anyMatch(parent -> parent.isCompatibleWith(otherType));
    }


    public String getName() {
        return name;
    }
}
