package com.example.demo.beanPostProcessor;

import com.example.demo.beanFactoryPostProcessor.TestDemo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;

public class MyBeanPostProcessor implements BeanPostProcessor,PriorityOrdered {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
   if(bean instanceof TestDemo){
       ((TestDemo) bean).setAge(19);
   }
        System.out.println("MyBeanPostProcessor1:before");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor1:after");
        return bean;
    }


    @Override
    public int getOrder() {
        return 2;
    }
}
