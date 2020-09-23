package com.yanyuan.first.dao;

import com.yanyuan.first.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


/**
 * @author: yanyuan
 * @Date: 2020/9/23 10:19
 * @Description:
 */
public interface StudentDao extends JpaRepository<Student, Integer> {

}
