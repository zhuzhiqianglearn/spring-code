package com.example.demo.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class TestApplicationContextEvent extends ApplicationContextEvent {
    public TestApplicationContextEvent(ApplicationContext source) {
        super(source);
        System.out.println("111111");
    }
    public void gogo(){
        System.out.println("gogogogo");
    }

}
