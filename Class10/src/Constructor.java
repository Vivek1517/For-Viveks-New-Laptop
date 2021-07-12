public class Constructor {
    double a;
    double b;
    Constructor(int value1, int value2){
        a= value1;
        b= value2;
        System.out.println("This is a sum of "+value1+" & "+value2+" : "+(a+b));
        }
        Constructor(){
            System.out.println("This is a defualt contructor");
        }
        Constructor(double c, double d, double e){
        a = c;
        b = d;
            System.out.println("This ia divison of "+ c+" & "+d+" : "+(a/d)*e);
        }



    public static void main(String[] args) {
        new Constructor(10, 20);
        new Constructor();
        new Constructor(10,2,5 );


    }
}
