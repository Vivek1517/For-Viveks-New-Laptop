import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        Random random= new Random();
        int number= random.nextInt(1000);
        int number1= random.nextInt(250);
        System.out.println("vks"+number+"@gmail.com");
        System.out.println("kvs"+number1);
        System.out.println("Random Number: "+number);
        System.out.println("Random number between 0 - 250: "+number1);
        emailID("fjfdj"+number+"@gmail.com");
    }
    public static void emailID(String email) {

        System.out.println(email);
    }
    public static void userName(String username){

        System.out.println(username);
    }
}
