package TP2;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Application extends Thread{
    Socket client;
    Application(Socket client){
        this.client=client;
    }

    @Override
    public void run() {
        try {
            ObjectInputStream in = new ObjectInputStream(client.getInputStream());
            ObjectOutputStream out=new ObjectOutputStream(client.getOutputStream());
            while (true){
                out.writeObject(traiteRequete(in.readObject()));
                out.flush();
            }
        }catch (EOFException e3){
            try {
                client.close();
            }catch (IOException e){
                System.out.println(e);
            }
        }catch (IOException e){
            System.out.println(" Erreur d'entrée sortie "+e);
        }catch (ClassNotFoundException e2){
            System.out.println(e2);
        }
    }
    private Object traiteRequete(Object requete){
        if(requete instanceof Date)
            return  new Date();
        else if(requete instanceof Carre)
            return ((Carre)requete).execute();
        else if(requete instanceof Somme)
            return ((Somme)requete).execute();
        else if(requete instanceof Factoriel)
            return ((Factoriel)requete).execute();
        else if(requete instanceof ResEqDeg2)
            return ((ResEqDeg2)requete).execute();
        else return null;

    }
}
