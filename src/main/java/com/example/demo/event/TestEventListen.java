package com.example.demo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class TestEventListen implements ApplicationListener<TestApplicationContextEvent> {
    @Override
    public void onApplicationEvent(TestApplicationContextEvent testApplicationContextEvent) {
        TestApplicationContextEvent event = testApplicationContextEvent;
        event.gogo();
//        System.out.println("MailSender向"+ event.gogo()+ "发送了邮件");
    }
}
