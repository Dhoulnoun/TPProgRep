package TP3.TP3_4;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class Serveur {
    public static void main(String[] argv){
        try{
            int port =8000;
            LocateRegistry.createRegistry(port);
            Naming.rebind("rmi://localhost:" + port + "/calculateur", new CalculateurImpl());
            System.out.println("Calculateur Server Ready");
        }catch (Exception e){
            System.out.println("Calculateur Server Failiure" + e);
        }
    }
}
