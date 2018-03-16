package com.jude1993.service;

import com.jude1993.connect.Documents;
import com.jude1993.utils.ParseUtil;
import org.jsoup.nodes.Document;

import java.util.Map;

/**
 * Author: Jude
 * Date: 2018/3/17
 * Email: 893860859@qq.com
 */
public class ParseService {

    public Map<String, Object> parse(String url) throws Exception {
        Document document = Documents.getDocument(url);
        String header = ParseUtil.getHeader(document);
        return null;
    }
}
