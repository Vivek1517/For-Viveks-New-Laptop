package Package2;

import Package1.Class1;

public class Class3 {
    public static void main(String[] args) {
        Class1 fromPkg1= new Class1();
        fromPkg1.division();
    }
    public void subtraction(){
        int a=95, b=195;
        int result= a-b;
        System.out.println(result);
    }
}
