package ConditionalStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner tableNumber= new Scanner(System.in);
        System.out.println("Enter a number you want a multiplication table for");
        int inputNumber= tableNumber.nextInt();
        int i;
        for(i=1; i<=10; i++){
            System.out.println(inputNumber+"x"+i+" = "+inputNumber*i);
       }


    }
}
