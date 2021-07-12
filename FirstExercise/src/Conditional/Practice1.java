package Conditional;

import java.util.Scanner;

//4. Write a program to print the result when you provide the total marks
//        Pass -  if total  marks are more than 36%
//        fail -  if total marks are less than 36%
//

public class Practice1 {
    public void passingMarks(int marks){
                if(marks>=36){
            System.out.println("Congratulations you have passed");
        }
        else{
            System.out.println("Sorry you failed");
        }
    }

    public static void main(String[] args) {
        Practice1 result= new Practice1();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter percentage you have recieved to give you the result");
        int enterMarks= obj.nextInt();
        result.passingMarks(enterMarks);
    }
}
