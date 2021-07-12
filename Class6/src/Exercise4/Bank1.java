package Exercise4;

public class Bank1 extends Bank {
    public void age(int AGE) {
        if (AGE<18) {
            System.out.println("Sorry you need to be 18 to open an account with us");
        } else {
            System.out.println("You are elgibile to open an account with us welcom "+accountName);
        }

    }
public void amount(int minimumAmount, int age){
        if (minimumAmount>1000 && age<18){
            System.out.println("Sorry "+accountName+ " you need to have "+MINIMUM_AMOUNT+" to open an account & you need to be "+ AGE);
        }
        else{
            System.out.println(accountName+" You have sufficient fund but you need to be "+AGE+" to open an accunt");
        }
}

    public static void main(String[] args) {
        Bank1 newAccount= new Bank1();
        newAccount.amount(900, 17);
    }
}