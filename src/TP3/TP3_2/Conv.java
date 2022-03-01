package TP3.TP3_2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Conv extends UnicastRemoteObject implements ConvInterface {
    protected Conv() throws RemoteException {
        super();
    }

    @Override
    public double conversionToCelsius(int F) throws RemoteException {
        return (5./9.)*(F-32);
    }

    @Override
    public double conversionToFahreinheit(int C) throws RemoteException {
        return (C/(5./9.))+32;
    }
}
