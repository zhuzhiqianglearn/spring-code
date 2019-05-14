package com.example.demo.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestAware implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean {

    @Autowired
    private Hello hello;


    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;
    }

    public void awareHello(){
        Hello bean = beanFactory.getBean(Hello.class);
        bean.say();
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("------------------"+name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("11111111111111111");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(12312);

    }
}
