package Ex1;



public class Parabola {
    private int a;
    private int b;
    private int c;

    public Parabola(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return a+"x^2+"+b+"x+"+c;
    }

    public double[] varf_p()
    {
        double[] coord=new double[2];
        coord[0]=(-(b/(2.0*a)));
        coord[1]=(-(b*b+4.0*a*c)/(4*a));
        return coord;
    }
    public double[] mij_seg(Parabola parabola2)
    {
        double[] coord2=parabola2.varf_p();
        double[] coord1=varf_p();
        double[] coord_mijloc=new double[2];
        coord_mijloc[0]=(coord1[0]+coord2[0])/2;
        coord_mijloc[1]=(coord1[1]+coord2[1])/2;
        return coord_mijloc;
    }
    public static double[] mij_seg_stat(Parabola parabola1, Parabola parabola2)
    {
        double[] coord2=parabola2.varf_p();
        double[] coord1=parabola1.varf_p();
        double[] coord_mijloc=new double[2];
        coord_mijloc[0]=(coord1[0]+coord2[0])/2;
        coord_mijloc[1]=(coord1[1]+coord2[1])/2;
        return coord_mijloc;
    }
    public double lungime_seg(Parabola parabola2)
    {
        double[] coord2=parabola2.varf_p();
        double[] coord1=varf_p();
        double lungime;
        lungime=Math.hypot((coord2[0]-coord1[0]),(coord2[1]-coord1[1]));
        return lungime;
    }
    public static double lungime_seg_stat(Parabola parabola1,Parabola parabola2)
    {
        double[] coord2=parabola2.varf_p();
        double[] coord1=parabola1.varf_p();
        double lungime;
        lungime=Math.hypot((coord2[0]-coord1[0]),(coord2[1]-coord1[1]));
        return lungime;
    }
}
