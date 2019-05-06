package com.example.demo.byType;

import org.springframework.beans.factory.annotation.Autowired;

public class BytypeB {

//    @Autowired
    private BytypeA bytypeA;


    public BytypeA getBytypeA() {
        return bytypeA;
    }

    public BytypeB setBytypeA(BytypeA bytypeA) {
        this.bytypeA = bytypeA;
        return this;
    }

    public void aaa(){
        System.out.println(1111);
    }
}
