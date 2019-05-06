package com.example.demo.byType;

import org.springframework.beans.factory.annotation.Autowired;

public class BytypeA {
//    @Autowired
    private BytypeB bytypeB;

    public BytypeB getBytypeB() {
        return bytypeB;
    }

    public BytypeA setBytypeB(BytypeB bytypeB) {
        this.bytypeB = bytypeB;
        return this;
    }

    public void aaa(){
        bytypeB.aaa();
    }
}
