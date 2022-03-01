package TP3.TP3_3;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
    public static void main(String[] argv) {
        try {
            int port = 8000;
            LocateRegistry.createRegistry(port);
            Naming.rebind("rmi://localhost:" + port + "/resdeg2", new ResDeg());
            System.out.println("ResDeg Server ready !");
        } catch (Exception e) {
            System.out.println("ResDeg Server failure " + e);
        }
    }
}