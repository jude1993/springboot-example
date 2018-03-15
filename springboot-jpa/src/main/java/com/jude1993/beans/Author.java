package com.jude1993.beans;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Author: Jude
 * Date: 2018/3/15
 * Email: 893860859@qq.com
 */
@Getter
@Setter
@Entity
@Table(name="t_author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="real_name")
    private String realName;

    @Column(name="nick_name")
    private String nickName;
}
