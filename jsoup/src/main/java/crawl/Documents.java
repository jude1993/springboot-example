package main.java.crawl;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: jude
 * @Date: Create in 11:37 2018/3/16
 * @Description:
 */
public class Documents {


    public static Document getDocument(String url) throws IOException {
        return Jsoup.connect(url).get();
    }

    public static List<Connection> getDocument(List<String> urlList) throws Exception {
        return urlList.stream()
                .map(Jsoup::connect).collect(Collectors.toList());
    }


}
