package com.jude1993.dao;

import com.jude1993.beans.Author;

import java.util.List;

/**
 * Author: Jude
 * Date: 2018/3/15
 * Email: 893860859@qq.com
 */
public interface AuthorDao {
    List<Author> findAll();
    Author findAuthor(Long id);
}
