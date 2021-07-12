import java.util.Scanner;

public class Vowel1 {
    public static void main(String[] args) {
        Scanner userValue= new Scanner(System.in);
        System.out.println(" Enter an alpabet to show if it is Vowel or Consonat");
        String value= userValue.nextLine();
        if(value.equals("a") || value.equals("e") || value.equals("o") || value.equals("i") || value.equals("u")){
            System.out.println(value+" is a vowl");
        }
        else{
            System.out.println(value+" is a consonat");
        }
    }
}
