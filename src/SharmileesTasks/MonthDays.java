import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner inputValue= new Scanner(System.in);
        System.out.println("Enter a Year to find out how many days that month has");
    int year= inputValue.nextInt();
        System.out.println("Enter a month in numerical value example 1 if you want January");
        int month= inputValue.nextInt();
        int leapYear= year%4;
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 ){
            System.out.println(month+"  has 31 days");
        }
        if(month==2){
           if(leapYear==0){
               System.out.println(" has 29 days");
           }
           if(leapYear!=0){
               System.out.println(" has 28 days");
           }
        }

    }


}
