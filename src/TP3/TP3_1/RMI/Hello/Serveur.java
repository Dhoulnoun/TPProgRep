package TP3.TP3_1.RMI.Hello;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
    public static void main (String[] argv){
        try {
            int port = 8000;
            LocateRegistry.createRegistry(port);
            Naming.rebind("rmi://localhost:"+port+"/hello", new HelloImpl());
            System.out.println("Hello Server Prêt ! ");
        }catch (Exception e){
            System.out.println("Hello Server échec " + e);
        }
    }
}
