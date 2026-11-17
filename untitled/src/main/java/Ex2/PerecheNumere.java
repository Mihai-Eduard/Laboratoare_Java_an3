package Ex2;

public class PerecheNumere {
    private int nr1;
    private int nr2;

    public PerecheNumere() {
    }

    public PerecheNumere(int nr1, int nr2) {
        this.nr1 = nr1;
        this.nr2 = nr2;
    }

    public int getNr1() {
        return nr1;
    }

    public void setNr1(int nr1) {
        this.nr1 = nr1;
    }

    public int getNr2() {
        return nr2;
    }

    public void setNr2(int nr2) {
        this.nr2 = nr2;
    }

    public boolean fibonacci()
    {
        int a=nr1,b=nr2;
        if(a>b)
        {
            a=a+b;
            b=a-b;
            a=a-b;
        }
        while(a>0 && b>=1)
        {
            int c=b-a;
            b=a;
            a=c;
        }
        if(a==0 && b==1)
            return true;
        else return false;
    }

    public int CMMMC()
    {
        int cmmdc,a=nr1,b=nr2,cmmmc;
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else b=b-a;
        }
        cmmmc=(nr1*nr2)/a;
        return cmmmc;
    }
    public int sum_cifre(int numar)
    {
        int sum=0;
        while(numar!=0)
        {
            sum+=numar%10;
            numar=numar/10;
        }
        return sum;
    }
    public boolean sum_cifre_egale()
    {
        return sum_cifre(nr1)==sum_cifre(nr2);
    }
    public boolean cifrePare()
    {
        int par1=0,par2=0,a=nr1,b=nr2;
        while(a!=0)
        {
            if((a%10)%2==0)
                par1++;
            a=a/10;
        }
        while(b!=0)
        {
            if((b%10)%2==0)
                par2++;
            b=b/10;
        }
        return par1==par2;
    }
    @Override
    public String  toString() {
        return "PerecheNumere{" +
                "nr1=" + nr1 +
                ", nr2=" + nr2 +
                '}';
    }
}
