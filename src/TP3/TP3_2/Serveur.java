package TP3.TP3_2;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
    public static void main(String[] argv){
        try {
            int port=8000;
            LocateRegistry.createRegistry(port);
            Naming.rebind("rmi://localhost:"+port+"/conv", new Conv());
            System.out.println("Conv Server ready !");
        }catch (Exception e){
            System.out.println("Conv Server failure " + e);
        }
    }
}
