package TP3.TP3_3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ResDegInterface extends Remote {
    public String calculSolution(int a, int b, int c) throws RemoteException;
}
