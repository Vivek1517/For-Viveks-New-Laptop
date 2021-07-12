package MethodOverloading;

public class Shapes {
    public void shapes(int x){
        System.out.println("I'm a circle with radius of: "+x);
    }
    public void shapes(int a, int b, int c, int d){
        System.out.println("I'm a square with lenght of: "+a+b+c+d);
    }
    public void shapes(int a, int b, int c){
        System.out.println("I'm a triangle with length of: "+a+b+c);
    }
}
