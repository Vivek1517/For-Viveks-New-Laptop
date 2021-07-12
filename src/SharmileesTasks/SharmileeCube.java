import java.util.Scanner;

public class SharmileeCube {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.println("Input a number to get cubic value:");
        int n= userInput.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Printing cube values of "+i+ " : "+(i*i*i));
        }
    }
}
