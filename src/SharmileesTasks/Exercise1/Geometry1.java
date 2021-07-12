package Exercise1;

public class Geometry1 extends Geometry{
    public void math(int a, int b){
        int reult = a+b;
        System.out.println("Addition of "+a+" & "+b+" :"+reult);
    }
    public static void math1(int c, int d){
        int result1=c+d;
        System.out.println("The addition of "+c+" & "+d+" :"+result1);

    }

    public static void sub(String name){
        System.out.println("My name is :"+name);
    }
    public static void main(String[] args) {
        Geometry1 shapeSizes= new Geometry1();
        shapeSizes.shape(10, 10, 10);
        shapeSizes.shape(20);
        shapeSizes.shape(20, 20, 20, 20);
        shapeSizes.shape(5, 5, 5, 5, 5);
        math1(10,20);
        sub("Vivek");

    }
}
