package com.krisztianszenasi.beetroot.semantic_analysis.type.bs_type.helpers;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

public class BSTypeAlwaysEqualsAndAlwaysCompatible extends BSType {

    @Override
    public boolean isCompatibleWith(BSType type) {
        return true;
    }

    @Override
    public BSType acceptGetCommonType(BSType type) {
        return null;
    }

    @Override
    public boolean acceptIsCompatible(BSType type) {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
