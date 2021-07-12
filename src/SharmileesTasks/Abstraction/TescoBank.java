package Abstraction;

public class TescoBank implements Bank{
    public void bankRules(int INTEREST_RATE, short AGE, int MINIMUM_AMOUNT) {
        System.out.println("The rules of Barclays Bank are that you must be "+AGE+" & over");
        System.out.println("Interest rate Barclays Bank pay per anum is "+INTEREST_RATE+"%");
        System.out.println("Minimum amount to open an account is $"+ MINIMUM_AMOUNT);

    }
}
