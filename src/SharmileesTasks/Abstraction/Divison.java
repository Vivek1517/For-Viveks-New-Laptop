package Abstraction;

public abstract class Divison implements Maths {
    @Override
    public void div(double a, double b) {
        double result= a/b;
        System.out.println(" Dividing "+a+" & "+b+" :"+result);
    }
    }

