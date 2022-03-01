package TP3.TP3_4;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculateurImpl extends UnicastRemoteObject implements CalculateurInterface {
    protected CalculateurImpl() throws RemoteException {
        super();
    }

    @Override
    public double add(double a, double b) throws RemoteException {
        return a+b;
    }

    @Override
    public double sub(double a, double b) throws RemoteException {
        return a-b;
    }

    @Override
    public double mul(double a, double b) throws RemoteException {
        return a*b;
    }

    @Override
    public double div(double a, double b) throws RemoteException {
        try{
            double sol= a/b;
        }catch(ArithmeticException e){
            System.err.println("Division by 0  " + e);
        }
        return a/b;
    }
}
