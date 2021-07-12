package Abstraction;

public class Addition implements Maths {
    @Override
    public void add(int a, int b) {
        int result= a+b;
        System.out.println(" Adding "+a+" & "+b+" :"+result);
    }

    @Override
    public void multi(float a, float b) {

    }

    @Override
    public void div(double a, double b) {

    }
}
