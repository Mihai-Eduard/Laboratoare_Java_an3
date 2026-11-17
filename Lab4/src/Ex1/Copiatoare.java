package Ex1;

import java.io.Serializable;

public class Copiatoare extends Echipament implements Serializable {
    private int p_tonp;
    private Format_copiere formatCopiere;

    public Copiatoare(int p_tonp, Format_copiere formatCopiere) {
        this.p_tonp = p_tonp;
        this.formatCopiere = formatCopiere;
    }

    public Copiatoare(String denumire, int nr_inv, double pret, String zona, Situatie situatie, int p_tonp, Format_copiere formatCopiere) {
        super(denumire, nr_inv, pret, zona, situatie);
        this.p_tonp = p_tonp;
        this.formatCopiere = formatCopiere;
    }

    public int getP_tonp() {
        return p_tonp;
    }

    public void setP_tonp(int p_tonp) {
        this.p_tonp = p_tonp;
    }

    public Format_copiere getFormatCopiere() {
        return formatCopiere;
    }

    public void setFormatCopiere(Format_copiere formatCopiere) {
        this.formatCopiere = formatCopiere;
    }

    @Override
    public String toString() {
        return super.toString() +
                "p_tonp=" + p_tonp +
                ", formatCopiere=" + formatCopiere +
                '}';
    }
}
