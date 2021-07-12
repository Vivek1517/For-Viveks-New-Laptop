package Random;

import java.util.Random;

public class RandomPractice {
   public void account(String email){
       Random number= new Random();
       int rNumbers= number.nextInt(100);
       System.out.println(email+rNumbers+"@gmail.com");
   }

    public static void main(String[] args) {
        RandomPractice printing= new RandomPractice();
        printing.account("vsalgaonkar");
    }
}
