package com.yanyuan.first.service;

import com.yanyuan.first.entity.Student;

import java.util.List;

/**
 * @author: yanyuan
 * @Date: 2020/9/23 10:26
 * @Description:
 */
public interface StudentService {
    /**
     * 查询全部学生
     * @return
     */
   List<Student> queryList();
    /**
     * 根据ID查询
     * @return
     */
   Student getById(Integer id);
    /**
     * 修改全部学生
     * @return
     */
   int update(Student student);
    /**
     * 增加学生
     * @return
     */
   int add(Student student);
}
