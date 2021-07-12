public class BarclaysBank implements Bank {

    public void bankRules(int age, float interestRate, long minimumAmountToOpenAccount) {
        System.out.println("You need to be "+age+" to open a saving account with Barclays");
        System.out.println("Interest rate Barclays Bank pay per year is "+ interestRate+"%");
        System.out.println("You need minimum $ "+minimumAmountToOpenAccount+" to open an account with Barclays Bank");
        System.out.println("This branch is at "+Branch);
    }
}
