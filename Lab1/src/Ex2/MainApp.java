package Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int suma=0,k=0, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        try(Scanner scanner=new Scanner(new File("in.txt")))
        {
            while(scanner.hasNextInt())
            {
                int nr=scanner.nextInt();
                suma+=nr;
                k++;
                if(nr<min)
                    min=nr;
                if(nr>max)
                    max=nr;
            }
        }catch(FileNotFoundException e)
        {
            System.out.println("Fisierul de intrare nu a fost gasit!!!");
        }
        float media=(float)suma/k;
        try(PrintStream out_f= new PrintStream("out.txt"))
        {
            out_f.println("Suma: "+suma);
            out_f.println("Media: "+media);
            out_f.println("Max: "+max);
            out_f.println("Min: "+min);
        }catch (FileNotFoundException e)
        {
            System.out.println("Fisierul de iesire nu a fost gasit!!!");
        }
    }
}
