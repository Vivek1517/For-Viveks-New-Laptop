package ConditionalStatement;

import java.util.Scanner;

public class PositiveOrNegative {
    public void numberValue(int a){
        if(a>=0){
            System.out.println("Entered number"+a+" is a positive number");
        }
        else{
            System.out.println("Entered number"+a+" is a negative number");
        }
    }

    public static void main(String[] args) {
        PositiveOrNegative value= new PositiveOrNegative();
        Scanner inputNumber= new Scanner(System.in);
        System.out.println("Enter a value to determine whether it is a positive or negative");
        int enteredNumber=inputNumber.nextInt();
        value.numberValue(enteredNumber);
    }
}
