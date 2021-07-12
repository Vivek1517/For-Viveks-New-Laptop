package ForLoop;

import java.util.Scanner;

public class PrimeNumber {
    public static void prime(int n){
        int rem;
        boolean flag = true;
        for(int i=2; i<n; i++){
            rem = n%i;
                if(rem == 0){
                    flag= false;
                    break;
                }
        }
        if(flag == true){
            System.out.println("Is a prime number");
        }
        else{
            System.out.println("Is not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value to find out if it is a prime number");
        int userValue= input.nextInt();
        prime(userValue);
    }
}
