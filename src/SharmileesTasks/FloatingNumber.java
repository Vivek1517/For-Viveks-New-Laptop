import java.util.Scanner;

public class FloatingNumber {
    public static void main(String[] args) {
        Scanner inputValue= new Scanner(System.in);
        System.out.println("Please enter a floating point number");
        double num1= inputValue.nextDouble();
        System.out.println("Please enter another floatng point number");
        double num2= inputValue.nextDouble();
        num1= num1*1000;
        num1= num1/1000;
        num2= num2*1000;
        num2= num2/1000;

        if(num1==num2){
            System.out.println("The floating value matches");
        }
        else {
            System.out.println("Floating vlaue doesnt match");
        }
    }
}
