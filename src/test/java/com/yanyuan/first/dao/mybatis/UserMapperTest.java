package com.yanyuan.first.dao.mybatis;

import com.yanyuan.first.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: yanyuan
 * @Date: 2020/10/13 11:57
 * @Description:
 */
@SpringBootTest
@Slf4j
class UserMapperTest {

    @Autowired
    UserMapper userMapper;


    @Test
    void getById() {
        log.info("getById id=1, user={}", userMapper.getById(1));
    }

    @Test
    void queryList() {
        log.info("queryList list={}", userMapper.queryList());

    }

    @Test
    void add() {
        User user = User.builder().name("July").age(7).build();
        int rows = userMapper.add(user);
        log.info("add user, rows = {}, id = {} ", rows, user.getId());
    }

    @Test
    void updateById() {
        User user = User.builder()
                .name("May五月")
                .age(5)
                .id(1)
                .build();
        int rows = userMapper.updateById(user);
        log.info("updateById , rows = {}, id = {} ", rows, user.getId());
    }

    @Test
    void deleteById() {
        int rows = userMapper.deleteById(3);
        log.info("deleteById , rows = {}, id = 3 ", rows);
    }

    @Test
    void batchInsert() {
        User userA = User.builder()
                .name("双十一")
                .age(5)
                .build();
        User userB = User.builder()
                .name("双十二")
                .age(6)
                .id(1)
                .build();
        List<User> params = Lists.newArrayList(userA, userB);
        int rows = userMapper.batchInsert(params);
        log.info(" rows = {}, params = {} ", rows, params);
        //user.getId() 获取生成主键ID
        User u = params.get(0);
        log.info("id = {}, name = {} ", u.getId(), u.getName());
    }
}