package TP3.TP3_3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;

public class ResDeg extends UnicastRemoteObject implements ResDegInterface {

    protected ResDeg() throws RemoteException {
        super();
    }

    public double calculDiscriminant(int a, int b, int c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    @Override
    public String calculSolution(int a, int b, int c) {
        double Delta = calculDiscriminant(a, b, c);
        if (Delta > 0)
            return "il y a deux solutions :" + twoSolution(Delta, a, b, c);
        else if (Delta == 0)
            return "Il y a une solution " + oneSolution(a, b);
        else return "Il n'y a pas de solution réelle Delta=" + Double.toString(Delta);
    }

    public String twoSolution(double Delta, int a, int b, int c) {
        double x1, x2;
        x1 = (-b - Math.sqrt(Delta)) / (2 * a);
        x2 = (-b + Math.sqrt(Delta)) / (2 * a);
        return Arrays.toString(new double[]{x1, x2});
    }

    public String oneSolution(int a, int b) {
        return Double.toString(-b / (2. * a));
    }
}
