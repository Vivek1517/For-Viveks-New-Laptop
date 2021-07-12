package Abstraction;

public abstract class Multiplication implements Maths {
    @Override
    public void multi(float a, float b) {
        float result= a*b;
        System.out.println("Multiplying "+a+" & "+b+" :"+result);
    }
}
