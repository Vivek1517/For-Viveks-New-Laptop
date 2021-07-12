package Exercise1;

public class Casting {
    public void division(){
        double a = 12;
        double c= 7;
        double d = a/c;
        int b = (int)d;
        float e= 100;
        float f= 25;
        float g= e/f;
        int h= (int)g;
        long i= 125635455;
        int j= (int)i;
        System.out.println("printing value "+b);
        System.out.println("Printing value "+g);
        System.out.println();

    }

    public static void main(String[] args) {
        Casting getValue= new Casting();
        getValue.division();

    }
}
