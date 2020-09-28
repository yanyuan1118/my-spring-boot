package com.yanyuan.first.dao;

import com.yanyuan.first.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author: yanyuan
 * @Date: 2020/9/28 16:25
 * @Description:
 */
public interface  CustomerRepository extends MongoRepository<Customer, String> {
    List<Customer> findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
}
