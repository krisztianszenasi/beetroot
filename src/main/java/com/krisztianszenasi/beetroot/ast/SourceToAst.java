package com.krisztianszenasi.beetroot.ast;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.gen.BeetrootLexer;
import com.krisztianszenasi.beetroot.gen.BeetrootParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;

import java.io.IOException;
import java.nio.file.Path;

public class SourceToAst {
    public static Node generateFrom(Path inputFile) {
        try{
            CharStream charStream = CharStreams.fromPath(inputFile);
            BeetrootLexer lexer = new BeetrootLexer(charStream);
            lexer.addErrorListener(ConsoleErrorListener.INSTANCE);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            BeetrootParser parser = new BeetrootParser(commonTokenStream);
            parser.addErrorListener(ConsoleErrorListener.INSTANCE);
            BeetrootParser.FileContext file = parser.file();
            return new AstBuilder().visit(file);
        } catch (IOException e) {
            System.out.printf("File '%s' does not exist.", inputFile);
            System.exit(0);
        }
        return null;
    }
}
