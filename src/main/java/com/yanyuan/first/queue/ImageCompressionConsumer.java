package com.yanyuan.first.queue;

import com.alibaba.fastjson.JSONObject;
import com.yanyuan.first.common.QueueConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.yanyuan.first.common.QueueConstants.QUEUE_KEY;

/**
 * @author: yanyuan
 * @Date: 2020/10/27 11:13
 * @Description:
 */
@Slf4j
@Component
public class ImageCompressionConsumer {

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(QueueConstants.EXCHANGE_IMG),
            key = QueueConstants.QUEUE_KEY,
            value = @Queue(QueueConstants.QUEUE_NAME)
    ))
    public void process(String message){
        log.info("处理图片压缩请求: {} ", message);
    }
}
