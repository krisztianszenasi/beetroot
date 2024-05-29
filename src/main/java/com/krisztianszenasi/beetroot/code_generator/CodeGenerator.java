package com.krisztianszenasi.beetroot.code_generator;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.io.FileWriter;
import java.io.IOException;

abstract public class CodeGenerator extends AstVisitor<String> {

    public void write(Node tree, String fileName) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(visit(tree));
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
