package Exercise3;

import java.util.Scanner;

public class TextMark {
    public void numericalMark(String textMark){
        switch(textMark){
            case "9-10":
                System.out.println("Sobresaliente");
                break;
            case "7-8":
                System.out.println("Notable");
                break;
            case "6":
                System.out.println("Bien");
                break;
            case "5":
                System.out.println("Aprobado");
                break;
            case "0-4":
                System.out.println("Suspenso");
                break;
            default:
                System.out.println("Please enter value as shown above");
        }

    }
    public void display(){
        System.out.println("9-10");
        System.out.println("7-8");
        System.out.println("6");
        System.out.println("5");
        System.out.println("0-4");
    }

    public static void main(String[] args) {
        TextMark newMark= new TextMark();
        newMark.display();
        Scanner newN= new Scanner(System.in);
        System.out.println("Input the numerical value as shown above to se their value");
        String n= newN.nextLine();
        newMark.numericalMark(n);
    }
}
