import java.util.Scanner;
// enter numerical value and this class will tell whether its positive or negative
public class NumberValue {
    public void vlaue(int a){
        if(a>0){
            System.out.println(a+" Is a positive value");
        }
        else if(a<0)
            {
            System.out.println(a+" is a negative number");
        }
        else{
            System.out.println("Entered value is "+a+" which is a neutral value");
        }
    }

    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter a value & it will tell you if it is a positive or a negative value");
        int input= userInput.nextInt();
        NumberValue enteredValue= new NumberValue();
        enteredValue.vlaue(input);
    }
}
