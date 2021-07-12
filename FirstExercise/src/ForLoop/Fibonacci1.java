package ForLoop;

import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String[] args) {
        Scanner inputValue= new Scanner(System.in);
        System.out.println("Enter a Number to get Fibonacci Series");
        int userValue= inputValue.nextInt();
        int current=1;
        int last=0;
        System.out.println(last);
        System.out.println(current);
        for(int i=2; i<=userValue; i++){
            int lastLast=last;
            last=current;
            current=lastLast+last;
            System.out.println(current);
        }
    }
}
