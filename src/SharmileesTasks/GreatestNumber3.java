import java.util.Scanner;

public class GreatestNumber3 {
    public void maximumNumber(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a+" is the greatest number");
        }
        else{
            if (b>c && b>a){
                System.out.println(b+" is the greatest number");
            }
            else{
                System.out.println(c+" is the greatest number");
            }

        }
        }

    public static void main(String[] args) {
        GreatestNumber3 greatestNumber3= new GreatestNumber3();
        Scanner newObj= new Scanner(System.in);
        System.out.println("Type 3 numbers to give you greatest number");
        int num= newObj.nextInt();
        int num1 = newObj.nextInt();
        int num2= newObj.nextInt();
        greatestNumber3.maximumNumber(num, num1, num2);
            }



}
