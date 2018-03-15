package com.jude1993.mongodb.config;

import com.mongodb.MongoClient;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Author: Jude
 * Date: 2018-3-14
 * Email: 893860859@qq.com
 */
public class MongoConfig extends AbstractMongoConfiguration {
    private String mongoHost = "localhost";
    private int mongoPort = 27017;
    private String dbName = "springboot-example";

    private static final String MONGO_BASE_PACKAGE = "com.lianggzone.springboot.action.data.mongodb.entity";

    @Autowired
    private ApplicationContext appContext;

    @Override
    protected String getDatabaseName() {
        return dbName;
    }

    @Override
    public MongoClient mongoClient() {
        MongoClient mongoClient = new MongoClient(mongoHost, mongoPort);
        return mongoClient;
    }

    @Override
    @Bean
    public MongoTemplate mongoTemplate() throws Exception{
        return new MongoTemplate(mongoClient(),getDatabaseName());
    }
}
