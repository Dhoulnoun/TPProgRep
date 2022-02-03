package TP2;
// Serveur parallèle

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur2 {
    public static void main(String argv[]) throws Exception {

        /**/
        ServerSocket ecoute= null;
        try{
            ecoute = new ServerSocket(Integer.parseInt(argv[0]));

        }
        catch(IOException e){
            System.err.println("impossible d'écouter sur le port indiqué");
            System.exit(1);
        }
        System.out.println("\n Le serveur reçoit sur le port :" + ecoute.getLocalPort());

        System.out.println(">>> Serveur pret");

        Socket client = null;
        while(true){
            try {
                client=ecoute.accept();

            }catch (IOException e){
                System.err.println("Erreur de création de fils");
                System.exit(1);
            }
            System.out.println(" "+client.getInetAddress());

            InetAddress origin =client.getInetAddress();
            System.out.println("Connection venant de :" + origin.getHostName());

            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())),true);

            String str =in.readLine();

            System.out.println("Message reçu = " + str);
            out.println(str);
        }



    }
}