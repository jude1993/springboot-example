<<<<<<< HEAD
package com.jude1993.mongodb.dao;

import com.jude1993.mongodb.beans.Author;
=======
package com.jude1993.dao;

import com.jude1993.beans.Author;
>>>>>>> 48495ea645d6c1464f082cf6e83fb46949a7cbba
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: Jude
 * Date: 2018/3/14
 * Email: 893860859@qq.com
 */
@Repository
public class AuthorDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void add(Author author){
        this.mongoTemplate.insert(author);
    }

    public void update(Author author){
        this.mongoTemplate.save(author);
    }

    public void delete(Long id){
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(id));
        this.mongoTemplate.remove(query,Author.class);
    }

    public Author findAuthor(Long id){
        return this.mongoTemplate.findById(id,Author.class);
    }

    public List<Author> findAuthorList(){
        Query query = new Query();
        return this.mongoTemplate.find(query,Author.class);
    }
}
