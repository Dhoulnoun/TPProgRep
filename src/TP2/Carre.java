package TP2;

public class Carre extends TraitRequete{
    int n;

    public Carre(int n) {
        this.n = n;
    }

    @Override
    public Object execute() {
        return n * n;
    }
}
