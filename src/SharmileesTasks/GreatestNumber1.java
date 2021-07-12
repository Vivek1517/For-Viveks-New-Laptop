import java.util.Scanner;

public class GreatestNumber1 {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter 3 value & it will give you the greatest number");
        int inputNumber1= userInput.nextInt();
        int inputNumber2 = userInput.nextInt();
        int inputNumber3= userInput.nextInt();
        if(inputNumber1>inputNumber2 && inputNumber1>inputNumber3){
            System.out.println(inputNumber1+" is the greatest number");
        }
        else if(inputNumber2>inputNumber1 && inputNumber2>inputNumber3){
            System.out.println(inputNumber2+" is the greatest number");
        }
        else{
            System.out.println(inputNumber3+" is the greatest number");
        }
    }
}
