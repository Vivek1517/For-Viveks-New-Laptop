import java.util.Random;

public class UserAccount {
    public static void userName(String userAccount, String password){

        System.out.println("Username "+userAccount+" Password"+password);
    }

    public static void main(String[] args) {
        Random account= new Random();
        int print=account.nextInt(100);
userName("Kvs"+print, " VKS"+print);


    }
}
