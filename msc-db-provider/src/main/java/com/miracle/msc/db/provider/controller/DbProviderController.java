package com.miracle.msc.db.provider.controller;

import com.miracle.msc.db.provider.service.DbService;
import com.miracle.msc.db.provider.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-08 10:41
 **/

@RestController
public class DbProviderController {

    @Autowired
    DbService dbService;

    @PostMapping(value = "/reg")
    public void reg(@RequestBody Student student){
        dbService.insert(student);
    }

}
