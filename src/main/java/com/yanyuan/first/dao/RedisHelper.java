package com.yanyuan.first.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * @author: yanyuan
 * @Date: 2020/10/13 10:26
 * @Description:
 */
@Component
public class RedisHelper {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public  void setKey(String key,String value){
        //2小时过期
        redisTemplate.opsForValue().set(key,value,2, TimeUnit.HOURS);
    }

    public String getValue(String key){
        return redisTemplate.opsForValue().get(key);
    }
}
