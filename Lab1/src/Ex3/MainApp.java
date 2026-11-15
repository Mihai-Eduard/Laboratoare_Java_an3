package Ex3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,k=0;
        System.out.println("Introduceti un nr: ");
        n=scanner.nextInt();
        for(int i = 1;i<=n;i++)
        {
            if(n%i==0) {
                System.out.println(i);
                k++;
            }
        }
        if(k==2) System.out.println("Numarul "+n+" este prim!");
    }
}
