package com.jude1993.controller;

import com.jude1993.beans.Author;
import com.jude1993.service.AuthorService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Jude
 * Date: 2018/3/15
 * Email: 893860859@qq.com
 */
@RestController("jpa.authorController2")
@RequestMapping(value = "/data/jpa/author2")
public class AuthorController2 {

    @Autowired
    private AuthorService2 authorService;

    /**
     * 查询用户列表
     */
    @RequestMapping(method = RequestMethod.GET)
    public Map<String, Object> getAuthorList(HttpServletRequest request) {
        List<Author> authorList = this.authorService.findAll();
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("total", authorList.size());
        param.put("rows", authorList);
        return param;
    }

    /**
     * 查询用户信息
     */
    @RequestMapping(value = "/{userId:\\d+}", method = RequestMethod.GET)
    public Author getAuthor(@PathVariable Long userId, HttpServletRequest request) {
        Author author = this.authorService.findAuthor(userId);
        if (author == null) {
            throw new RuntimeException("查询错误");
        }
        return author;
    }
}
