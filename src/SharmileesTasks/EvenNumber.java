import java.util.Scanner;

public class EvenNumber {
    public void evenNumber(int n){
        if(n%2==0){
            System.out.println("It is an even number");
                    }
        else {
            System.out.println("It is an odd number");
        }
    }

    public static void main(String[] args) {
        EvenNumber evenNumber= new EvenNumber();
        Scanner number= new Scanner(System.in);
        System.out.println("Type any number to find out if it is an even or odd number");
        int num=number.nextInt();
        evenNumber.evenNumber(num);
    }
}
