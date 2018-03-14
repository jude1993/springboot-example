package com.jude1993.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Author: Jude
 * Date: 2018/3/14
 * Email: 893860859@qq.com
 */
@Configuration
@EnableJpaRepositories("com.lianggzone.springboot.action.data.jpa")
@EntityScan("com.lianggzone.springboot.action.data.jpa.entity")
public class JPAConfig {}
