import java.util.Random;

public class PracticeRandom {
    public static void userName(String account, String password){
        Random input= new Random();
        int randomNumber= input.nextInt(100);
        String email=account+randomNumber+"@gmail.com"+" Password: "+password+randomNumber;
        System.out.println(email+password);
    }

    public static void main(String[] args) {
        userName("vivek", "Kiyaan");
    }
}
