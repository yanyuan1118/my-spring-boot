package com.yanyuan.first.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author: yanyuan
 * @Date: 2020/11/11 18:49
 * @Description: 异步任务
 */
@Component
@Slf4j
public class AsyncTask {

    public String doTask() throws InterruptedException {
        log.info("thread name = {}, message = {}",
                Thread.currentThread().getName(),
                "task start");
        //等待3秒
        TimeUnit.SECONDS.sleep(3);
        log.info("thread name = {}, message = {}",
                Thread.currentThread().getName(),
                "task end");
        return "task complete";
    }


    /**
     * Async 对某个方法进行异步执行
     * @return
     * @throws InterruptedException
     */
    @Async("taskAsyncPool")
    public Future<String> doAsyncTask() throws InterruptedException {
        log.info("thread name = {}, message = {}", Thread.currentThread().getName(), "async start");
        //等待3秒
        TimeUnit.SECONDS.sleep(3);
        log.info("thread name = {}, message = {}", Thread.currentThread().getName(), "async end");
        return new AsyncResult<>("async execute complete");
    }
}
