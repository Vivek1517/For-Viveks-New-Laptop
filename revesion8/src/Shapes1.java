public class Shapes1 extends Shapes {
    public void circle(float a){

        System.out.println("I'm a Circle with diameter of: "+a);
    }
    public void square(int a, int b, int c, int d){
        System.out.println("I'm a Square in child class & my dimensions are: "+a+b+c+d);
    }
    public void rectangle(int a, int b, int c, int d){
        System.out.println("I'm a rectangle & this are my measurements: "+a+b+c+d);
    }
    public void pentagon(short a, short b, short c, short d, short e){
        System.out.println("I'm a Pentagon & this how big i'm: "+a+b+c+d+e);
    }

    public static void main(String[] args) {
        Shapes parentShapes= new Shapes();
        Shapes1 childShapes= new Shapes1();
        parentShapes.square(10, 10, 10, 10);
        childShapes.square(10, 10,10,10);
    }
}
