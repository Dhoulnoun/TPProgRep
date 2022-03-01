package TP3.TP3_2;

import java.rmi.Naming;

public class Client {
    public static void main(String[] argv){
        try{
            int port=8000;
            ConvInterface obj=(ConvInterface) Naming.lookup("rmi://localhost:"+port+"/conv");
            for(int i =-20; i<=120;i+=10){
                System.out.println("conversion to F"+obj.conversionToFahreinheit(i));
                System.out.println("Conversion to C"+obj.conversionToCelsius(i));
            }
        }catch (Exception e){
            System.out.println("ConvClient Exception :" +e);
        }
    }
}
