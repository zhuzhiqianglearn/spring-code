package com.example.demo.customapplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.MutablePropertySources;

public class MyApplication extends ClassPathXmlApplicationContext {

    public MyApplication(String... configLocations) {
        super(configLocations);
    }

    @Override
    protected void initPropertySources() {
        String eeee = System.getenv("eeee");
        if(eeee==null||"".equals(eeee)){
            System.setProperty("hhhh","123");
        }else {
            System.setProperty("hhhh",eeee);
        }
        getEnvironment().setRequiredProperties("hhhh");

    }
}
