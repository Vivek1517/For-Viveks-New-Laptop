package ConditionalStatement;

import java.util.Scanner;

public class Sum {
    public void add(int number){
        int sum=0;
        int average=0;
        for(int i=1; i<=number; i++){
             sum=sum+i;
             average=sum/number;

        }
        System.out.println("Sum of 1st "+number+" number is: "+sum);
        System.out.println("Average of 1st "+ number+ "is: "+average);
    }

    public static void main(String[] args) {
        Sum value= new Sum();
        Scanner inputNumber= new Scanner(System.in);
        System.out.println("Enter a number to give you sum upto that number");
        int enterNumber=inputNumber.nextInt();
        value.add(enterNumber);
    }
}
