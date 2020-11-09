package com.yanyuan.first.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yanyuan
 * @Date: 2020/9/9 15:55
 * @Description: 测试类
 */
@RestController
public class FirstController {

    @Value("${filepath}")
    private String filepath;

    @GetMapping("info")
    private Object info(){
        return " filepath = " + filepath;
    }
}
