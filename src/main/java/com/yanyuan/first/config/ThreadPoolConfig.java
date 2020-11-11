package com.yanyuan.first.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 线程池配置
 * @author yanyuan
 */
@Data
@ConfigurationProperties(prefix = "thread.pool")
public class ThreadPoolConfig {
    private int corePoolSize;

    private int maxPoolSize;

    private int keepAliveSeconds;

    private int queueCapacity;
}
