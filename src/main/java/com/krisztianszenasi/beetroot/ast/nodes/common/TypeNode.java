package com.krisztianszenasi.beetroot.ast.nodes.common;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSDeclarationTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSTypeSystem;
import com.krisztianszenasi.beetroot.semantic_analysis.type.TypeSystem;

abstract public class TypeNode extends Node {
    public abstract BSType accept(BSDeclarationTypeBuilder typeBuilder, TypeSystem typeSystem);
}
