package MethodOverloading;

public class PraticeOverloading {
    public void shapes(int x){
        System.out.println("I'm a circle & my radius is "+x);
       }
    public void shapes(int a, int b, int c){
        System.out.println("I'm a triangle & my radius is "+a+b+c);
    }
    public void shapes(double a, double b, double c){
        System.out.println("I'm a triangle: "+a+" "+b+" "+c);
    }

    public static void main(String[] args) {
        PraticeOverloading print = new PraticeOverloading();
        print.shapes(10);
        print.shapes(10, 10, 10);
        print.shapes(20.256, 20.256, 20.256);

    }
}
