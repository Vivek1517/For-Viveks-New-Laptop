package ForLoop;

import java.util.Scanner;

public class Prime6 {

    /*public void isPrime(int n){
        int remainder;
        boolean flag = true;

        for(int i = 2; i<n; i++) {
            remainder = n % i;
            if (remainder == 0) {
                flag = false;
                break;
            }
        }
            if(flag==true){
                System.out.println("Given number is a prime number");
            }
            else {
                System.out.println("Given number is not a prime number");
            }


    }*/

    public boolean isPrime(int n){
        int remainder;
        boolean flag = true;
        for (int i =2; i<n; i++){
            remainder = n%i;
            if(remainder==0){
                flag = false;
                break;
            }
        }
     return flag;
    }

    public static void main(String[] args) {
        Prime6 prime = new Prime6();
        for (int j = 2; j < 100; j++) {
        if(prime.isPrime(j)){
            System.out.print(j+" ");
        }
        }
    }
 }




