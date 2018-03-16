package com.jude1993.connect;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Author: Jude
 * Date: 2018/3/17
 * Email: 893860859@qq.com
 */
public class Documents {
    public static Document getDocument(String url) throws Exception {
        return Jsoup.connect(url).get();
    }

}
