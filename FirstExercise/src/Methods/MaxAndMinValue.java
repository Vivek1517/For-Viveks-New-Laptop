package Methods;

public class MaxAndMinValue {
    int a=40, b =50, c=30;
    public void maxAndMini(){
        if(a>b && a>c){
            System.out.println(a+" Is the greatest value");
        }
        else if(b>a && b>c){
            System.out.println(b+" Is the greates value");
        }
        else {
            System.out.println(c+" Is the greatest value");
        }
    }
    public void areaOfRectangle(int a, int b, int c, int d){
        int area=a*b*c*d;
        System.out.println("My size is "+area);
    }
    void MaxAndMinValue(){
        System.out.println("I'm a class constructor");
    }

    public static void main(String[] args) {
        MaxAndMinValue result= new MaxAndMinValue();
        System.out.println("Where A= "+result.a);
        System.out.println("Where B= "+result.b);
        System.out.println("Where C= "+result.c);
        result.maxAndMini();
    }
}
