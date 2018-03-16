package com.jude1993.utils;

import com.jude1993.connect.Documents;
import org.jsoup.nodes.Document;
import org.junit.Test;

/**
 * Author: Jude
 * Date: 2018/3/17
 * Email: 893860859@qq.com
 */
public class ParseUtil {

    public static String getHeader(Document document) {
        return document.select("h1[class=QuestionHeader-title]").text();
    }

    @Test
    public void getHeaderTest() throws Exception {
        Document document = Documents.getDocument("https://www.zhihu.com/question/61403505");
        String header = getHeader(document);
        System.out.println(header);
    }
}
