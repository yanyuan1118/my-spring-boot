package com.yanyuan.first.web.controller;

import com.yanyuan.first.netty.NettyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yanyuan
 * @Date: 2020/11/13 18:51
 * @Description:
 */
@RestController
public class MsgController {

    @Autowired
    NettyClient nettyClient;

    @GetMapping("msg/{msg}")
    public String sendMsg(@PathVariable("msg") String msg){
        nettyClient.sendMsg(msg);
        return "ok";
    }
}
