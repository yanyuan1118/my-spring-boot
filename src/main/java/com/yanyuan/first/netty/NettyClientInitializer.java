package com.yanyuan.first.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @author: yanyuan
 * @Date: 2020/11/13 18:17
 * @Description:
 */
public class NettyClientInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast("decode", new StringDecoder());
        socketChannel.pipeline().addLast("encode", new StringEncoder());
        socketChannel.pipeline().addLast(new NettyClientHandler());
    }
}
