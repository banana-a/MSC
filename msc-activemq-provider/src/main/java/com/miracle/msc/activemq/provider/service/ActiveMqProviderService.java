package com.miracle.msc.activemq.provider.service;

import com.alibaba.fastjson.JSON;

import com.miracle.msc.db.provider.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Topic;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-07 21:10
 **/

@Service
public class ActiveMqProviderService {

    @Autowired
    JmsTemplate jmsTemplate;
    @Autowired
    Topic topic;

    public void send(Student student){
        String message = JSON.toJSONString(student);
        jmsTemplate.convertAndSend(topic,message);
        System.out.println("succeed");
    }

}
