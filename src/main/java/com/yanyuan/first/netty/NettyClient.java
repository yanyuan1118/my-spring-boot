package com.yanyuan.first.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author: yanyuan
 * @Date: 2020/11/13 18:19
 * @Description: 客户端
 */
@Slf4j
@Component
public class NettyClient {

    ChannelFuture future;

    @PostConstruct
    public void start(){
        EventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap()
                .group(group)
                //该参数的作用就是禁止使用Nagle算法，使用于小数据即时传输
                .option(ChannelOption.TCP_NODELAY, true)
                .channel(NioSocketChannel.class)
                .handler(new NettyClientInitializer());
        try {
            log.info("客户端连接成功...");
//            future = bootstrap.connect("127.0.0.1", 8090).sync();
            future = bootstrap.connect("127.0.0.1", 8090);
            future.channel().writeAndFlush("你好呀");
            //等待连接关闭
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            group.shutdownGracefully();
        }
    }

    public void sendMsg(String msg){
        future.channel().writeAndFlush(msg);
    }
}
