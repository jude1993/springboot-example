package main.java.utils;

import main.java.beans.Answer;
import main.java.crawl.Documents;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: jude
 * @Date: Create in 17:34 2018/3/19
 * @Description:
 */
public class ParseUtil {

    /**获取问题标题*/
    public static String getHeader(Document document) {
        return document.select("h1[class=QuestionHeader-title]").text();
    }

    /**获取问题标签*/
    public static List<String> getTags(Document document) {
        return document.select("div[class=QuestionHeader-topics]").stream()
                .map(Element::text).collect(Collectors.toList());
    }

    /**获取问题描述*/
    public static String getQuestionDetail(Document document) {
        return document.select("div[class=QuestionHeader-detail]").text();
    }

    /**获取所有答案*/
    public static List<Answer> getAnswers(Document document) {
        Elements elements = document.select("div[class=List-item]");
        System.out.println(elements.size());
        return null;
    }

    public static int getAnswerNumber(Document document){
        Elements elements = document.select("h4[class=List-headerText]");
        Element child = elements.first().child(0);
        return Integer.parseInt(child.text().split(" ")[0]);
    }



    @Test
    public void getHeaderTest() throws Exception {
        Document document = Documents.getDocument("https://www.zhihu.com/question/61403505");
        String header = getHeader(document);
        String detail = getQuestionDetail(document);
        System.out.println(getAnswerNumber(document));
    }

}