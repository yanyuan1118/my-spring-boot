package com.yanyuan.first.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

/**
 * @author: yanyuan
 * @Date: 2020/9/28 15:18
 * @Description:
 */
@Data
@Builder
public class Article {
    @Id
    private String id;
    private String title;
    private String content;
    private String status;
    private Date createTime;
}
