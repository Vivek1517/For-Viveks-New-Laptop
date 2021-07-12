package Random;

import java.util.Random;

public class Practice2 {
    public static void userName(String email){
        Random number = new Random();
        int randomNumber= number.nextInt(100);
        System.out.println(email+randomNumber+"@gmail.com");
    }

    public static void main(String[] args) {
        userName("vaslgaonkar");
    }
}
