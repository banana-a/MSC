package com.miracle.msc.email.consumer.service;

import com.miracle.msc.db.provider.entity.Student;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-16 13:02
 **/


public class MyFallBack implements FeignService{

    @Override
    public void send(Student student) {
        System.out.println("fallback");
        return;
    }
}
