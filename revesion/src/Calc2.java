public class Calc2 {
    public static void main(String[] args) {
        Calc1 newObj= new Calc1();
        System.out.println("Sum of " + newObj.a+" & "+newObj.b+" : "+newObj.add);
        System.out.println("Division of " + newObj.a+" & "+newObj.b+" : "+newObj.division);
        System.out.println("Substraction of " + newObj.a+" & "+newObj.b+" : "+newObj.sub);
        newObj.addition();
        newObj.multi();
    }
}
