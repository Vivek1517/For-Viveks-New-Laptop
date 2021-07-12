import java.util.Scanner;

public class Average {
    public void Fivenumbers(int a, int b, int c, int d, int e){
        double f= (a+b+c+d+e)/5d;
                System.out.println("Giving you average for the 5 numbers you have entered: "+f);

    }

    public static void main(String[] args) {
        Average value= new Average();
        Scanner input1= new Scanner(System.in);
        System.out.println("Please enter 5 numbers & it will give you the avegare value of 5 numbers: ");
        int number1= input1.nextInt();
        int number2= input1.nextInt();
        int number3= input1.nextInt();
        int number4= input1.nextInt();
        int number5= input1.nextInt();
        value.Fivenumbers(number1, number2, number3, number4, number5);
    }

}
