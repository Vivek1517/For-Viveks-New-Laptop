package Exercise3;

public class Calc2 extends Calc1 {

    public void multi(int x, int y){
        int z = x*y;
        System.out.println("Multiplication of "+x+" by "+y+": "+z);
    }
    public void divi(float x, float y){
        float z = x/y;
        System.out.println("Division of "+x+" by "+y+": "+z);
    }

    public static void main(String[] args) {
        Calc2 newcalc2= new Calc2();
        newcalc2.add(45, 45);
        newcalc2.sub(95, 105);
        newcalc2.multi(50, 2);
        newcalc2.divi(500, 200);
    }
}

