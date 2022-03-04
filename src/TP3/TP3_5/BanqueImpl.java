package TP3.TP3_5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;

public class BanqueImpl extends UnicastRemoteObject implements BanqueInterface {
    private final Hashtable<String, Position> Compte = new Hashtable<>();

    protected BanqueImpl() throws RemoteException {
        super();
    }

    @Override
    public void creerCompte(String id, double sommeInitiale) throws RemoteException {
        Compte.put(id, new Position(sommeInitiale));
    }

    @Override
    public void ajouterSolde(String id, double somme) throws RemoteException {
        Compte.replace(id, new Position(Compte.get(id).solde + somme));
    }

    @Override
    public void retirer(String id, double somme) throws RemoteException {
        if (Compte.get(id).solde < somme)
            System.out.println("Solde insufisant");
        else Compte.replace(id, new Position(Compte.get(id).solde - somme));

    }

    @Override
    public Position position(String id) throws RemoteException {
        return Compte.get(id);
    }

}
