package com.jude1993.dao;

import com.jude1993.beans.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Author: Jude
 * Date: 2018/3/15
 * Email: 893860859@qq.com
 */
public interface AuthorRepository extends JpaRepository<Author,Long> {
    List<Author> findAll();

    @Query("from Author where id = :id")
    Author findAuthor(@Param("id") Long id);
}
