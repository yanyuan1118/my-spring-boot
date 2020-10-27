package com.yanyuan.first.queue;

import com.alibaba.fastjson.JSONObject;
import com.yanyuan.first.common.QueueConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: yanyuan
 * @Date: 2020/10/27 11:12
 * @Description: 图片压缩生产者
 */
@Component
@Slf4j
public class ImageCompressionProducer {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String imgUrl, String style){
        log.info("图片压缩请求：imgUrl = {}， style = {}", imgUrl, style);
        Map<String, String> requestParam = new ConcurrentHashMap();
        requestParam.put("imgUrl", imgUrl);
        requestParam.put("style", style);
        amqpTemplate.convertAndSend(
                QueueConstants.EXCHANGE_IMG,
                QueueConstants.ROUTING_KEY,
                JSONObject.toJSONString(requestParam));
    }
}
