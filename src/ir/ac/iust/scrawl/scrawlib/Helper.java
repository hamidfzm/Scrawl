package ir.ac.iust.scrawl.scrawlib;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by bardia on 1/18/16.
 */

public class Helper {
    static public Document Get(String url){
        try {
            return Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
