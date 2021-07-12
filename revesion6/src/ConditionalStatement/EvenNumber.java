package ConditionalStatement;

import java.util.Scanner;

public class EvenNumber {
    public void printEvenOddNumber(int a){
        if(a%2==0){
            System.out.println(a+" Is an even number");
        }
        else{
            System.out.println(a+" Is an odd number");
        }
    }

    public static void main(String[] args) {
        EvenNumber value=new EvenNumber();
        Scanner inputNumber= new Scanner(System.in);
        System.out.println("Enter a value to determine whether it is an even or odd number");
        int userNumber= inputNumber.nextInt();
        value.printEvenOddNumber(userNumber);
    }
}
