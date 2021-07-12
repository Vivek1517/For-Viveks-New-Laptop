import java.util.Scanner;

public class Vowel {
    public void vowelConsonant(String a){
        if (a=="a"){
            System.out.println("It's a Vowel");
        }
        else {
            System.out.println("It is not a Vowel");}
            if (a=="e"){
                System.out.println("It's a Vowel");
                            }
            else {
                System.out.println("It is not a Vowel");}
                if (a=="i"){
                    System.out.println("It's a Vowel");
                }
                else {
                    System.out.println("It is not a Vowel");}
                    if (a=="u"){
                        System.out.println("It's a Vowel");}


        else {
            System.out.println("It is not a Vowel");
        }
    }

    public static void main(String[] args) {
        Vowel myObj = new Vowel();
        Scanner myScan= new Scanner(System.in);
        System.out.println("Enter a letter to tell you if it is a Vowel");
        String a= myScan.next();
        myObj.vowelConsonant(a);
    }
}
