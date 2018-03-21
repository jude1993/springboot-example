package com.jude1993.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: jude
 * @Date: Create in 18:03 2018/3/19
 * @Description:
 */
@Getter
@ToString
@Setter
public class Answer {
    private String author;
    private String signature;
    private int voteButtonNumber;
    private int commentNumber;
    private String responseTime;
    private String content;

    public static Answer init(String author, String signature, int voteButtonNumber, int commentNumber, String responseTime, String content){
        Answer answer = new Answer();
        answer.setAuthor(author);
        answer.setSignature(signature);
        answer.setVoteButtonNumber(voteButtonNumber);
        answer.setCommentNumber(commentNumber);
        answer.setResponseTime(responseTime);
        answer.setContent(content);
        return answer;
    }
}
