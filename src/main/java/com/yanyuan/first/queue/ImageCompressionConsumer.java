package com.yanyuan.first.queue;

import com.alibaba.fastjson.JSONObject;
import com.yanyuan.first.common.QueueConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @author: yanyuan
 * @Date: 2020/10/27 11:13
 * @Description:
 */
@Slf4j
@Component
public class ImageCompressionConsumer {

    /**
     * 消息发送到交换机，交换机通过路由routing key发送到对应的队列。
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(QueueConstants.EXCHANGE_IMG),
            key = QueueConstants.ROUTING_KEY,
            value = @Queue(QueueConstants.QUEUE_NAME)
    ))
    public void process(String message){
        log.info("处理图片压缩请求: {} ", message);
    }
}
