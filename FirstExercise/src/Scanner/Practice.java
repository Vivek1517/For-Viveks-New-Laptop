package Scanner;

import java.util.Scanner;

public class Practice {
//    int i, rem;
//    boolean flag = true;
//    public void primeNumber(int n){
//        for(int i=2; i<n; i++) {
//            rem = n%i;
//            if (rem == 0) {
//                flag = false;
//                break;
//            }
//        }
//            if(flag==true){
//                System.out.println("Is a prime number");
//            }
//            else {
//                System.out.println("Is not a prime number");
//            }
//
//    }
//
//    public static void main(String[] args) {
//        Practice result= new Practice();
//        Scanner inputNumber= new Scanner(System.in);
//        System.out.println("Enter a number to check if it is a prime number or not");
//        int userNumber= inputNumber.nextInt();
//        result.primeNumber(userNumber);
//    }
//public static void main(String[] args) {


//    for (int i = 2; i < 100; i++){
//        boolean flag = true;
//        for(int j=2; j<i-1; j++){
//            if(i%j==0){
//                flag=false;
//
//            }
//
//        }
//        if(flag==true){
//            System.out.println(i);
//        }
//}
    int i, rem;
    boolean flag=true;
    public void prime(int n){
        for(int i=2; i<n; i++){
            rem=n%i;
            if(rem==0){
                flag=false;
            }
        }
        if(flag==true){
            System.out.println("Is a prime number");
        }
        else{
            System.out.println("Is not a prime Number");
        }
    }

    public static void main(String[] args) {
        Practice result= new Practice();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a prime number");
        int userInput= input.nextInt();
        result.prime(userInput);
    }
}



