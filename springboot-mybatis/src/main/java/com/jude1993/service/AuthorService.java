package com.jude1993.service;

import com.jude1993.dao.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: jude
 * @Date: Create in 15:05 2018/3/15
 * @Description:
 */
@Service
public class AuthorService {
    @Autowired
    private AuthorMapper authorMapper;

    public int add(String realName,String nickName){
        return this.authorMapper.add(realName,nickName);
    }

    public int update(String realName,String nickName,Long id){
        return this.authorMapper.update(realName,nickName,id);
    }
}
