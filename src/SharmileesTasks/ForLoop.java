import java.util.Scanner;

public class ForLoop {
    public void factor(int factorialNum){
        int x=1;

        for(int i=1; i<=factorialNum; i++){
            x=i*x;
        }
        System.out.println("Factorial Value of "+ factorialNum +" is"+x);
    }

    public static void main(String[] args) {
        ForLoop newObj= new ForLoop();
        Scanner newF= new Scanner(System.in);
        System.out.println("Enter a number to find the factorial value");
        int v= newF.nextInt();
        newObj.factor(v);

    }
}
