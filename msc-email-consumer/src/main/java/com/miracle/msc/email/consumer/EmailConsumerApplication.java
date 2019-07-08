package com.miracle.msc.email.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-08 09:58
 **/

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EmailConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmailConsumerApplication.class, args);
    }
}
