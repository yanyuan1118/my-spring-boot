package com.yanyuan.first.service.impl;

import com.yanyuan.first.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: yanyuan
 * @Date: 2020/10/21 10:44
 * @Description:
 */
@SpringBootTest
@Slf4j
class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    void getById() {
    }

    @Test
    void queryList() {
    }

    @Test
    void add() {
    }

    @Test
    void updateById() {
    }

    @Test
    void deleteById() {
    }

    /**
     * 赠送积分
     */
    @Test
    void donateCredits() {
        try {
            userService.donateCredits(1, 2, 5);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        log.info("formUser : {}", userService.getById(1));
        log.info("toUser : {}", userService.getById(2));
    }
}