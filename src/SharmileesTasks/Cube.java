import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner inputValue= new Scanner(System.in);
        System.out.println("Enter a number to get cubic value till the entered value");
        int n= inputValue.nextInt();
        for(int i=0; i<=n; i++){
            System.out.println("Number is "+i+" the cube of " +i+" : "+(i*i*i));
        }

    }


}
