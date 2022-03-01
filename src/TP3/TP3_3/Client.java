package TP3.TP3_3;

import java.rmi.Naming;

public class Client {
    public static void main(String[] argv) {
        try {
            int port = 8000;
            ResDegInterface obj = (ResDegInterface) Naming.lookup("rmi://localhost:" + port + "/resdeg2");
            System.out.println(" Solution : " + obj.calculSolution(3, 10, 2));
        } catch (Exception e) {
            System.out.println("ResDegClient Exception :" + e);
        }
    }
}
