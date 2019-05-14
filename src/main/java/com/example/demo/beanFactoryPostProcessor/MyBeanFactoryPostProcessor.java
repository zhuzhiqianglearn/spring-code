package com.example.demo.beanFactoryPostProcessor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

import java.util.Set;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    private Set<String> obscenties;

    public Set<String> getObscenties() {
        return obscenties;
    }

    public void setObscenties(Set<String> obscenties) {
        this.obscenties = obscenties;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
            StringValueResolver valueResolver=new StringValueResolver() {
                @Override
                public String resolveStringValue(String strVal) {
                    if(obscenties.contains(strVal.toString().toUpperCase())){
                        return "*******";
                    }
                    return strVal;
                }
            };
            BeanDefinitionVisitor visitor=new BeanDefinitionVisitor(valueResolver);
            visitor.visitBeanDefinition(beanDefinition);
        }
    }

}
