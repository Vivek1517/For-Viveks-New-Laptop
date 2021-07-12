import java.util.Scanner;

public class LeapYear {
    public void leapYear(short year){
        short v= 4;
        int leapyear= year%v;
    if (leapyear==0){
        System.out.println(year +" It is a Leapyear");
    }
    else{
        System.out.println(year +" It isnt a Leapyear");
    }

    }

    public static void main(String[] args) {
        LeapYear year1= new LeapYear();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a Year & it will tell you if it is a Leapyear or not");
        short y =input.nextShort();
        year1.leapYear(y);
    }


}
