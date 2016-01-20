package ir.ac.iust.scrawl.scrawlib;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class Helper {
    static public Document Get(String url){
        if(url==null) {
            System.out.println("url is null");
            return null;
        }
        try {
            return Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
