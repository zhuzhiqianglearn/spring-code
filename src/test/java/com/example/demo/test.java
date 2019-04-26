package com.example.demo;

import com.example.demo.customtg.User;
import com.example.demo.event.TestExample;
import com.example.demo.lookup.AbstactUser;
import com.example.demo.lookup.LookUpCOnfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:bean.xml");
        AbstactUser abstactUser= (AbstactUser) applicationContext.getBean("getuser");
        abstactUser.so();
        TestExample testExample= applicationContext.getBean(TestExample.class);
        testExample.aaaa();

    }

    @Test
    public void aa(){
        //        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:bean.xml");
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(LookUpCOnfig.class);
//        AbstactUser abstactUser= (AbstactUser) applicationContext.getBean(AbstactUser.class);
        AbstactUser abstactUser= (AbstactUser) applicationContext.getBean("getAbstactUser");
        abstactUser.so();
    }

    @Test
    public void aaaa(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:custombean.xml");
        User bean = applicationContext.getBean(User.class);
        System.out.println(bean.toString());
    }
}
