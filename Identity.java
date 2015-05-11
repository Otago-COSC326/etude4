public class Identity {

    public static void main(String[] args){
        calculate();
    }

    public static float equation(float f, float g){
        return (((f/g) - f * g) * g) + (f * g * g);
    }

    public static double equation(double f, double g){
        return (((f/g) - f * g) * g) + (f * g * g);
    }

    public static int equation(int f, int g){
        return (((f/g) - f * g) * g) + (f * g * g);
    }

    public static void calculate(){
        float f;
        float g;

        System.out.println("Single Precision : ");

        f = 0.00000000005675847f;
        g = 1789.0f;
        System.out.println("x = " + f + ", y =" + g);
        System.out.println(" >> " + equation(f, g));

        f = 0.00000000005675847f;
        g = 100.0f;
        System.out.println("x = " + f + ", y =" + g);
        System.out.println(" >> " + equation(f, g));

        f = 0.00000000005675847f;
        g = 1797402457.0f;
        System.out.println("x = " + f + ", y =" + g);
        System.out.println(" >> " + equation(f, g));

        f = 0.00000000005675847f;
        g = 10.0f;
        System.out.println("x = " + f + ", y =" + g);
        System.out.println(" >> " + equation(f, g));

        System.out.println("Double Precision : ");
        double df;
        double dg;

        df = 0.00000000005675847;
        dg = 1789.0;
        System.out.println("x = " + df + ", y =" + dg);
        System.out.println(" >> " + equation(df, dg));

        df = 0.00000000005675847;
        dg = 100;
        System.out.println("x = " + df + ", y =" + dg);
        System.out.println(" >> " + equation(df, dg));

        df = 0.00000000005675847;
        dg = 1797402457.0;
        System.out.println("x = " + df + ", y =" + dg);
        System.out.println(" >> " + equation(df, dg));

        df = 0.00000000005675847;
        dg = 10.0;
        System.out.println("x = " + df + ", y =" + dg);
        System.out.println(" >> " + equation(df, dg));
    }

}
