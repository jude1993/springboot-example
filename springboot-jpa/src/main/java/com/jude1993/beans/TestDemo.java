package com.jude1993.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: jude
 * @Date: Create in 17:04 2018/3/21
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class TestDemo {
    @Value("${author.realname}")
    private String realname;
    @Value("${author.nickanme}")
    private String nickname;

    @Test
    public void test1(){
        System.out.println(this.realname);
        System.out.println(this.nickname);
        new ThreadLocal<>();
    }
}
