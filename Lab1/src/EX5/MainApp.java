package EX5;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random=new Random();
        int nr=random.nextInt(21);
        System.out.println("Numarul generat este: "+nr);
        boolean fib=false;
        int a,b=1,c=1;
        if(nr==0 || nr==1)
            fib=true;
        while(c<=nr)
        {
            if(nr==c)
                fib=true;
            a=b;
            b=c;
            c=a+b;
        }
        if(fib) System.out.println("Numarul generat face parte din sirul lui Fibonacci!");
        else System.out.print("Nuarul generat NU face parte din sirul lui Fibonacci!");
    }
}
