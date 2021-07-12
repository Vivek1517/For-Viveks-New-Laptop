package MethodOverloading;



public class ChildShapes extends Shapes {
    public void shapes(int x){
        System.out.println("I'm a circle in child classs"+" "+x);
    }
    public void shapes(int a, int b, int c, int d){
        System.out.println("I'm a square in child class"+" "+a+" "+b+" "+c+" "+d);
    }
    public void shapes(int a, int b, int c){
        System.out.println("Im a triangle in child class"+" "+a+" "+b+" "+c);
    }

    public static void main(String[] args) {
        ChildShapes printing= new ChildShapes();
        printing.shapes(10);
        printing.shapes(10,10,10,10);
        printing.shapes(10,10,10);
        Shapes parent= new Shapes();
        parent.shapes(10);
        parent.shapes(20,20,20,20);
        parent.shapes(15,15,15);

    }
}
