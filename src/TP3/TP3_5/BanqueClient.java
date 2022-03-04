package TP3.TP3_5;

import java.rmi.Naming;
import java.util.Scanner;

public class BanqueClient {
    public static void main(String[] argv) {
        try {
            int port = 8000;
            BanqueInterface obj = (BanqueInterface) Naming.lookup("rmi://localhost:" + port + "/compteBanque");
            boolean loop=true;

            do {
                System.out.println("que souhaitez vous faire ?");
                System.out.println("créer un compte ? (1)");
                System.out.println("ajouter dans votre solde ? (2)");
                System.out.println("retirer de l'argent ? (3)" );
                System.out.println("afficher postion ? (4)" );
                System.out.println("quitter ? (5)" );
                Scanner sc = new Scanner(System.in);  // Create a Scanner object
                int operation = sc.nextInt();  // Read user input
                switch (operation){
                    case 1:
                        System.out.println("entrez un id et un solde initial");
                        String id = sc.next();
                        double soldeInit= sc.nextDouble();

                        obj.creerCompte(id,soldeInit);
                        System.out.println("compte crée avec succès");
                        break;
                    case 2:
                        System.out.println("entrez votre id");
                        id = sc.next();
                        System.out.println("entrez un solde à ajouter");
                        double somme= sc.nextDouble();
                        obj.ajouterSolde(id, somme);
                        System.out.println("solde ajouté avec succès");
                        break;

                    case 3:
                        System.out.println("entrez votre id");
                        id = sc.next();
                        System.out.println("entrez un solde à retiré");
                        somme= sc.nextDouble();
                        obj.retirer(id,somme);
                        System.out.println("somme retirée avec succès");
                        break;
                    case 4:
                        System.out.println("entrez votre id");
                        id = sc.next();
                        String res= String.valueOf(obj.position(id).derniereOperation)+" "+String.valueOf(obj.position(id).solde+"€");
                        System.out.println("Dernière opération : " + res);
                        break;
                    default:
                        loop=false;
                        break;
                }
            } while (loop);
        } catch (Exception e) {
            System.out.println("Banque Client Exception " + e);
        }
    }
}
