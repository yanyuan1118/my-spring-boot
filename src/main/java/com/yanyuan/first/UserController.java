package com.yanyuan.first;

import com.yanyuan.first.scan.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yanyuan
 * @Date: 2020/9/21 16:11
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;



    @GetMapping("user")
    public Object user(){
        System.out.println("userService : " + userService);
        return "user controller ";
    }
}
