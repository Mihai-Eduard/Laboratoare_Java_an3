package Ex3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti sirul: ");
        StringBuilder sb=new StringBuilder(scanner.nextLine());
        System.out.println("Introdu pozitia(de la 0-"+sb.length()+"): ");
        int poz=Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Introdu subsirul: ");
        String subs=scanner.nextLine();
        System.out.println("Sirul este: "+sb);
        sb.insert(poz,subs);
        System.out.println("Sirul modificat este: "+sb);
        System.out.println("Introdu pozitia de stergere(de la 0-"+sb.length()+"): ");
        poz=Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Introduceti numarul de caractere pe care le doriti sterse: ");
        int nr=Integer.parseInt(scanner.nextLine().trim());
        sb.delete(poz,poz+nr);
        System.out.println(("Sirul dupa stergere este: "+sb));
    }
}
