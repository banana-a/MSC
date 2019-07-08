package com.miracle.msc.email.consumer.service;

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
        System.out.println("1111111111111111111111111");
        Student student = JSON.parseObject(textMessage.getText(),Student.class);
        System.out.println("22222222222222222222222222");
        feignService.send(student);
        System.out.println("3333333333333333333333333");
    }
}
