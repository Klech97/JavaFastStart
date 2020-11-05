package ex1;

public class FirstEx {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = -3;
        long d = 4l;
        float e = 4.1f;
        double f = 5.1;
        char g = 'g';
        boolean h = false;

        double resultsum = sumThree(a,b,c,d);
        System.out.println(resultsum);

        boolean result2 = sumThree(a,b);
        System.out.println(result2);

        pologitel(c);

        boolean result3 = pologitelno(c);
        System.out.println(result2);

        privet("Илья");

        int year=2005;
        visokosn(year);
    }

    public static  double sumThree(double a, double b, double c, double d){
        double r = a*(b+(c/d));
        return r;
    }

    public static  boolean sumThree(double a, double b){
        double sumab = a+b;
        if (sumab>=10 && sumab<=20)  {
            return true;
        }
        return false;
    }

    public static void pologitel(double a){
        if (a<0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static  boolean pologitelno(int a){
        if (a<0)  {
            return true;
        }
        return false;
    }

    public static  void privet(String a){
        System.out.println("Привет, "+a);
    }

    public static  void visokosn(int a){
        boolean f;
        if ((a%4==0)) {
            if (a % 100 != 0) {
                System.out.println("Високосный");
            } else if ((a / 100) % 4 == 0) {
                System.out.println("Високосный");
            } else {
                System.out.println("НеВисокосный");
            }
        } else {
            System.out.println("НеВисокосный");
        }
    }
}
