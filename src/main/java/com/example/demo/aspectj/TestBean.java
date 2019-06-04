package com.example.demo.aspectj;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
    private String tester="testStr";

    public String getTester() {
        return tester;
    }

    public void setTester(String tester) {
        this.tester = tester;
    }
    public void testAspectJ(){
        System.out.println("AOP:    "+getTester());
    }
}
