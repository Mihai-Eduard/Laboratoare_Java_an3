package Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String[] sir=new String[100];
        int k=0;
        try(Scanner scanner=new Scanner(new File("Judete_in.txt")))
        {
            while(scanner.hasNext())
            {
                sir[k]=scanner.next();
                k++;
            }
        }catch(FileNotFoundException e)
        {
            System.out.println("Fisierul nu a fost gasit!!!");
        }
        String[] s=Arrays.copyOf(sir,k);
        Arrays.sort(s);
        Scanner scanner2=new Scanner(System.in);
        for(int i=0;i<k;i++)
            System.out.println(sir[i]);
        System.out.println("Introduceti judetul: ");
        String jud=scanner2.next();
        System.out.println("Pozitia judetului cautat: "+Arrays.binarySearch(s,jud));
        scanner2.close();
    }
}
