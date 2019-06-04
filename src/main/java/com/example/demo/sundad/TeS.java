package com.example.demo.sundad;

public class TeS extends Te {
    public TeS() {
        System.out.println(4);
    }
    {
        System.out.println(5);
    }
    static {
        System.out.println(6);
    }

    public static void main(String[] args) {
        TeS t=new TeS();
        TeS t1=new TeS();
    }
}
