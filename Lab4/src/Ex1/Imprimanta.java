package Ex1;

import java.io.Serializable;

public class Imprimanta extends Echipament implements Serializable {
    private int ppm;
    private int dpi;
    private int p_car;
    private Tiparire tiparire;

    public Imprimanta(String denumire, int nr_inv, double pret, String zona, Situatie situatie, int ppm, int dpi, int p_car, Tiparire tiparire) {
        super(denumire, nr_inv, pret, zona, situatie);
        this.ppm = ppm;
        this.dpi = dpi;
        this.p_car = p_car;
        this.tiparire = tiparire;
    }

    public int getPpm() {
        return ppm;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getP_car() {
        return p_car;
    }

    public void setP_car(int p_car) {
        this.p_car = p_car;
    }

    public Tiparire getTiparire() {
        return tiparire;
    }

    public void setTiparire(Tiparire tiparire) {
        this.tiparire = tiparire;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ppm=" + ppm +
                ", dpi=" + dpi +
                ", p_car=" + p_car +
                ", tiparire=" + tiparire +
                '}';
    }
}
