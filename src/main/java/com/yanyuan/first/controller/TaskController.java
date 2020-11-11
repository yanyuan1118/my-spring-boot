package com.yanyuan.first.controller;

import com.yanyuan.first.task.AsyncTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author: yanyuan
 * @Date: 2020/11/11 19:24
 * @Description:
 */
@RestController
@Slf4j
public class TaskController {

    @Autowired
    AsyncTask asyncTask;

    @GetMapping("task")
    public String task() throws InterruptedException, ExecutionException {
        long times = System.currentTimeMillis();
        asyncTask.doTask();
        return "任务执行耗时:"+ (System.currentTimeMillis() - times) + "ms";
    }

    /**
     * 异步任务
     * @return
     * @throws InterruptedException
     * @throws ExecutionException
     */
    @GetMapping("async-task")
    public String asyncTask() throws InterruptedException, ExecutionException {
        long times = System.currentTimeMillis();
        asyncTask.doAsyncTask();
        return "任务执行耗时:"+ (System.currentTimeMillis() - times) + "ms";
    }

    /**
     * 异步任务-获取执行结果
     * @return
     * @throws InterruptedException
     * @throws ExecutionException
     */
    @GetMapping("async-wait-result")
    public String asyncWaitResult() throws InterruptedException, ExecutionException {
        Future<String> future = asyncTask.doAsyncTask();
        while (true) {
            if(future.isDone()){
                log.info("async task complete, result = {}", future.get());
                return "异步执行结果：" + future.get();
            }
        }
    }
}
