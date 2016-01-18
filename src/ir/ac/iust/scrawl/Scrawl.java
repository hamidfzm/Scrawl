package ir.ac.iust.scrawl;

import ir.ac.iust.scrawl.scrawlib.Helper;
import jasmin.Main;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

/**
 * This class is the main class for compiler
 * Created by bardia on 1/18/16.
 */
public class Scrawl {
    public static void main(String[] args) throws IOException {
        new Helper();
        String bytecode = "";

        // parse code with generated parser
        ScrawlLexer lex = new ScrawlLexer(new ANTLRFileStream("/home/bardia/scrawl/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        ScrawlParser g = new ScrawlParser(tokens);
        try {
            bytecode = g.root();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

        // create binary file

        PrintWriter writer = new PrintWriter("out/temp.j", "UTF-8");
        writer.print(bytecode);
        writer.close();
        URL location = Scrawl.class.getProtectionDomain().getCodeSource().getLocation();

        (new Main()).assemble(location.getFile() +"temp.j");
    }
}
