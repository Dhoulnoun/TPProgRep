package TP2;

public class Somme extends TraitRequete{
    int a,b;

    public Somme(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Object execute() {
        return a + b;

    }
}
