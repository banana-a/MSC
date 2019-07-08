package com.miracle.msc.email.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-08 11:48
 **/

@EnableDiscoveryClient
@SpringBootApplication
public class EmailProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmailProviderApplication.class, args);
    }
}
