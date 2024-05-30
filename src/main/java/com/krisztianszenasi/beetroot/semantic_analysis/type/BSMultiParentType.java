package com.krisztianszenasi.beetroot.semantic_analysis.type;

import java.util.ArrayList;
import java.util.List;

public class BSMultiParentType extends BSNamedType {

    private final List<BSType> parents;

    public BSMultiParentType(String name) {
        super(name, null);
        parents = new ArrayList<>();
    }

    public void addParent(BSType parent) {
        parents.add(parent);
    }

    @Override
    public boolean isCompatibleWith(BSType type) {
        for(BSType parent: parents) {
            this.parent = parent;
            if(super.isCompatibleWith(type)) {
                return true;
            }
        }
        parent = null;
        return false;
    }
}
