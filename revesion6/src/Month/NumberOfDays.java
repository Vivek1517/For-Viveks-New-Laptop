package Month;

import java.util.Scanner;

public class NumberOfDays {
    int year;
    public void getResult(){
        if(year%4==0){
            System.out.println(year+" Is a leap year");
        }
        else{
            System.out.println(year+" Is not a leap year");
        }
    }
    public void getDaysOfMonths(int month){
        if(month==1 || month==3 || month==5 || month==7 || month==9 || month==10 || month==12) {
            System.out.println("This month has 31 days");
        }
        if(month==4 || month==6 || month==8 || month==11){
            System.out.println("30 days in a month");
        }
       else if(year%4==0 && month==2){
            System.out.println("29 days in a month");
        }
        if(year%4!=0 && month==2){
            System.out.println("28 days in a month");
        }

        }


    public static void main(String[] args) {
        NumberOfDays result= new NumberOfDays();
        Scanner inputYear= new Scanner(System.in);
        System.out.println("Enter a year to find out if it is leap year or not");
        int inputyear= inputYear.nextInt();
        System.out.println("Enter a month to find out how many days in that month");

        int monthInput= inputYear.nextInt();
result.year = inputyear;
        result.getResult();
        result.getDaysOfMonths(monthInput);
    }
}
