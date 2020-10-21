package com.yanyuan.first.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author: yanyuan
 * @Date: 2020/10/13 11:47
 * @Description:
 */
@Data
@Builder
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Integer credits;
    private Date createTime;
}
