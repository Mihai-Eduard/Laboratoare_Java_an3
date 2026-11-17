package Ex4;

import java.util.Scanner;

public class MainApp {
    public static boolean validare_CNP(String cnp)
    {
        cnp=cnp.trim();
        int c_control=0;
        String cod="279146358279";
        if(cnp.length()!=13)
            return false;
        for(int i=0;i<13;i++) {
            if (!Character.isDigit(cnp.charAt(i)))
                return false;
        }
        if(Integer.parseInt(cnp.substring(3,5))>12||Integer.parseInt(cnp.substring(3,5))==0)
            return false;
        for(int i=0; i<cod.length();i++)
            c_control+=Character.getNumericValue(cnp.charAt(i))*Character.getNumericValue(cod.charAt(i));
        c_control=(c_control%11);
        if(c_control==10)
            c_control=1;
        if(c_control!=Character.getNumericValue(cnp.charAt(12)))
            return false;

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti numarul de persoane: ");
        int nr_p=Integer.parseInt(scanner.nextLine());
        Persoana[] persoane=new Persoana[nr_p];
        for(int i=0;i<nr_p;i++)
        {
            String nume,cnp="";
            System.out.println("Introduceti numele persoanei: ");
            nume=scanner.nextLine();
            while(!validare_CNP(cnp))
            {
                System.out.println("Introduceti CNP-ul persoanei: ");
                cnp=scanner.nextLine();
            }
            Persoana persoana=new Persoana(nume,cnp);
            persoane[i]=persoana;
        }
        for(int i=0;i<nr_p;i++)
        {
            System.out.println("Nume: "+persoane[i].getNume()+" CNP: "+persoane[i].getCnp()+" varsta: "+persoane[i].getVarsta());
        }
    }
}
