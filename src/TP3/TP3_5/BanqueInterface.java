package TP3.TP3_5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BanqueInterface extends Remote {
    void creerCompte(String id, double sommeInitiale) throws RemoteException;

    void ajouterSolde(String id, double somme) throws RemoteException;

    void retirer(String id, double somme) throws RemoteException;

    Position position(String id) throws RemoteException;
}
