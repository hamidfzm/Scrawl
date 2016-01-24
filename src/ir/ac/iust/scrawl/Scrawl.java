package ir.ac.iust.scrawl;

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
        String inputPath = null;
        String outputName = "runnable";
        boolean jar = false;
        boolean jasmin = false;

        for(int i=0;i<args.length;i++) {
            switch (args[i]) {
                case "--help":
                case "-h":
                    System.out.println("usage: Scrawl [--output <output name>] [--jar] [--jasmin] <file> \n");
                    return;
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
                    break;
                default:
                    inputPath = args[i];
            }

        }

        if(inputPath==null){
            System.out.println("usage: Scrawl [--output <output name>] [--jar] [--jasmin] <file> \n");
            return;
        }

        String bytecode = "";

        // parse code with generated parser
        ScrawlLexer lex;
        try {
            lex = new ScrawlLexer(new ANTLRFileStream(inputPath, "UTF8"));
        } catch (IOException e) {
            System.out.println("File not found");
            return;
        }
        CommonTokenStream tokens = new CommonTokenStream(lex);
        ScrawlParser g = new ScrawlParser(tokens);
        try {
            bytecode = g.root();
        } catch (RecognitionException e) {
            e.printStackTrace();
            return;
        }

        File yourFile = new File("out/"+outputName+".j");
        File directory = new File(yourFile.getParentFile().getAbsolutePath());
        // create binary file
        if(!yourFile.exists()) {
            if(!directory.exists())
                directory.mkdirs();
            yourFile.createNewFile();
        }
        try {
            URL location = Scrawl.class.getProtectionDomain().getCodeSource().getLocation();
            URL jasmin_path = new URL(location,"../"+outputName+".j");
            System.out.println("Jasmin created in: "+jasmin_path);
            PrintWriter writer = new PrintWriter(jasmin_path.getPath(), "UTF-8");
            writer.print(bytecode);
            writer.close();

            if(jasmin)
                return;

            (new Main()).assemble(jasmin_path.getPath());
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
