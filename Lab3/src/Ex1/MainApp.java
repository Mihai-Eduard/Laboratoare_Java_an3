package Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        List<Parabola> parabole=new ArrayList<Parabola>();
        try(Scanner scanner=new Scanner(new File("in.txt")))
        {
            int a,b,c;
            while(scanner.hasNextInt()) {
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                Parabola parabola = new Parabola(a, b, c);
                parabole.add(parabola);
            }
        }catch(FileNotFoundException e)
        {
            System.out.println("Fisierul nu exista !!!");
        }
        for(Parabola parabola:parabole)
        {
            System.out.println(parabola.toString()+" are coordonatele varfului : "+ Arrays.toString(parabola.varf_p()));
        }
        System.out.println("Mijlocul segmentului care uneste varful parabolelor 1 si 3 este: "+Arrays.toString(Parabola.mij_seg_stat(parabole.get(0),parabole.get(2)))
        +" si lungimea segmentului este: "+Parabola.lungime_seg_stat(parabole.get(0),parabole.get(2)));
    }
}
