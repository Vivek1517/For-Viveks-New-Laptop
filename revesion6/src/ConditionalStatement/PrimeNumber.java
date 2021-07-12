package ConditionalStatement;

import java.util.Scanner;

public class PrimeNumber {
    public void printPrimeNumber(int a){
        boolean primeNumber=true;
        for(int i=2; i<=a-1; i++){

            if(a%i==0){
                primeNumber=false;
            }

        }
        if(primeNumber){
            System.out.println(a+ " is a prime number");
        }
        else{
            System.out.println(a+" is not prime number");
        }
    }

    public static void main(String[] args) {
        PrimeNumber number= new PrimeNumber();
        Scanner enterValue= new Scanner(System.in);
        System.out.println("Enter a value to check if it is a Prime number or not");
        int userEnteredValue= enterValue.nextInt();
        number.printPrimeNumber(userEnteredValue);
    }
}
