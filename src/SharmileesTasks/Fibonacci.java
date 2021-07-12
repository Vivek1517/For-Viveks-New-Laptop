import java.util.Scanner;

public class Fibonacci {
    public void value(int n) {
        int x=0;
        int lastvalue=1;
//        System.out.print(x + " ");
//        System.out.print(lastvalue + " ");
        lastvalue =x+lastvalue;
        int y =lastvalue;
        int temp =0;
        for(int i=2; i<=n; i++){
temp =lastvalue;
lastvalue = y+lastvalue;
y=temp;
            System.out.print(lastvalue + " ");
        }

    }

    public static void main(String[] args) {
        Scanner newObj= new Scanner(System.in);
        System.out.println("Enter a number to find Fibonacci value");
        Fibonacci valueFibonnaci = new Fibonacci();
        int enteredValue= newObj.nextInt();
        valueFibonnaci.value(enteredValue);
    }
}
