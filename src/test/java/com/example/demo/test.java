package com.example.demo;

import com.example.demo.MyBatisDemo.UserMapper;
import com.example.demo.aspectj.TestBean;
import com.example.demo.aware.TestAware;
import com.example.demo.beanFactoryPostProcessor.TestDemo;
import com.example.demo.beanspel.BeanspelB;
import com.example.demo.byType.BytypeA;
import com.example.demo.customapplication.MyApplication;
import com.example.demo.customtg.User;
import com.example.demo.event.TestExample;
import com.example.demo.event.book.TestEvent;
import com.example.demo.jdbc.JdbcUser;
import com.example.demo.jdbc.UserServerImp;
import com.example.demo.lookup.AbstactUser;
import com.example.demo.lookup.LookUpCOnfig;
import com.example.demo.property.PropertyA;
import com.example.demo.xunhuan.XunHuanF;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void bb(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:beanAware.xml");
        TestAware bean = applicationContext.getBean(TestAware.class);
       bean.awareHello();
       applicationContext.registerShutdownHook();
    }
    @Test
    public void bbb(){
        ClassPathXmlApplicationContext applicationContext=new MyApplication("classpath:beanAware.xml");
        TestAware bean = applicationContext.getBean(TestAware.class);
        bean.awareHello();
        applicationContext.registerShutdownHook();
    }
    @Test
    public void bbbb(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:beanSpel.xml");
        BeanspelB bean = applicationContext.getBean(BeanspelB.class);
        bean.say();
        applicationContext.registerShutdownHook();
    }

    @Test
    public void bbbbb(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:beanProperty.xml");
        PropertyA bean = applicationContext.getBean(PropertyA.class);
        System.out.println(bean.getAge());
        applicationContext.registerShutdownHook();
    }
    @Test
    public void bbbbbb(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:beanFactoryPostProcess.xml");
        TestDemo bean = applicationContext.getBean(TestDemo.class);
        System.out.println(bean.toString());
        applicationContext.registerShutdownHook();
    }
    @Test
    public void bbbbbbb(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:beanPostProcess.xml");
        TestDemo bean = applicationContext.getBean(TestDemo.class);
        System.out.println(bean.toString());
        applicationContext.registerShutdownHook();
    }
    @Test
    public void bbbbbbbb(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:beanEvent.xml");
        System.out.println(11111);
        TestEvent event=new TestEvent("hello","event");
        applicationContext.publishEvent(event);
    }
    @Test
    public void bbbbbbbbb(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:beanAspectJ.xml");
        TestBean bean = applicationContext.getBean(TestBean.class);
        bean.testAspectJ();
    }

    @Test
    public void bbbbbbbbbb(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:beanJdbc.xml");
        UserServerImp bean = applicationContext.getBean(UserServerImp.class);
//       bean.save(new JdbcUser(1,"zzq",18,"nan"));
        List<JdbcUser> user = bean.getUser();
    }
    @Test
    public void bbbbbbbbbbb(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:beanMabatisConfig.xml");
        UserMapper bean = applicationContext.getBean(UserMapper.class);
//       bean.save(new JdbcUser(1,"zzq",18,"nan"));
        bean.insertUser(new com.example.demo.MyBatisDemo.User(0,"zzqm",10008,"nann"));
    }

    @Test
    public void bbbbbbbbbbbbb() throws Exception {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:beanJdbcShiwu.xml");
        UserServerImp bean = applicationContext.getBean(UserServerImp.class);
       bean.save(new JdbcUser(1,"zzq",18,"nan"));
//        List<JdbcUser> user = bean.getUser();
    }
    @Test
    public void c(){
        List<String> names2=null;
        System.out.println(names2==null?0:names2.size());
        List<String> names=new ArrayList<>();
        names.add("1");
        names.add("2");
        names.add("3");
        names.add("4");
        names.remove(2);
        names.add(2,"6");
        System.out.println(Arrays.toString(names.toArray()));
//        List<String> value=new ArrayList<>();
//
//        //M0 YQ
//        int index=names.indexOf("3");
//        value.get(index).s;

        ExpressionParser parser
                = new SpelExpressionParser();

//字符串解析
        String str = (String) parser.parseExpression("'你好'").getValue();
        System.out.println(str);

//整型解析
        int intVal = (Integer) parser.parseExpression("0x2F").getValue();
        System.out.println(intVal);

//双精度浮点型解析
        double doubleVal = (Double) parser.parseExpression("4329759E+22").getValue();
        System.out.println(doubleVal);


//布尔型解析
        boolean booleanVal = (boolean) parser.parseExpression("true").getValue();
        System.out.println(booleanVal);
    }

}
