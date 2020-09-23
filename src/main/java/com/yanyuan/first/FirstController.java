package com.yanyuan.first;

import com.yanyuan.first.config.CustomBean;
import com.yanyuan.first.config.ProjectBean;
import com.yanyuan.first.scan.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yanyuan
 * @Date: 2020/9/9 15:55
 * @Description: 测试类
 */
@RestController
public class FirstController {

    @Value("${first.project.name:springboot}")
    private String createName;



    @Value("${first.project.created:}")
    private String created;

    @GetMapping("info")
    private Object info(){
        return createName + " : " + created;
    }


    @Autowired
    ProjectBean projectBean;

    @GetMapping("bean")
    private Object bean(){
        return projectBean.toString();
    }

    @GetMapping("first")
    public Object first(){
        return "first spring boot";
    }


    @Autowired
    CustomBean customBean;

    @GetMapping("custom")
    private Object custom(){
        return customBean.toString();
    }
}
