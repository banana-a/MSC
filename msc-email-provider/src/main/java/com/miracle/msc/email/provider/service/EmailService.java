package com.miracle.msc.email.provider.service;

import com.miracle.msc.db.provider.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-08 11:50
 **/

@Service
public class EmailService {

    @Autowired
    JavaMailSender javaMailSender;

    public void send(Student student){
        System.out.println("11111111111111111111111");
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("604891119@qq.com");
        simpleMailMessage.setTo(student.getEmail());
        simpleMailMessage.setSubject("您已成功报名微软学生俱乐部");
        simpleMailMessage.setText("欢迎你" + student.getName() + "，来加入我们膜颜神的队伍");
        javaMailSender.send(simpleMailMessage);
    }
}
