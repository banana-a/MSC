package com.miracle.msc.db.consumer.service;

import com.miracle.msc.db.provider.entity.Student;
import org.springframework.stereotype.Component;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-16 12:53
 **/

@Component
public class MyFallBack implements FeignService{
    @Override
    public void reg(Student student) {
        System.out.println("fallback");
        return;
    }
}
