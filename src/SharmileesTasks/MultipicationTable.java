import java.util.Scanner;

public class MultipicationTable {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.print("Enter a multiplication number: ");
        int multiplicationNumber= userInput.nextInt();
        System.out.print("Enter a number you want to multiply until: ");
        int multiplyTill= userInput.nextInt();
        for(int i=1; i<=multiplyTill; i++){
            System.out.println(multiplicationNumber+"X"+i +"= "+multiplicationNumber*i);
        }
    }
}
