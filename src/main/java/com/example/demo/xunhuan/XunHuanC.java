package com.example.demo.xunhuan;

import org.springframework.beans.factory.annotation.Autowired;

public class XunHuanC {
    private XunHuanD xunHuanD;

    public XunHuanD getXunHuanD() {
        return xunHuanD;
    }

    public XunHuanC setXunHuanD(XunHuanD xunHuanD) {
        this.xunHuanD = xunHuanD;
        return this;
    }
}
