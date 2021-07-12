package Conditional;

import java.sql.SQLOutput;
import java.util.Scanner;

//5. Write a program to print the grade when you provide the total marks
//        Grade A - if marks are between 90% to 100%
//        Grade B  -   if marks are between 70% to 89%
//        Grade C -   if marks are between 37% to 69%
//        Just Pass -  if marks are 36%
//        fail -  if marks are less than 36%
public class Practice5 {
    public void getGrades(int marks){
        if(marks<=100 && marks>=90){
            System.out.println("You got grade A");
        }
        else{
            if(marks<=89 && marks>=70){
                System.out.println("You got grade B");
            }
            if(marks<=69 && marks>=37){
                System.out.println("You got grade C");
            }
            if(marks==36){
                System.out.println("You have just passed");
            }
            if(marks<36){
                System.out.println("You have failed");
            }

        }
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter marks to get grades");
        int userMarks= input.nextInt();
        Practice5 obj = new Practice5();
        obj.getGrades(userMarks);
    }
}
