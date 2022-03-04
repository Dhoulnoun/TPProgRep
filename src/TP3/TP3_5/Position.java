package TP3.TP3_5;

import java.io.Serializable;
import java.util.Date;

public class Position implements Serializable {
    public double solde;
    public Date derniereOperation;

    public Position(double solde) {
        this.solde = solde;
        this.derniereOperation=new Date();
    }

}
