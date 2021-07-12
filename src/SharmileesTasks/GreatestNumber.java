import java.util.Scanner;

public class GreatestNumber {
    public void weekday(int a){
        if (a==1){
            System.out.println("printing value as Monday");}
            if (a==2){
                System.out.println("printing value as Tuesday");}
                if (a==3){
                    System.out.println("printing value as Wednesday");}
                    if (a==4){
                        System.out.println("printing value as Thursday");}
                        if (a==5){
                            System.out.println("printing value as Friday");}
                            if (a==6){
                                System.out.println("printing value as Saturday");}
                                if (a==7){
                                    System.out.println("printing value as Sunday");}
                                }

    public static void main(String[] args) {

        Scanner weekday= new Scanner(System.in);
        System.out.println("Enter number between 1 and 7 to get days of the week:");
        GreatestNumber week= new GreatestNumber();

        int print = weekday.nextInt();
        week.weekday(print);
    }
                            }
