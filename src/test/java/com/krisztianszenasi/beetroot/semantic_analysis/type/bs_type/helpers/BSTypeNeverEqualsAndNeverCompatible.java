package com.krisztianszenasi.beetroot.semantic_analysis.type.bs_type.helpers;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

public class BSTypeNeverEqualsAndNeverCompatible extends BSType {
    @Override
    public boolean isCompatibleWith(BSType type) {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
