package Ex4;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random=new Random();
        int nr1=random.nextInt(31);
        int nr2=random.nextInt(31);
        int a=nr1,b=nr2;
        while(nr1!=nr2)
        {
            if(nr1>nr2)
                nr1-=nr2;
            else nr2-=nr1;
        }
        System.out.println("CMMDC a numerelor "+a+" si "+b+" este "+nr1);
    }
}
