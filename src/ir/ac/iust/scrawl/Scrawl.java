package ir.ac.iust.scrawl;

import ir.ac.iust.scrawl.scrawlib.Helper;
import jasmin.Main;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.io.*;
import java.net.URL;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;

/**
 * This class is the main class for compiler
 * Created by bardia on 1/18/16.
 */
public class Scrawl {
    public static void main(String[] args) throws IOException {

        new Helper();

        String inputPath = "";
        String outputName = "runnable";
        boolean jar = false;
        boolean jasmin = false;

        for(int i=0;i<args.length;i++) {
            switch (args[i]) {
                case "--help":
                case "-h":
                    System.out.println("usage: Scrawl [--output <output name>] [--jar] [--jasmin] <file> \n");
                    break;
                case "--ouput":
                case "-o":
                    i++;
                    outputName = args[i];
                    break;
                case "--jar":
                    jar = true;
                    break;
                case "--jasmin":
                    jasmin = true;
                default:
                    inputPath = args[i];
            }

        }

        String bytecode = "";

        // parse code with generated parser
        ScrawlLexer lex = null;
        try {
            lex = new ScrawlLexer(new ANTLRFileStream(inputPath, "UTF8"));
        } catch (IOException e) {
            System.out.println("File not found");
        }
        CommonTokenStream tokens = new CommonTokenStream(lex);
        ScrawlParser g = new ScrawlParser(tokens);
        try {
            bytecode = g.root();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

        try {
            // create binary file
            PrintWriter writer = new PrintWriter("out/"+outputName+".j", "UTF-8");
            writer.print(bytecode);
            writer.close();
            URL location = Scrawl.class.getProtectionDomain().getCodeSource().getLocation();

            if(jasmin)
                return;

            (new Main()).assemble(location.getFile() +outputName+".j");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        if(jar){
            run();
        }
    }

    public static void run() throws IOException
    {
        Manifest manifest = new Manifest();
        manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
        manifest.getMainAttributes().put(Attributes.Name.MAIN_CLASS, "Scrawlout");
        JarOutputStream target = new JarOutputStream(new FileOutputStream("Scrawlout.jar"), manifest);
        add(new File("Scrawlout.class"), target);
        target.close();
    }

    private static void add(File source, JarOutputStream target) throws IOException
    {
        BufferedInputStream in = null;
        try
        {
            if (source.isDirectory())
            {
                String name = source.getPath().replace("\\", "/");
                if (!name.isEmpty())
                {
                    if (!name.endsWith("/"))
                        name += "/";
                    JarEntry entry = new JarEntry(name);
                    entry.setTime(source.lastModified());
                    target.putNextEntry(entry);
                    target.closeEntry();
                }
                for (File nestedFile: source.listFiles())
                    add(nestedFile, target);
                return;
            }

            JarEntry entry = new JarEntry(source.getPath().replace("\\", "/"));
            entry.setTime(source.lastModified());
            target.putNextEntry(entry);
            in = new BufferedInputStream(new FileInputStream(source));

            byte[] buffer = new byte[1024];
            while (true)
            {
                int count = in.read(buffer);
                if (count == -1)
                    break;
                target.write(buffer, 0, count);
            }
            target.closeEntry();
        }
        finally
        {
            if (in != null)
                in.close();
        }
    }
}
