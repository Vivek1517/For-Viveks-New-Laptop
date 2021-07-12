package Abstraction;



public class TestBank {
    public static void main(String[] args) {
        BarclaysBank bB=new BarclaysBank();
        bB.bankRules(2, (short) 18, 500);
        TescoBank tB= new TescoBank();
        tB.bankRules(3, (short) 18, 500);

    }
}
