package com.miracle.msc.activemq.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-07 21:02
 **/


@SpringBootApplication
@EnableDiscoveryClient
public class ActiveMqProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ActiveMqProviderApplication.class, args);
    }
}
