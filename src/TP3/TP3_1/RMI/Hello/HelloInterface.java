package TP3.TP3_1.RMI.Hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote {
    public String echo () throws RemoteException;
}
