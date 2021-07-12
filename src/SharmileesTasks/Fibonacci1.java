import java.util.Scanner;

public class Fibonacci1 {
    public void fValue(int n){
        int x=0;
        int y=1;


        for(int i=1; i<=n; i++){
            System.out.println(x);
            int lastValue= x+y;

            y=lastValue+x;


            System.out.println(lastValue);
        }
    }

    public static void main(String[] args) {
        Scanner newObj= new Scanner(System.in);
        System.out.println("Print a number to get Fibonacci Calculation");
    int n= newObj.nextInt();
    Fibonacci1 newF= new Fibonacci1();
    newF.fValue(n);
    }
}
