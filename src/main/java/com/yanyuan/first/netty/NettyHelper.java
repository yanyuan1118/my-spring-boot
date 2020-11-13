package com.yanyuan.first.netty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: yanyuan
 * @Date: 2020/11/13 18:47
 * @Description:
 */
@Component
public class NettyHelper {

    @Autowired
    NettyClient nettyClient;

    public void sendMsg(String msg){
        nettyClient.sendMsg(msg);
    }
}
