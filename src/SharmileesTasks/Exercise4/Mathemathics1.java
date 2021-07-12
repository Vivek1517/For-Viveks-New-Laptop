package Exercise4;

public class Mathemathics1 {
    public void add(int a, int b, int c){
        int d=a+b+c;
        System.out.println("Addition of " +a+" "+b+" " +c+ " = "+d);
    }
    public void multiply(int a, int b, int c){
        int d=a*b*c;
        System.out.println("Multiplication of " +a+" "+b+" " +c+ " = "+d);
    }
    public void remainder(double a, double b){
        double d=a%b;
        System.out.println("Remainder of " +a+" "+b+" = "+d);
    }

    public static void main(String[] args) {
        Mathemathics m= new Mathemathics();
        Mathemathics1 m1= new Mathemathics1();
        m1.add(105, 106, 107);
        m1.multiply(10, 10, 10);
        m1.remainder(100, 3);
        m.add(10,10,10);
        m.multiply(5,5,5);
        m.remainder(50, 7);
        Mathemathics m2;
        Mathemathics1 m3;
        m3= new Mathemathics1();
        m3.add(101,201,301);
    }
}
