package TP1;
// Serveur2.java
import java.io.*;
import java.net.*;
public class TP1Serveur {
    public static void main(String argv[]) throws Exception {

        /**/
        ServerSocket ecoute= new ServerSocket(Integer.parseInt(argv[0]));

        System.out.println("\n Le serveur reçoit sur le port :" + ecoute.getLocalPort());

        System.out.println(">>> Serveur pret");

        Socket soc_com=ecoute.accept();

        System.out.println(" "+soc_com.getInetAddress());

        InetAddress origin =soc_com.getInetAddress();
        System.out.println("Connection venant de :" + origin.getHostName());

        BufferedReader in = new BufferedReader(new InputStreamReader(soc_com.getInputStream()));

        PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc_com.getOutputStream())),true);

        String str =in.readLine();

        System.out.println("Message reçu = " + str);
        out.println(str);

        in.close();
        out.close();
        soc_com.close();

    }
}