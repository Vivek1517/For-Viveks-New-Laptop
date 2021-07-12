import java.util.Scanner;

public class Switch {
    public void day(String Day){
        switch(Day){
            case "Sunday":
                System.out.println("Rest Day Sunday as it is a family day");
                break;
            case "Monday":
                System.out.println("Bak to work for a hard grind");
                break;
            case "Tuesday":
                System.out.println("Catching up with other department");
                break;
            case "Wednesday":
                System.out.println("Meeting with software testing manager");
                break;
            case "Thursday":
                System.out.println("Writing test cases for project X");
                break;
            case "Friday":
                System.out.println("Putting all the meetings in the diary for next week");
                break;
            case "Saturday":
                System.out.println("It's a weekend no work just spend time with family for the next few days");
                break;
            default:
                System.out.println("Please enter the valid day of the week, with 1st letter being capital & check for any spelling mistakes");
        }

    }

    public static void main(String[] args) {
        Switch newObj= new Switch();
        Scanner newDay= new Scanner(System.in);
        System.out.println("Please enter day of the week to check Viveks Schedule");
        String d= newDay.nextLine();
        newObj.day(d);
    }
}
