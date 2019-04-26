package com.example.demo.lookup;

public abstract class AbstactUser {

    public void so(){
        this.getUser().showMe();
    }

    public abstract User getUser();
}
