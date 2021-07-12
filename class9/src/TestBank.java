public class TestBank {
    public static void main(String[] args) {
       BarclaysBank printingBarclays= new BarclaysBank();
       TescoBank printingTesco= new TescoBank();
       LlyodsBank printingLlyods= new LlyodsBank();
       printingBarclays.bankRules(16,6, 500);
       printingTesco.bankRules(16, 5, 250);
       printingLlyods.bankRules(16, 4.5f, 300);
    }
}
