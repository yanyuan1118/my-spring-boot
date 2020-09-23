package com.yanyuan.first.scan;

import com.yanyuan.first.FirstController;
import com.yanyuan.first.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

/**
 * @author: yanyuan
 * @Date: 2020/9/21 16:03
 * @Description:
 */
@Configuration
@ComponentScan(
        value = "com.yanyuan",
        useDefaultFilters=true,
        includeFilters={
                @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,classes={UserService.class})
        })
public class MainScanConfig {
}
