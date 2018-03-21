package com.jude1993.utils;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

/**
 * @Author: jude
 * @Date: Create in 17:18 2018/3/15
 * @Description:
 */
public class GetResource {
    @Test
    public void testContent()throws Exception{
        Connection connect = Jsoup.connect("https://www.zhihu.com/question/61403505");
        Document document = connect.get();
        String title = document.title();
        Element body = document.body();
        Elements main = document.getElementsByTag("main");
        String content = document.getElementsByTag("h1").text();
        Elements ele = document.select("div[class=QuestionHeader-content]");
        Elements tags = document.select("span[class=Tag-content]");

        for(Element tag : tags){
            System.out.println(tag.child(0).child(0).text());
        }
        System.out.println(content);
    }


}
