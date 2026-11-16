package Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Introduceti o grupare de litere: ");
        String end=scanner1.next();
        ArrayList<Vers> versuri= new ArrayList<>();
        try(Scanner scanner=new Scanner(new File("cantec_in.txt")))
        {
            while(scanner.hasNext())
            {
                String linie=scanner.nextLine();
                versuri.add(new Vers(linie));
            }
        }catch(FileNotFoundException e)
        {
            System.out.println("Fisierul nu exista!!!");
        }
        try(PrintStream out=new PrintStream("cante_out.txt")) {
            for (Vers vers : versuri) {
                int nr_cuv, nr_voc;
                boolean ends_with;
                nr_cuv = vers.numarCuvinte();
                nr_voc = vers.nrVocale();
                ends_with = vers.seInceheie(end);
                double nr=random.nextDouble();
                System.out.println("Numarul random: "+nr);
                if(nr<0.1)
                    vers.majuscule();
                if(ends_with)
                    out.print("* ");
                out.println(nr_cuv+" "+nr_voc+" "+vers.getVers());
            }
        }catch(Exception e)
        {
            System.out.println("Eroare!!!");
        }
    }
}
