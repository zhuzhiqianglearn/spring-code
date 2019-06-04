package com.example.demo.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SayHello extends Remote {
    public String sayHello(String name) throws RemoteException;
}
