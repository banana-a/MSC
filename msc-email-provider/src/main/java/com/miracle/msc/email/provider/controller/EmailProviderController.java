package com.miracle.msc.email.provider.controller;

import com.miracle.msc.db.provider.entity.Student;
import com.miracle.msc.email.provider.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-08 11:52
 **/

@RestController
public class EmailProviderController {

    @Autowired
    EmailService emailService;

    @PostMapping(value = "/email")
    public void send(@RequestBody Student student){
        emailService.send(student);
    }

}
