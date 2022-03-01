package TP2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] argv) {
        try {
            Socket emission = new Socket(argv[0], Integer.parseInt(argv[1]));
            ObjectOutputStream out = new ObjectOutputStream(emission.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(emission.getInputStream());

            System.out.println("Connexion établie ");

            // Demande de la date
            System.out.println(" Demande de la date ");
            out.writeObject(new Date());
            out.flush();
            System.out.println(in.readObject());
            System.out.flush();

            //////////////////////////
            System.out.println(" Calcul du carré ");
            System.out.flush();

            out.writeObject(new Carre(2));
            out.flush();

            System.out.println(" Résultat du carré ");
            System.out.flush();

            System.out.println(in.readObject());
            /////////////////////////
            System.out.println("calcul de la somme");
            System.out.flush();

            out.writeObject(new Somme(1,2));
            out.flush();

            System.out.println("Résultat de la somme ");
            System.out.flush();

            System.out.println(in.readObject());
            //////////////////////////////
            System.out.println("Calcul Facotriel");
            System.out.flush();

            out.writeObject(new Factoriel(5));
            out.flush();

            System.out.println("Résultat de la factoriel");
            System.out.flush();

            System.out.println(in.readObject());
            //////////////////////////////////////
            System.out.println("Résolution d'une équation du second deg");
            System.out.flush();

            out.writeObject(new ResEqDeg2(2,-9,-5));
            out.flush();

            System.out.println("Résultat de la résolution");
            System.out.flush();

            System.out.println(in.readObject());;


            emission.close();
            out.flush();
        } catch (IOException e) {
            System.out.println("Erreur d'entree sortie " + e);
        } catch (ClassNotFoundException e2) {
            System.out.println(e2);
        }
    }
}
