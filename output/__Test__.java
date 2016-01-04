import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        scrawlLexer lex = new scrawlLexer(new ANTLRFileStream("/home/bardia/scrawl/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        scrawlParser g = new scrawlParser(tokens, 49100, null);
        try {
            g.code();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}