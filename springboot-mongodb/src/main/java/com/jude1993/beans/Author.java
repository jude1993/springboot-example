<<<<<<< HEAD
package com.jude1993.mongodb.beans;
=======
package com.jude1993.beans;
>>>>>>> 48495ea645d6c1464f082cf6e83fb46949a7cbba

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
