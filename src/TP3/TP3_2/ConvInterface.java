package TP3.TP3_2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ConvInterface extends Remote {
    public double conversionToCelsius(int F) throws RemoteException;
    public double conversionToFahreinheit(int C) throws RemoteException;

}
