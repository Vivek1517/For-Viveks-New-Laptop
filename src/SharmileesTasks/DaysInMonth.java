import java.util.Scanner;

public class DaysInMonth {
    public void days(String month, int year){
        short v=4;
        int leapyear= year%v;
        System.out.println(month+"-entered value");
        if(month.toLowerCase().equals("january")){
            System.out.println("January has 31 Days");
        }
        if (month=="February"){
            if (leapyear==0){
                System.out.println("February has 29 Days");
            }
            else{
                System.out.println("February has 28 Days");
            }
        }
        if(month.toLowerCase().equals("march")){
            System.out.println("March has 31 Days");
        }
        if(month=="April"){
            System.out.println("April has 30 Days");
        }
        if(month=="May"){
            System.out.println("May has 31 Days");
        }
        if(month=="June"){
            System.out.println("June has 30 Days");
        }
        if(month=="July"){
            System.out.println("July has 31 Days");
        }
        if(month=="August"){
            System.out.println("August has 31 Days");
        }
        if(month=="September"){
            System.out.println("September has 30 Days");
        }
        if(month=="October"){
            System.out.println("October has 31 Days");
        }
        if(month=="November"){
            System.out.println("November has 30 Days");
        }
        if(month=="December"){
            System.out.println("December has 31 Days");
        }
    }

    public static void main(String[] args) {
        Scanner newObj= new Scanner(System.in);
        System.out.println("Enter Month & Year to find out how many days in that month for that year:");
        DaysInMonth month= new DaysInMonth();
        String mo= newObj.nextLine();
        int year= newObj.nextInt();
        month.days(mo.trim(), year);
    }
}
