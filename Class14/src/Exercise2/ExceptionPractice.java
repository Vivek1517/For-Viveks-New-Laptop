package Exercise2;

import java.util.ArrayList;

public class ExceptionPractice {
    
    public void division( double a, double b){
        try{
            double c= a/b;
            System.out.println(c);
            ArrayList<Integer> numbers= new ArrayList<Integer>();
            numbers.add(4);
            numbers.add(7);
            numbers.add(9);
            numbers.add(14);
            System.out.println(numbers.get(5));
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(IndexOutOfBoundsException aio){
            System.out.println(aio);
        }
    }

    public static void main(String[] args) {
        ExceptionPractice result= new ExceptionPractice();
        result.division(10, 0);
        result.division(4,2);

    }
}
