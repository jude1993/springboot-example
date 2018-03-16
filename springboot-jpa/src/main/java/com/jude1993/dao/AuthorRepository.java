package com.jude1993.dao;

import com.jude1993.beans.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Repository;
>>>>>>> 48495ea645d6c1464f082cf6e83fb46949a7cbba

import java.util.List;

/**
 * Author: Jude
 * Date: 2018/3/15
 * Email: 893860859@qq.com
 */
<<<<<<< HEAD
=======
@Repository
>>>>>>> 48495ea645d6c1464f082cf6e83fb46949a7cbba
public interface AuthorRepository extends JpaRepository<Author,Long> {
    List<Author> findAll();

    @Query("from Author where id = :id")
    Author findAuthor(@Param("id") Long id);
}
