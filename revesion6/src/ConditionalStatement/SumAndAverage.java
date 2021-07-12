package ConditionalStatement;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner enterValue= new Scanner(System.in);
        System.out.println("Enter 5 values to give sum & average of the sum");
        int sum=0;
        double average=0;
        for(int i=0; i<5; i++){
        int n= enterValue.nextInt();
        sum=sum+n;
        average=sum/5;
        }
        System.out.println(sum);
        System.out.println(average);


    }

    }