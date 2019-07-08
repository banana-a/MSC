package com.miracle.msc.activemq.provider.controller;

import com.miracle.msc.activemq.provider.service.ActiveMqProviderService;
import com.miracle.msc.db.provider.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-07 21:27
 **/
@CrossOrigin
@RestController
public class ActiveMqController {

    @Autowired
    ActiveMqProviderService activeMqProviderService;

    @PostMapping(value = "/reg")
    public String send(@RequestBody Student student){

        activeMqProviderService.send(student);
        return "200";
    }
}
