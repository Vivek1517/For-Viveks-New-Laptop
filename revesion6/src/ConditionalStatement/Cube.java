package ConditionalStatement;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {

    Scanner inputNumber= new Scanner(System.in);
        System.out.println("Enter a number to give you cube value upto that number");
        int userValue= inputNumber.nextInt();
        for(int i=1; i<=userValue; i++){
            System.out.println("Cubic value of "+i+" is "+i*i*i);
        }
    }
}
