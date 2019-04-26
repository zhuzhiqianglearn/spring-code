package com.example.demo.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestExample {
    @Autowired
    private ApplicationContext applicationContext;

    public void aaaa(){
        TestApplicationContextEvent event=new TestApplicationContextEvent(applicationContext);
        applicationContext.publishEvent(event);
    }
}
