package com.example.demo.xunhuan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


public class XunHuanB {
    private XunHuanA xunHuanA;

    public XunHuanB(XunHuanA xunHuanA) {
        this.xunHuanA = xunHuanA;
    }
}
