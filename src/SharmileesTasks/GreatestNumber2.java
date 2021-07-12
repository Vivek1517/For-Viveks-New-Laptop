import java.util.Scanner;

public class GreatestNumber2 {
    public void greatNumber(int a, int b, int c){
        if (a>b){
            if (a>c){
                System.out.println(a+" Is the greatest Number");
            }
        else{
                System.out.println(c+" Is the greatest Number");
            }
        }
        else {
            if (b>c){
                System.out.println(b+" Is the greatest Number");
            }
            else {
                System.out.println(c+" Is the greatest Number");
            }
        }

    }

    public static void main(String[] args) {
        Scanner newobj= new Scanner(System.in);
        System.out.println("Enter 3 numbers to get greatest number");
        GreatestNumber2 numb= new GreatestNumber2();
        int num= newobj.nextInt();
        int num1= newobj.nextInt();
        int num2= newobj.nextInt();
        numb.greatNumber(num, num1, num2);

    }
}
