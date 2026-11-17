package Ex1;

public class Sist_calcul extends Echipament{
    private String tip_mon;
    private int vit_proc;
    private int c_hdd;

    public Sist_calcul(String tip_mon) {
        this.tip_mon = tip_mon;
    }

    public Sist_calcul(String denumire, int nr_inv, double pret, String zona, Situatie situatie, String tip_mon) {
        super(denumire, nr_inv, pret, zona, situatie);
        this.tip_mon = tip_mon;
    }

    public String getTip_mon() {
        return tip_mon;
    }

    public void setTip_mon(String tip_mon) {
        this.tip_mon = tip_mon;
    }

    public int getVit_proc() {
        return vit_proc;
    }

    public void setVit_proc(int vit_proc) {
        this.vit_proc = vit_proc;
    }

    public int getC_hdd() {
        return c_hdd;
    }

    public void setC_hdd(int c_hdd) {
        this.c_hdd = c_hdd;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tip_mon='" + tip_mon + '\'' +
                ", vit_proc=" + vit_proc +
                ", c_hdd=" + c_hdd +
                '}';
    }
}
