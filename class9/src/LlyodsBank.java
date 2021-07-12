public class LlyodsBank implements Bank{

    public void bankRules(int age, float interestRate, long minimumAmountToOpenAccount) {
        System.out.println("You need to be "+age+" to open a saving account with Llyods Bank");
        System.out.println("Interest rate Llyods Bank pay per year is "+ interestRate+"%");
        System.out.println("You need minimum $ "+minimumAmountToOpenAccount+" to open an account with Llyods Bank");
        System.out.println("This branch is at "+Branch);
    }
}
