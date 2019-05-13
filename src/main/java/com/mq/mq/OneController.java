package com.mq.mq;

import com.mq.mq.config.MsgProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OneController {
    @Autowired
    private MsgProducer msgProducer;
    @RequestMapping("/test")
    public void say(){
        msgProducer.sendMsg("你好啊1");
        msgProducer.sendMsg("你好啊2");
        msgProducer.sendMsg("你好啊3");
        msgProducer.sendMsg("你好啊4");
        msgProducer.sendMsg("你好啊5");
    }
}
