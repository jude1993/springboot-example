package com.jude1993.utils;

import com.jude1993.connect.Documents;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: Jude
 * Date: 2018/3/17
 * Email: 893860859@qq.com
 */
public class ParseUtil {

    public static String getHeader(Document document) {
        return document.select("h1[class=QuestionHeader-title]").text();
    }

    public static List<String> getTags(Document document) {
        return document.select("div[class=QuestionHeader-topics]").stream()
                .map(Element::text).collect(Collectors.toList());
    }

    public static String getQuestionDetail(Document document) {
        return document.select("div[class=QuestionHeader-detail]").text();
    }

    public static String getAnswers(Document document) {
        Elements elements = document.select("div[class=List-item]");
        System.out.println(elements.size());
        return null;
    }

    @Test
    public void getHeaderTest() throws Exception {
        Document document = Documents.getDocument("https://www.zhihu.com/question/61403505");
        String header = getHeader(document);
        String detail = getQuestionDetail(document);
        getAnswers(document);
//        System.out.println(detail);
    }

}
