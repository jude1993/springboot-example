package com.jude1993.service;

import com.jude1993.beans.Author;
import com.jude1993.dao.AuthorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Jude
 * Date: 2018/3/15
 * Email: 893860859@qq.com
 */
@Service("jpa.authorService2")
public class AuthorService2 {
    @Autowired
    private AuthorDao authorDao;

    public List<Author> findAll(){
        return this.authorDao.findAll();
    }
    public Author findAuthor(Long id){
        return this.authorDao.findAuthor(id);
    }
}
