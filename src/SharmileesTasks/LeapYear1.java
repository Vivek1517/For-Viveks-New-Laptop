import java.util.Scanner;

public class LeapYear1 {
    public static void main(String[] args) {
        Scanner userYear= new Scanner(System.in);
        System.out.println("Enter a year to tell you if it is a leapyear or not");
        int year= userYear.nextInt();
        int leapYear= year%4;
        if(leapYear==0){
            System.out.println(year+" is a leapyear");
            }
        else{
            System.out.println(year+" is not a leapyear");
        }

    }
}
