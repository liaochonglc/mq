package com.mq.mq.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MsgReceiver {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RabbitListener(queues = RabbitConfig.QUEUE_A)
    @RabbitHandler
    public void process(String content) {
        System.out.println("------------------------");
        logger.info("接收处理队列A当中的消息： " + content);

    }
    @RabbitListener(queues = RabbitConfig.QUEUE_A)
    @RabbitHandler
    public void process2(String content) {
        logger.info("接收处理队列A当中的消息： " + content);
    }
}
