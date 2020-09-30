package com.yanyuan.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * @author: yanyuan
 * @Date: 2020/9/28 15:18
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    public String id;

    public String firstName;
    public String lastName;

}
