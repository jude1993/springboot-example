package com.jude1993.service;

import com.jude1993.beans.Author;
import com.jude1993.dao.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Service;
>>>>>>> 48495ea645d6c1464f082cf6e83fb46949a7cbba

import java.util.List;

/**
 * Author: Jude
 * Date: 2018/3/15
 * Email: 893860859@qq.com
 */
<<<<<<< HEAD
=======
@Service("jpa.authorService")
>>>>>>> 48495ea645d6c1464f082cf6e83fb46949a7cbba
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAll(){
        return authorRepository.findAll();
    }

    public Author findAuthor(Long id){
        return this.authorRepository.findAuthor(id);
    }
}
