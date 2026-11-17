package Ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    static void scriere(Object o, String fis)
    {
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fis))){
            oos.writeObject(o);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    static List<Echipament> cititre(String fis) {
        List<Echipament> echip=new ArrayList<Echipament>();
        try(Scanner scanner=new Scanner(new File("electronice.txt")))
        {
            while(scanner.hasNextLine()) {
                String linie = scanner.nextLine().trim();
                String[] f=linie.split(";");
                switch(f[0].trim().toUpperCase())
                {
                    case "IMPRIMANTA":
                        Imprimanta i=new Imprimanta(f[0].trim(),Integer.parseInt(f[1].trim()),Integer.parseInt(f[2].trim()),f[3].trim())
                }
            }

        }catch(FileNotFoundException e)
        {
            System.out.println("Fisierul nu exista!");
        }
    }
    public static void main(String[] args) {
        List<Echipament> echipamente=new ArrayList<Echipament>();
        echipamente=(List<Echipament>) cititre("electronice.txt");
        System.out.println("MENIU:\n1.Afişarea tuturor echipamentelor\n" +
                "2. Afişarea imprimantelor\n" +
                "3. Afişarea copiatoarelor\n" +
                "4. Afişarea sistemelor de calcul\n" +
                "5. Modificarea stării în care se află un echipament\n" +
                "6. Setarea unui anumit mod de scriere pentru o imprimantă\n" +
                "7. Setarea unui format de copiere pentru copiatoare\n" +
                "8. Instalarea unui anumit sistem de operare pe un sistem de calcul\n" +
                "9. Afişarea echipamentelor vândute\n" +
                "10. Să se realizeze două metode statice pentru serializarea / deserializarea colecției de\n" +
                "obiecte în fișierul echip.bin\n0.Iesire ");
        Scanner scanner=new Scanner(System.in);
        while(true)
        {
            System.out.println("Introduceti optiunea dorita: ");
            int opt=Integer.parseInt(scanner.nextLine().trim());
            switch (opt)
            {
                case 0:
                    System.exit(0);
                case 1:
                    for(var var:echipamente)
                        System.out.println(var.toString());
                    break;
                case 2:
                    for (var var:echipamente)
                        if(var instanceof Imprimanta)
                            System.out.println(var);
                    break;
                case 3:
                    for(Echipament e:echipamente)
                        if(e instanceof  Copiatoare)
                            System.out.println(e);
                    break;
                case 4:
                    for(Echipament e:echipamente)
                        if(e instanceof  Sist_calcul)
                            System.out.println(e);
                    break;
                case 5:
                    System.out.println("Introduceti numarul de inventar al echipamentului pe care doriti sa-l modificati:");
                    int nr=Integer.parseInt(scanner.nextLine().trim());
                    for(Echipament e:echipamente)
                        if(e.getNr_inv()==nr)
                        {
                            System.out.println("Introduceti noua stare: ");
                            String stare=scanner.nextLine().trim();
                            e.setSituatie(Situatie.valueOf(stare));
                        }
                    break;
                case 9:
                    for(Echipament e:echipamente)
                        if(e.getSituatie()==Situatie.VANDUT)
                            System.out.println(e);
            }
        }
    }
}
