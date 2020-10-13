package com.yanyuan.first.dao;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: yanyuan
 * @Date: 2020/10/13 10:29
 * @Description:
 */
@SpringBootTest
@Slf4j
class RedisHelperTest {

    @Autowired
    RedisHelper redisHelper;

    @Test
    void setKey() {
        redisHelper.setKey("token", UUID.randomUUID().toString());
    }

    @Test
    void getValue() {
        log.info("getValue key: token, value: {}", redisHelper.getValue("token"));
    }
}