package Exercise3;

import java.util.Scanner;

public class Answers {
    public void value(String z){
        switch(z){
            case "a":
                System.out.println("Int 1x=10;");
                break;
            case "b":
                System.out.println("Int x =10;");
                break;
            case "c":
                System.out.println("Float x=10.0f;");
                break;
            case "d":
                System.out.println("string x="+"10");
                break;
            default:
                System.out.println("Please enter a valid value, it has to be a small character as this is case sensitive");
        }
    }


    public static void main(String[] args) {
        Answers newObj= new Answers();
        Scanner newT= new Scanner(System.in);
        System.out.println("Enter character between a&d to get their values");
        String t= newT.nextLine();
        newObj.value(t);
    }
}
