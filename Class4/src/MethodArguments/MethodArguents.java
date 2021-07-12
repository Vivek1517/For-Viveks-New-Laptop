package MethodArguments;

public class MethodArguents {
    public void adition(int a, int b){
        int result= a+b;
                System.out.println("Result of adding a & b: "+result);

    }

    public static void main(String[] args) {
        MethodArguents ad1 = new MethodArguents();
        ad1.adition(10, 20);
        ad1.adition(210, 20);
        ad1.adition(108, 20);
        ad1.adition(10, 280);
        ad1.adition(10, 209);
    }
}
