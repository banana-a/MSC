package com.miracle.msc.activemq.provider.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-07 21:06
 **/

@Component
public class ConfigBean {
    @Value("${myTopic}")
    String topic;

    @Bean
    public Topic topic(){
        return new ActiveMQTopic(topic);
    }
}
