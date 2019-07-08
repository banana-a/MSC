package com.miracle.msc.db.provider.service;

import com.alibaba.fastjson.JSON;
import com.miracle.msc.db.provider.entity.Student;
import com.miracle.msc.db.provider.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-07 23:08
 **/

@Service
public class DbService {

    @Autowired
    StudentMapper studentMapper;

    public void insert(Student student){
        studentMapper.insert(student);
    }


}
