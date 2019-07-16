package com.miracle.msc.db.consumer.service;


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

@FeignClient(value = "msc-db-provider",fallback = MyFallBack.class)
public interface FeignService {

    @PostMapping(value = "/reg")
    void reg(@RequestBody Student student);

}
