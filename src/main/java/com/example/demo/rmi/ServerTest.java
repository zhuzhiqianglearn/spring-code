package com.example.demo.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerTest {

    public static void main(String[] args) {
        try {
            SayHello sayHello=new SayHelloiMP();
            //开启服务
            Registry registry = LocateRegistry.createRegistry(8888);
            //绑定服务
            Naming.rebind("rmi://localhost:8888/sayHello",sayHello);
//            Naming.rebind();bind("rmi://localhost:8888/sayHello",sayHello);

            System.out.println("server start......");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
