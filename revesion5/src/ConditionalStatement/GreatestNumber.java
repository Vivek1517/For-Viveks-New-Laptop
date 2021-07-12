package ConditionalStatement;

import java.util.Scanner;

public class GreatestNumber {
    public void getGreatestNumber(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a+" is the greatest number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the greatest number");
        }
        else {
            System.out.println(c+" is the greatest number");
        }
    }

    public static void main(String[] args) {
        GreatestNumber value = new GreatestNumber();
        Scanner userEnteredValue= new Scanner(System.in);
        System.out.println("Enter value 3 values to determine greatest number");
        int enteredValue1= userEnteredValue.nextInt();
        int enteredValue2= userEnteredValue.nextInt();
        int enteredValue3= userEnteredValue.nextInt();
        value.getGreatestNumber(enteredValue1,enteredValue2,enteredValue3);
    }
}
