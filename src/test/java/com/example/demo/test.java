package com.example.demo;

import com.example.demo.byType.BytypeA;
import com.example.demo.customtg.User;
import com.example.demo.event.TestExample;
import com.example.demo.lookup.AbstactUser;
import com.example.demo.lookup.LookUpCOnfig;
import com.example.demo.xunhuan.XunHuanF;
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
    @Test
    public void aaaaaaa(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:xunhuanbean.xml");
//        User bean = applicationContext.getBean(User.class);
        applicationContext.getBean("xunhuanc");
        System.out.println(111);
    }
    @Test
    public void aaaaaaaaa(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:xunhuanbean.xml");
//        User bean = applicationContext.getBean(User.class);
        applicationContext.getBean(XunHuanF.class);
        System.out.println(111);
    }

    @Test
    public void b(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:beanByType.xml");
//        User bean = applicationContext.getBean(User.class);
        BytypeA bean = applicationContext.getBean(BytypeA.class);
        System.out.println(applicationContext.isSingleton("bytypeA"));
        bean.aaa();
        System.out.println(111);
    }
}
