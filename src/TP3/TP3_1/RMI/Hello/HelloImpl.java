package TP3.TP3_1.RMI.Hello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements HelloInterface {
    protected HelloImpl() throws RemoteException {
        super();
    }

    @Override
    public String echo() throws RemoteException {
        return "Hello World";
    }
}
