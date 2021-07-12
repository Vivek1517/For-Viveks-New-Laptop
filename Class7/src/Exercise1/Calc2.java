package Exercise1;

public class Calc2 extends Calc1 {
    public int multiplication(int a, int b){
        return a*b;

    }
    public int division(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        Calc2 newObj= new Calc2();
        System.out.println(newObj.add(20, 77));
        System.out.println(newObj.subtraction(100, 1000));
        System.out.println(newObj.multiplication(300, 400));
        System.out.println(newObj.division(200, 10));

    }
}
