package com.example.demo.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SayHelloiMP extends UnicastRemoteObject implements SayHello{
    public SayHelloiMP() throws RemoteException {
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "hello,zzq>:"+name;
    }
}
