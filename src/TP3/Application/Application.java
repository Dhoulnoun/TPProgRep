package TP3.Application;

import java.io.*;
import java.net.*;

public class Application implements Runnable {
    Socket sock_com;

    public Application(Socket sock_com) throws SocketException {
        this.sock_com = sock_com;
    }

    @Override
    public void run() {
        try {
            System.out.println("Adresse socket " + sock_com.getInetAddress());
            System.out.println("Connexion venant de " + sock_com.getInetAddress().getHostName());

            //creating flow
            BufferedReader in = new BufferedReader(new InputStreamReader(sock_com.getInputStream()));
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sock_com.getOutputStream())), true);

            // part of code related to client
            // Envoi de la chaîne Hello_World
            String str = "Hello_World";
            out.println(str);
            // Lecture du message echo (Hello_World)
            str = in.readLine();
            System.out.println(str);
            in.close();
            out.close();
            sock_com.close();
        } catch (IOException e) {
            System.err.println("Erreur E/S");
        }


    }
}
