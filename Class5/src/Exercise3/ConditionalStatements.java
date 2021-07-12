package Exercise3;

public class ConditionalStatements {
    public void maximumValue(int a, int b) {
        if (a > b) {
            System.out.println("Choosing the Maximum Value between " +a +" & "+b+"= " +a);
        }
        else{
            System.out.println("Do not show Minimum Value "+a +" & "+b+"= ");
        }

    }
    public void minimum(int a, int b){
        if (a<b){
            System.out.println("Choosing the Minimum Value between " +a +" & "+b+"= " +a);
        }
        else{
            System.out.println("Do not show Maximum Value between " +a +" "+b+"= ");
        }
    }
    public void passFail(int pass){
        if (pass>=36){
            System.out.println("Congratulations you have passed your exam as you scored "+pass);
        }
        else{
            System.out.println("Sorry you havefailed this module as you scored "+pass);
        }
    }
public void positiveNegative(int a){

        if(a<=-1){
            System.out.println("Value is -ve");
        }
        else    {
            System.out.println("Value is +ve");
        }

}

    public static void main(String[] args) {
        ConditionalStatements max1= new ConditionalStatements();
        max1.maximumValue(35, 25);
        max1.minimum(25, 27);
        max1.maximumValue(25, 45);
        max1.minimum(55, 45);
        max1.passFail(36);
        max1.passFail(35);
        max1.passFail(75);
        max1.positiveNegative(-85);
        max1.positiveNegative(95);
        max1.positiveNegative(-70);
    }
}
