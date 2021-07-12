package Inheritance;

public class Child extends Parent {
    public void subtraction(int a, int b){
        int c=a-b;
        System.out.println("Subtracting "+a+" & "+b+" = "+c);
    }
    public void division(int a, int b){
        int c= a/b;
        System.out.println("Value after dividing "+a+" & "+b+" = "+c);
    }

    public static void main(String[] args) {
        Child getValue= new Child();
        getValue.add(20,25);
        getValue.multiply(50, 100);
        getValue.subtraction(10000, 5000);
        getValue.division(10, 2);
    }
}
