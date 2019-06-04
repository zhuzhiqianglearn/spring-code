package com.example.demo.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientTest {

    public static void main(String[] args) {

        try {
            SayHello sayHello= (SayHello) Naming.lookup("rmi://localhost:8888/sayHello");
            System.out.println(sayHello.sayHello("gyb"));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

}
