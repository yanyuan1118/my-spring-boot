package com.yanyuan.first.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: yanyuan
 * @Date: 2020/11/11 18:55
 * @Description:
 */
@SpringBootTest
class AsyncTaskTest {

    @Autowired
    AsyncTask asyncTask;

    @Test
    void doTask() throws InterruptedException {

        asyncTask.doTask();

        //便于测试，等待两秒
        TimeUnit.SECONDS.sleep(2);
    }

    @Test
    void doAsyncTask() {
    }
}