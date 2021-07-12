package ForLoop;

import com.sun.source.tree.ClassTree;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number to get Fibonacci series");
        int userInput= input.nextInt();

        int current=1;
        int last=0;
        System.out.print(last+" ");
        System.out.print(" "+current+" ");
        for(int i=2; i<=userInput; i++){
            int lastLast=last;
            last= current;
            current= lastLast+last;
            System.out.print(current+" ");
        }

//        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter a number to print Fibinacci series");
//        int numberToEnter=obj.nextInt();
//        int current=1;
//        int last=0;
//        System.out.println(last);
//        System.out.println(current);
//        for(int i=2; i<=numberToEnter; i++){
//        int lastLast=last;
//        last=current;
//        current=lastLast+last;
//        System.out.println(current);
//        }
    }
}
