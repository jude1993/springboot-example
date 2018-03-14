package com.jude1993.dao;

import com.jude1993.beans.Author;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Author: Jude
 * Date: 2018/3/15
 * Email: 893860859@qq.com
 */
@Repository
public class AuthorDaoImpl implements AuthorDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Author> findAll(){
        return this.entityManager
                .createQuery("select t from Author t",Author.class)
                .getResultList();
    }

    @Override
    public Author findAuthor(Long id){
        return this.entityManager
                .createQuery("select t from Author t where id = ?", Author.class)
                .setParameter(1, id)
                .getSingleResult();
    }
}
