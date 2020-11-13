package com.yanyuan.first;

import com.yanyuan.first.server.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.net.InetSocketAddress;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class FirstApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstApplication.class, args);

		NettyServer nettyServer = new NettyServer();
		nettyServer.start(new InetSocketAddress("127.0.0.1", 8090));
	}

}
