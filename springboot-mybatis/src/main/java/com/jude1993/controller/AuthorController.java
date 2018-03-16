package com.jude1993.controller;

import com.jude1993.beans.Author;
import com.jude1993.service.AuthorService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Author: jude
 * @Date: Create in 15:07 2018/3/15
 * @Description:
 */
@RestController
@RequestMapping("data/mybatis/author")
@MapperScan("com.lianggzone.springboot.action.data.mybatis.dao")
public class AuthorController {
    @Autowired
    private AuthorService authorServie;

    @RequestMapping(method= RequestMethod.POST)
    public void getAuthorList(@RequestBody Author author){
        this.authorServie.add(author.getRealName(),author.getNickName());
    }


}
