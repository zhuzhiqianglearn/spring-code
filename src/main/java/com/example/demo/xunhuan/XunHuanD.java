package com.example.demo.xunhuan;

import org.springframework.beans.factory.annotation.Autowired;

public class XunHuanD {
    private XunHuanC xunHuanC;

    public XunHuanC getXunHuanC() {
        return xunHuanC;
    }

    public XunHuanD setXunHuanC(XunHuanC xunHuanC) {
        this.xunHuanC = xunHuanC;
        return this;
    }
}
