package com.miracle.msc.db.consumer.service;

import com.alibaba.fastjson.JSON;

import com.miracle.msc.db.provider.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.TextMessage;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-08 10:03
 **/

@Service
public class ActiveMqConsumer {

    @Autowired
    FeignService feignService;

    @JmsListener(destination = "${myTopic}")
    public void recieve(TextMessage textMessage) throws Exception{
        Student student = JSON.parseObject(textMessage.getText(),Student.class);
        feignService.reg(student);
    }
}
