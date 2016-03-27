package com.kiranpariyar.spring.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiranpariyar.spring.app.mail.MailSender;

@RestController
public class MailController {

    // @Resource(name = "mockMailSender")
    // private MailSender mailSender;

    @Autowired
    @Qualifier("smtpMailSender")
    private MailSender mailSender;

    @RequestMapping("/mail")
    public String send() {
        mailSender.send("abc@example.com", "Some subject", "the content");
        return "Mail Send";
    }
}
