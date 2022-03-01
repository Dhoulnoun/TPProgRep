package TP3.TP3_4;

import java.rmi.Naming;

public class Client {
    public static void main(String[] argv){
        try {
            int port = 8000;
            CalculateurInterface obj = (CalculateurInterface) Naming.lookup("rmi://localhost:" + port + "/calculateur");
            System.out.println("Addition "+obj.add(5.0,10.0));
            System.out.println("Soustraction "+obj.sub(10.0,5.));
            System.out.println("Multiplication "+obj.mul(2.,4.));
            System.out.println("Division "+obj.div(20.,10.));
        }catch(Exception e){
            System.out.println("Calculateur Exception " + e);
        }
    }
}
