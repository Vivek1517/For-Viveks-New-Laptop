import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sum= new Scanner(System.in);
        System.out.println("Enter 2 values to give you the sum");
        int value1= sum.nextInt();
        int value2= sum.nextInt();
        int finalValue=value1+value2;
        System.out.println("Addition of "+value1+" & "+value2+" is : "+finalValue);
    }
}
