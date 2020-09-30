package com.yanyuan.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * @author: yanyuan
 * @Date: 2020/9/28 15:18
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {

    @Id
    private String id;
    private String title;
    private String content;
    private Integer praiseCount;
    private Integer commentCount;
    private Integer visitCount;
    private Author author;

}
