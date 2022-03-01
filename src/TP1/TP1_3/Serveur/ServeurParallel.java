package TP1.TP1_3.Serveur;

import TP1.TP1_3.Application.Application;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurParallel {
    public static void main(String[] argv) {
        ServerSocket ecoute = null;
        try {
            ecoute = new ServerSocket(Integer.parseInt(argv[0]));
        } catch (IOException e) {
            System.err.println("Impossible d'écouter sur le port indiqué");
            System.exit(1);
        }
        System.out.println("\n Le serveur reçoit sur le port : " + ecoute.getLocalPort());
        //Acceptation de socjet client
        Socket client;
        System.out.println(">>> Le Serveur est prêt! ");
        while (true) {
            try {
                client = ecoute.accept();

                //create child process by thread
                Thread fils = new Thread(new Application(client));
                System.out.println("" + fils.getName() + " cree");

                // starting child
                fils.start();
            } catch (IOException e) {
                System.err.println("Erreur de création du fils ");
                System.exit(1);

            }
        }
    }
}
