import java.util.Scanner;

public class IfElsePractice {
    public void greatestNumber(int a, int b, int c){
        if (a>b){
            if (a>c){
                System.out.println(a+" Is the greatest Number");
            }
            else{
                System.out.println(c+" Is the greatest Number");
            }

        }
        else {
            if(b>c){
                System.out.println(b+" Is the greatest Number");
            }
            else{
                System.out.println(c+" Is the greatest Number");
            }
        }

    }

    public static void main(String[] args) {
        IfElsePractice greatest = new IfElsePractice();
        Scanner number= new Scanner(System.in);
        System.out.println("Enter 3 number & get the greatest Number");
        int num= number.nextInt();
        int num1 = number.nextInt();
        int num2 = number.nextInt();
        greatest.greatestNumber(num, num1, num2);
    }
}
