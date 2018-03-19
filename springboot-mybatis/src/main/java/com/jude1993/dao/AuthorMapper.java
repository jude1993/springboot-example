package com.jude1993.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @Author: jude
 * @Date: Create in 15:00 2018/3/15
 * @Description:
 */
@Mapper
public interface AuthorMapper {
    @Insert("insert into t_author(real_name, nick_name) values(#{real_name},#{nick_name})")
    int add(@Param("real_name")String realName, @Param("nick_name")String nickName);

    @Update("update t_author set real_name=#{real_name},nick_name=#{nick_name}where id=#{id}")
    int update(@Param("real_name")String realName,@Param("nick_name")String nickName,@Param("id")Long id);

}
