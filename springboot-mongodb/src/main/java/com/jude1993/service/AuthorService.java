<<<<<<< HEAD
package com.jude1993.mongodb.service;

import com.jude1993.mongodb.beans.Author;
import com.jude1993.mongodb.dao.AuthorDao;
=======
package com.jude1993.service;

import com.jude1993.beans.Author;
import com.jude1993.dao.AuthorDao;
>>>>>>> 48495ea645d6c1464f082cf6e83fb46949a7cbba
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Jude
 * Date: 2018/3/14
 * Email: 893860859@qq.com
 */
@Service
public class AuthorService {
    @Autowired
    private AuthorDao authorDao;

    public void add(Author author){
        this.authorDao.add(author);
    }

    public void update(Author author){
        this.authorDao.update(author);
    }

    public void delete(Long id) {
        this.authorDao.delete(id);
    }

    public Author findAuthor(Long id) {
        return this.authorDao.findAuthor(id);
    }

    public List<Author> findAuthorList() {
        return this.authorDao.findAuthorList();
    }
}
