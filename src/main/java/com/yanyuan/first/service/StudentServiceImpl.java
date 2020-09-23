package com.yanyuan.first.service;

import com.yanyuan.first.dao.StudentDao;
import com.yanyuan.first.entity.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author: yanyuan
 * @Date: 2020/9/23 10:30
 * @Description: 学生服务类
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> queryList() {
        return studentDao.findAll();
    }

    @Override
    public Student getById(Integer id) {
        return studentDao.findById(id).get();
    }

    @Override
    public int update(Student student) {
        Student result = studentDao.saveAndFlush(student);
        return result.getId();
    }

    @Override
    public int add(Student student) {
        student.setStuNo(System.currentTimeMillis());
        student.setCreateTime(new Date());
        Student result = studentDao.save(student);
        return result.getId();
    }
}
