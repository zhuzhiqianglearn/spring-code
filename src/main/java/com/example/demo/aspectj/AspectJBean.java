package com.example.demo.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectJBean {
    @Pointcut("execution(public * com.example.demo.aspectj.TestBean.testAspectJ())")
    public void test(){
    }
    @Before("test()")
    public void before(){
        System.out.println("我先执行了");
    }
}
