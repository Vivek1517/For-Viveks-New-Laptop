package Exercise3;

public class DisplayBenefits {
    public static void main(String[] args) {
        LlyodsBank l= new LlyodsBank();
        Santander s= new Santander();
        Barclays b= new Barclays();
        System.out.println("Please see below benefits of opening account with different banks");
        System.out.println(" ");
        l.benefits("Get a 5star hotel stay in Maldives for 2 nights when you open a Platinum account with Llyods Bank");
        s.benefits("Enjoy dinner for 2 in Fat Duck a 3 michelin star restaurant when you open a Platinum account with Santander Bank");
        b.benefits("Enjoy lunch for 2 & a bottle of house wine at Wagamamas when you open a Platinum account with Barclays Bank");
    }
}
