package com.yanyuan.first.dao;

import com.yanyuan.first.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: yanyuan
 * @Date: 2020/9/28 16:28
 * @Description:
 */
@SpringBootTest
@Slf4j
class CustomerRepositoryTest {

    @Autowired
    CustomerRepository repository;

    @Test
    void save(){
        repository.deleteAll();
        repository.save(new Customer("lisi", "李", "四"));
        repository.save(new Customer("wangwu", "王", "五"));
        repository.save(new Customer("zhaoliu", "赵", "六"));
        repository.save(new Customer("xiaoba", "小", "八"));
    }

    @Test
    void deleteById(){
        repository.deleteById("xiaoba");
    }

    @Test
    void update(){
        repository.save(new Customer("wangwu", "李", "九"));
    }

    @Test
    void findAll(){
        List<Customer> list = repository.findAll();
        log.info(" list : {}", list);
    }

    @Test
    void findByFirstName() {
        List<Customer> list = repository.findByFirstName("李");
        log.info(" findByFirstName list : {}", list);
    }

    @Test
    void findByLastName() {

        List<Customer> list = repository.findByLastName("五");
        log.info(" findByFirstName list : {}", list);
    }
}