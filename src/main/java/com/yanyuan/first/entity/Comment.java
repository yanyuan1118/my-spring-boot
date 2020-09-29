package com.yanyuan.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

/**
 * @author: yanyuan
 * @Date: 2020/9/29 09:01
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    private int sendUserId;
    private int toUserId;
    private String content;
}
