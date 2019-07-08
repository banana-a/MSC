package com.miracle.msc.db.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-07 22:01
 **/

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.miracle.msc.db.provider.mapper")
public class DbProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DbProviderApplication.class, args);
    }
}
