package com.miracle.msc.db.consumer;

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
public class DbConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DbConsumerApplication.class, args);
    }
}
