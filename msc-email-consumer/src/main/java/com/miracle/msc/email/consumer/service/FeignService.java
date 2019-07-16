package com.miracle.msc.email.consumer.service;


import com.miracle.msc.db.provider.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-08 09:59
 **/

@FeignClient(value = "msc-email-provider",fallback = MyFallBack.class)
public interface FeignService {

    @PostMapping(value = "/email")
    void send(@RequestBody Student student);

}
