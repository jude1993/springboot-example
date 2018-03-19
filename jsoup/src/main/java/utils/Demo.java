package main.java.utils;

import main.java.crawl.Documents;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: jude
 * @Date: Create in 15:07 2018/3/16
 * @Description:
 */
public class Demo {
    @Test
    public void crawlOnePage() {
        Document document = null;
        try {
            document = Documents.getDocument("https://www.zhihu.com/question/28296375");
        } catch (IOException e) {
            e.printStackTrace();
        }
        String title = document.title();
        Element head = document.head();
        int nodeSize = document.childNodeSize();
        Element child = document.child(0);
        String content = document.getElementsByTag("h1").text();
        List<String> collect = document.select("span[class=Tag-content]").stream().map(ele -> {
            return ele.child(0).child(0).text();
        }).collect(Collectors.toList());

        System.out.println(collect);
    }
}
