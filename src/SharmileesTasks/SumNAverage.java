import java.util.Scanner;

public class SumNAverage {
    public static void main(String[] args) {
       int sum=0;
       double average;
        System.out.println("Enter 5 numbers");
       for(int i=0; i<5; i++){
           Scanner enteredNumber= new Scanner(System.in);
          int n= enteredNumber.nextInt();
           sum=n+sum;
       }
       average=sum/5;
        System.out.println("The sum of 5 number is: "+sum);
        System.out.println("The average for "+sum+" is: "+average);
    }
}
