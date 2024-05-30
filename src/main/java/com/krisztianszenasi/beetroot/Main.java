package com.krisztianszenasi.beetroot;

import com.krisztianszenasi.beetroot.ast.SourceToAst;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.cli_interface.CommandLineInterface;
import com.krisztianszenasi.beetroot.code_generator.PythonCodeGenerator;
import com.krisztianszenasi.beetroot.semantic_analysis.SemanticAnalyser;
import com.krisztianszenasi.beetroot.semantic_analysis.error.ErrorHandler;
import com.krisztianszenasi.beetroot.semantic_analysis.type_system.BSTypeSystem;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path inputFile = CommandLineInterface.handleArguments(args);
        Node treeRepresentation = SourceToAst.generateFrom(inputFile);

        SemanticAnalyser semanticAnalyser = new SemanticAnalyser(new BSTypeSystem(), new ErrorHandler());
        semanticAnalyser.visit(treeRepresentation);

        if(semanticAnalyser.wereAnyErrors()) {
            semanticAnalyser.printErrors();
        } else {
            PythonCodeGenerator generator = new PythonCodeGenerator();
            generator.write(treeRepresentation, args[0]);
        }
    }
}