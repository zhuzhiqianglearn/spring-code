package com.example.demo.beanspel;

import java.util.Date;

public class BeanspelA {
    private Date now;

    public Date getNow() {
        return now;
    }

    public BeanspelA setNow(Date now) {
        this.now = now;
        return this;
    }

    public void say(){
        System.out.println("hello world");
    }
}
