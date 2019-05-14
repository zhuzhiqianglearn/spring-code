package com.example.demo.beanspel;

public class BeanspelB {
    private BeanspelA beanspelA;

    public BeanspelA getBeanspelA() {
        return beanspelA;
    }

    public BeanspelB setBeanspelA(BeanspelA beanspelA) {
        this.beanspelA = beanspelA;
        return this;
    }

    public void say(){
        beanspelA.say();
    }
}
