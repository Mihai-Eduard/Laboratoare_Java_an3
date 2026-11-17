package Ex1;

import java.io.Serializable;

public class Echipament implements Serializable {
    private String denumire;
    private int nr_inv;
    private double pret;
    private String zona;
    private Situatie situatie;

    public Echipament() {
    }

    public Echipament(String denumire, int nr_inv, double pret, String zona, Situatie situatie) {
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona = zona;
        this.situatie = situatie;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNr_inv() {
        return nr_inv;
    }

    public void setNr_inv(int nr_inv) {
        this.nr_inv = nr_inv;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Situatie getSituatie() {
        return situatie;
    }

    public void setSituatie(Situatie situatie) {
        this.situatie = situatie;
    }

    @Override
    public String toString() {
        return "Echipament{" +
                "denumire='" + denumire + '\'' +
                ", nr_inv=" + nr_inv +
                ", pret=" + pret +
                ", zona='" + zona + '\'' +
                ", situatie=" + situatie +
                '}';
    }
}
