package ast.nodes.common.type_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.common.TypeNode;

public class TypeNeverEquals extends TypeNode {
    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
