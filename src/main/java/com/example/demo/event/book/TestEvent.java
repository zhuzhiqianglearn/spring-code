package com.example.demo.event.book;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public String msg;

    public TestEvent(Object source) {
        super(source);
    }

    public TestEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
    public void print(){
        System.out.println(msg);
    }

}
