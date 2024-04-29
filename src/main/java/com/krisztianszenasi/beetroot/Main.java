package com.krisztianszenasi.beetroot;

import com.krisztianszenasi.beetroot.ast.AstBuilder;
import com.krisztianszenasi.beetroot.ast.nodes.FileNode;
import com.krisztianszenasi.beetroot.gen.BeetrootLexer;
import com.krisztianszenasi.beetroot.gen.BeetrootParser;
import com.krisztianszenasi.beetroot.gen.BeetrootParser.FileContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromFileName("src/main/java/com/krisztianszenasi/beetroot/example.bs");
        BeetrootLexer lexer = new BeetrootLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        BeetrootParser parser = new BeetrootParser(commonTokenStream);
        FileContext file = parser.file();
        FileNode ast = (FileNode) new AstBuilder().visitFile(file);

        System.out.println(ast.toString());
    }
}