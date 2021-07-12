import java.util.Scanner;

public class Days {
    public void week(String days){
        switch (days){
            case "1":
                System.out.println(days+" is Monday");
break;
            case "2":
                System.out.println(days+" is Tuesday");
                break;
            case "3":
                System.out.println(days+" is Wednesday");
                break;
            case "4":
                System.out.println(days+" is Thursday");
                break;
            case "5":
                System.out.println(days+" is Friday");
                break;
            case "6":
                System.out.println(days+" is Saturday");
        break;
            case "7":
                System.out.println(days+" is Sunday");
                break;
            default:
                System.out.println(days+" Entered value is not valid, please put value between 1-7");
        }
    }

    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.println("Please enter a value between 1to7 to give you the day of the week");
    String dayNumber=userInput.nextLine();
    Days enteredValue= new Days();
    enteredValue.week(dayNumber);
    }
}
