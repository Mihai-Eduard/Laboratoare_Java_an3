package Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        List<Produs> produse= new ArrayList<Produs>();
        try(Scanner scanner=new Scanner(new File("produse.csv")))
        {
            String denumire;
            double pret;
            int cantitate;
            LocalDate expirare;
            while(scanner.hasNextLine())
            {
                String linie=scanner.nextLine();
                linie.trim();
                String[] date=linie.split(",");
                denumire=date[0];
                pret=Double.parseDouble(date[1].trim());
                cantitate=Integer.parseInt(date[2].trim());
                expirare=LocalDate.parse(date[3], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                Produs produs =new Produs(denumire,pret,cantitate,expirare);
                produse.add(produs);
            }
        }catch(FileNotFoundException e)
        {
            System.out.println("Fisierul nu exista!!!");
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("0.Iesire\n1. Afisarea tuturor produselor\n2.Afisarea produselor expirate\n3.vânzarea unui produs, care se poate realiza doar dacă există suficientă cantitate pe stoc.\n" +
                "Daca produsul ajunge la cantitate zero, se elimina din listă. În clasa Produs se va declara\n" +
                "o variabilă statica încasări care se va actualiza la fiecare vânzare a unui produs, luând în\n" +
                "considerare prețul produsului vândut şi cantitatea vândută\n4.Afisarea produselor cu pret minim\n5.salvarea produselor care au o cantitate mai mică decât o valoare citită de la tastatură\n" +
                "într-un fișier de ieșire");

        int opt;
        while(true)
        {
            System.out.println("Introduceti optiunea: ");
            opt= Integer.parseInt(scanner.nextLine().trim());
            switch(opt)
            {
                case 0:
                    System.exit(0);
                case 1:
                    for(Produs produs:produse)
                        System.out.println(produs.toString());
                    break;
                case 2:
                    for(Produs produs:produse)
                    {
                        if(produs.getData_esxpirarii().isBefore(LocalDate.now()))
                            System.out.println("Produs expirat: "+produs.toString());
                    }
                    break;
                case 3:
                    System.out.println("Introduceti numele produsului pe care doriti sa-l cumparati: ");
                    String nume=scanner.nextLine().trim();
                    System.out.println("Introduceti cantitatea produsului pe care doriti sa-l cumparati: ");
                    int cantitate=Integer.parseInt(scanner.nextLine().trim());
                    for(Produs produs:produse)
                    {
                        if(nume.equals(produs.getDenumire())) {
                            if (cantitate < produs.getCantitate()) {
                                produs.setCantitate(produs.getCantitate() - cantitate);
                                Produs.incasari+=cantitate*produs.getPret();
                            }
                            else {
                                Produs.incasari+=produs.getCantitate()*produs.getPret();
                                produse.remove(produs);
                            }

                        }
                        else System.out.println("Nu exista niciun produs cu acest nume!!!");
                    }
                    break;
                case 4:
                    double min=Double.MAX_VALUE;
                    for(Produs produs:produse)
                        if(produs.getPret()<min)
                            min=produs.getPret();
                    for(Produs produs:produse)
                        if(min==produs.getPret())
                            System.out.println("Produsul "+produs.getDenumire()+" are pretul minim "+min);
                    break;
                case 5:
                    try(PrintStream out=new PrintStream("out.csv"))
                    {
                        System.out.println("Introduceti cantitatea maxima: ");
                        cantitate=Integer.parseInt(scanner.nextLine().trim());
                        for(Produs produs:produse)
                            if(produs.getCantitate()<cantitate)
                                out.println(produs.toString());
                    }catch (FileNotFoundException e)
                    {
                        System.out.println("Fisierul nu exista!!!");
                    }
                    break;
                default:
                    System.out.println("Optiune invalida!!!");
                    break;
            }
        }
    }
}
