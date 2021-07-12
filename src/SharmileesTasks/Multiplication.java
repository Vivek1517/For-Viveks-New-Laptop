import java.util.Scanner;

public class Multiplication {
    public void power(int num1, int num2){
        int x=1;
        for(int i=1; i<=num2; i++){
            x =num1*x;

        }
        System.out.println(x);

    }

    public static void main(String[] args) {
        Multiplication newPower= new Multiplication();
        Scanner newObj= new Scanner(System.in);
        System.out.println("Enter 2 numbers to give you the power value");
        int number1= newObj.nextInt();
        int number2= newObj.nextInt();
        newPower.power(number1, number2);
    }
}
