package TP2;

public class Factoriel extends TraitRequete {
    int n,fact;

    public Factoriel(int n) {
        this.n = n;
    }

    @Override
    public Object execute() {
        for(int i=1;i<=n;i++) fact = fact * i;
        return fact;
    }
}
