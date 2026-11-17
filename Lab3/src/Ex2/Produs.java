package Ex2;

import java.time.LocalDate;

public class Produs {
    private String denumire;
    private double pret;
    private int cantitate;
    private LocalDate data_esxpirarii;
    public static double incasari=0;

    public Produs(String denumire, double pret, int cantitate, LocalDate data_esxpirarii) {
        this.denumire = denumire;
        this.pret = pret;
        this.cantitate = cantitate;
        this.data_esxpirarii = data_esxpirarii;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public LocalDate getData_esxpirarii() {
        return data_esxpirarii;
    }

    public void setData_esxpirarii(LocalDate data_esxpirarii) {
        this.data_esxpirarii = data_esxpirarii;
    }

    @Override
    public String toString() {
        return denumire+","+pret+","+cantitate+","+data_esxpirarii;
    }

}
