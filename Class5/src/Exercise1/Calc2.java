package Exercise1;

import java.util.Scanner;

public class Calc2 {
    public void multiplication(float a, float b){
        float c= a*b;
        System.out.println("Multiplying "+ a+"X"+b +": "+c);
    }
public void division (double a, double b){
        double c = a/b;
    System.out.println("Dividing " +a +"/"+ b+": " + c);
}

    public static void main(String[] args) {
        Calc1 add= new Calc1();
        add.addition(50, 215);
        add.subtraction(75, 195);
        Calc2 multiplying= new Calc2();
        multiplying.multiplication(200, 300);
        multiplying.division(450, 22);
    }
}
