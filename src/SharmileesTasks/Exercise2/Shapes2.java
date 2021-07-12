package Exercise2;

public class Shapes2 extends Shapes1{
    public void triangle(int a, int b, int c){
        System.out.println("Child Class Triangles dimensions are "+a+" "+b+" "+c);
    }
    public void cirlce(int a){
        System.out.println("Child Class Circles radius is"+a);
    }
    public void square(int a, int b, int c, int d){
        System.out.println("Child Class Square dimensions are "+a+" "+b+" "+c+" "+d);
    }
    public void pentagon(int a, int b, int c, int d, int e){
        System.out.println("Child Class Pentagon dimensions are "+a+" "+b+" "+c+" "+d+" "+e);
    }

    public static void main(String[] args) {
        Shapes1 s1= new Shapes1();
        Shapes2 s2= new Shapes2();
        s1.triangle(10, 10, 10);
        s1.cirlce(10);
        s1.square(15, 15, 15, 15);
        s1.pentagon(5, 5, 5, 5, 5);
        s2.cirlce(20);
        s2.pentagon(18, 18, 18, 18, 18);
        s2.square(7, 7, 7, 7);
        s2.triangle(8, 8, 8);

    }
}
