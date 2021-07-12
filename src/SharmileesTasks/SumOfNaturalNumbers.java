import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter a value to give you sum upto that number");
        int number= userInput.nextInt();
        int sum=0;
        for(int i=1; i<=number; i++){
            sum=i+sum;
        }
        System.out.println("The value you enteredor number "+ number+ " is "+sum);
    }
}
