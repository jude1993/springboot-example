package com.jude1993.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Author: Jude
 * Date: 2018/3/14
 * Email: 893860859@qq.com
 */
@Document(collection="author")
@Getter
@Setter
@ToString
public class Author {
    @Id
    private Long id;
    private String realName;
    private String nickName;

}
