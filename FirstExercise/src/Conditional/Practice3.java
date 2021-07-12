package Conditional;
//1. Write a program to compare 2 number and print maximum value
//2. Write a program to compare 2 numbers and print minimum value
//3. write a program to find out whether number is positive or negative number

import java.util.Scanner;

public class Practice3 {

    public void max(int a, int b){

       if(a>b){
            System.out.println(a+" Is the greatest number");
        }
        else{
            System.out.println(b+" Is the greatest number");
        }
    }
    public void mini(int a, int b){
        System.out.println(a+" & "+b);
        if(a<b){
            System.out.println(a+" Is the lowest number");
        }
        else{
            System.out.println(b+" Is the lowest number");
        }
    }

    public void pOrN(int a){
        System.out.println(a);
        if(a>=0){
            System.out.println(a+" Is a positive number");
        }
        else{
            System.out.println(a+" Is a negative number");
        }
        if(a==0){
            System.out.println(a+" It is neutral number");
        }
    }

    public static void main(String[] args) {
        Practice3 obj = new Practice3();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers to find out which is a higher number");
        int maxN1= input.nextInt();
        int maxN2= input.nextInt();
        obj.max(maxN1, maxN2);
        System.out.println("Enter a numbers to find out which is lower number");
        int min1= input.nextInt();
        int min2= input.nextInt();
        obj.mini(min1, min2);
        System.out.println("Enter a number to find out if it is positive or negative");
        int pN= input.nextInt();
        obj.pOrN(pN);
    }
}
