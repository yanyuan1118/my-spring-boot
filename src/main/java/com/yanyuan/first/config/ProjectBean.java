package com.yanyuan.first.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author: yanyuan
 * @Date: 2020/9/21 17:01
 * @Description:
 */
@ConfigurationProperties(prefix = "first.project")
@Configuration
public class ProjectBean {
    private String name;
    private String created;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", created='" + created + '\'' +
                '}';
    }
}
