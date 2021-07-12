package Conditional;

import java.util.Scanner;

public class Practice4 {
//    public void year(int enterYear){
//        if(enterYear%4==0){
//            System.out.println("Entered year is a Leap Year");
//        }
//        else{
//            System.out.println("Entered year is not a Leap Year");
//        }
//    }
//
//    public static void main(String[] args) {
//        Practice4 obj = new Practice4();
//        Scanner userInput= new Scanner(System.in);
//        System.out.println("Enter a year to find out if it is a Leap Year");
//        int userValue= userInput.nextInt();
//        obj.year(userValue);
//    }
    public static void year1(int month, int year){
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println(month+" has 31 days");
        }
        if(month==4||month==6||month==9||month==11) {
            System.out.println("Has 30 days");
        }
        if(month==2){
            if(year%4==0){
                System.out.println("Februray has 29 days");
            }
            else{
                System.out.println("February has 28 days");
            }

        }

    }

    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter a Month");
        int userMonth= userInput.nextInt();
        Scanner userYear= new Scanner(System.in);
        System.out.println("Enter a Year");
     //   System.out.println("This is will give you days in a month for that year");
        int inputYear= userInput.nextInt();
        year1(userMonth, inputYear);
    }
}
