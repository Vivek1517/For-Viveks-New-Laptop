import java.util.Scanner;

public class SharmileePrimeNumber {
    public static void main(String[] args) {
        Scanner inputValue= new Scanner(System.in);
        System.out.println("Enter any value to see if it is a prime number or not");
        int value= inputValue.nextInt();
        boolean flag=false;
        for(int i=2; i<value; i++){
            int primeNumber= value%i;


            if(primeNumber==0){
                System.out.println("Given number is not a prime number");
                i=value;
                flag=true;
            }

           }
        if(flag==false){
            System.out.println("it is a prime number");
        }
            }



    }
