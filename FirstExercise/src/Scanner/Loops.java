package Scanner;

import java.util.Scanner;

public class Loops {

    public static void prime(){
        for(int i=2; i<100; i++){
            boolean flag= true;
            for(int j=2; j<i-1; j++){
                if(i%j==0){
                    flag= false;
                    break;
                }

            }
            if(flag==true){
                System.out.println(i);
            }
        }
    }
    public static void prime(int n){
        int i, rem;
        boolean flag1 = true;
        for(i=2; i<n; i++){
            rem = n%i;
            if (rem==0){
                flag1 = false;
                break;
            }
        }
        if (flag1 == true){
            System.out.println("Is a prime number");
        }
        else{
            System.out.println("Is not a prime number");
        }
    }

    public static void main(String[] args) {
       // prime();
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter a number to tell you if it is a prime number or not");
        int userValue= userInput.nextInt();
        prime(userValue);
    }
}
