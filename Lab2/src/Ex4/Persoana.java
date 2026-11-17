package Ex4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Persoana {
    private String nume;
    private String cnp;

    public Persoana(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public long getVarsta()
    {
        long varsta;
        int s=Character.getNumericValue(cnp.charAt(0));
        int an=Integer.parseInt(cnp.substring(1,3));
        int luna=Integer.parseInt(cnp.substring(3,5));
        int zi= Integer.parseInt((cnp.substring(5,7)));
        if(s==1||s==2)
            an+=1900;
        else if (s==3||s==4)
            an+=1800;
        else an+=2000;
        LocalDate data_nasterii=LocalDate.of(an,luna,zi);
        varsta=ChronoUnit.YEARS.between(data_nasterii,LocalDate.now());
        return varsta;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", cnp='" + cnp + '\'' +
                '}';
    }
}