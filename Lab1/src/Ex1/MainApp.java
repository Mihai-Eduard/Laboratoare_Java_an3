package Ex1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti lungimea dreptunghiului: ");
        int lungime=scanner.nextInt();
        System.out.println("Introduceti latimea dreptunghiului: ");
        int latime=scanner.nextInt();
        int perimetru=2*lungime+2*latime;
        int arie=lungime*latime;
        System.out.println("Aria este "+arie+" perimetrul este "+perimetru);
    }
}