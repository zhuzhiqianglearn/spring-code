package com.example.demo.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LookUpCOnfig {

    @Bean
    @Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)
    public Teacher getTeacher(){
        return new Teacher();
    }

    @Bean
    @Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)
    public Student getStudent(){
        return  new Student();
    }

    @Bean
    @Lookup()
    public AbstactUser getAbstactUser(Student teacher){
        return new AbstactUser() {
            @Override
            public User getUser() {
                return teacher;
            }
        };
    }

}
