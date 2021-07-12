import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        int sum=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number you would like the odd numbers to find out the sum");
        int n= input.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(2*i-1);
            sum=sum+2*i-1;
        }
        System.out.println(sum);
    }
}
