package TP2;


import java.util.Arrays;

public class ResEqDeg2 extends TraitRequete{
    int a,b,c;

    public ResEqDeg2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int Discriminant(int a,int b,int c){
        return b*b-4*a*c;
    }
    @Override
    public Object execute() {
        int Delta=Discriminant(a,b,c);
        if(Delta>0){
            double x1,x2;
            x1=(-b-Math.sqrt(Delta))/(2*a);
            x2=(-b+Math.sqrt(Delta))/(2*a);
            return Arrays.toString(new double[]{x1, x2});

        }else if(Delta==0){
            return (-b/(2*a));
        }else return null;
    }
}
