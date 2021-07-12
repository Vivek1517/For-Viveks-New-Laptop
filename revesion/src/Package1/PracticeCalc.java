package Package1;

public class PracticeCalc {
    public static void main(String[] args) {
        int a=250, b=350;
        int c=a+b;
        int d=300;
        int f=d*c;
        int g=f-c;
        double h= d%c;
        System.out.println("Adding value of "+a+" & "+b+" total is "+c);
        System.out.println("Multiplying value of "+d+" & "+c+" total is "+f);
        System.out.println("Subtracting vlaue of "+f+" & "+c+" total is "+ g);
        System.out.println("Remainder of "+f+" & "+c+" is "+h);
    }
}
