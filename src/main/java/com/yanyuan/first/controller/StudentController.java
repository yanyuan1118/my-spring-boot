package com.yanyuan.first.controller;

import com.yanyuan.first.common.R;
import com.yanyuan.first.entity.Student;
import com.yanyuan.first.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: yanyuan
 * @Date: 2020/9/23 10:38
 * @Description:
 */
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("stu/list")
    public R.Result queryList(){
        return R.success(studentService.queryList());
    }

    @GetMapping("stu/{id}")
    public R.Result getById(@PathVariable("id") Integer id){
        return R.success(studentService.getById(id));
    }

    @PostMapping("stu")
    public R.Result add(@RequestBody Student student){
        return R.success(studentService.add(student));
    }

    @PutMapping("stu")
    public R.Result update(@RequestBody Student student){
        return R.success(studentService.update(student));
    }
}
