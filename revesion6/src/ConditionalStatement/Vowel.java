package ConditionalStatement;

import java.util.Scanner;

public class Vowel {
    public void printVowelOrConsonant(String character){
        if(character.equals("a")||character.equals("e")||character.equals("i")||character.equals("o")||character.equals("u")){
            System.out.println("Is a Vowel");
        }
        else {
            System.out.println("Is a Consonant");
        }
    }

    public static void main(String[] args) {
        Vowel character= new Vowel();
        Scanner userInput= new Scanner(System.in);
        System.out.println("Type a letter to determine whether it is a Vowel or a Consonant");
        String inputValue=userInput.nextLine();
        character.printVowelOrConsonant(inputValue);

    }
}
