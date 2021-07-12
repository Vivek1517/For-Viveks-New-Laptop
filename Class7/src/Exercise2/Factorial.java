package Exercise2;

import java.util.Scanner;

public class Factorial {
    public void factors(int z){
        long x=1;
        for(int i=1; i<=z; i++){
            x=i*x;

        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        Factorial newF= new Factorial();
        Scanner newV= new Scanner(System.in);
        System.out.println("Enter a number to find factorial");
        int a= newV.nextInt();
        newF.factors(a);

    }
}
