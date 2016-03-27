package com.kiranpariyar.spring.app.mail;

public interface MailSender {

    void send(String to, String subject, String body);

}