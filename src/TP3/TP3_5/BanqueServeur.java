package TP3.TP3_5;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class BanqueServeur {
    public static void main(String[] argv) {
        try {
            int port = 8000;
            LocateRegistry.createRegistry(port);
            Naming.rebind("rmi://localhost:" + port + "/compteBanque", new BanqueImpl());
            System.out.println("Banque Server Ready");
        } catch (Exception e) {
            System.out.println("Banque Server Failure : " + e);
        }
    }
}
