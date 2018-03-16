package com.jude1993.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author: jude
 * @Date: Create in 14:59 2018/3/15
 * @Description:
 */
@Data
public class Author {
    private Long id;
    @JSONField(name="real_name")
    private String realName;

    @JSONField(name="nick_name")
    private String nickName;
}
