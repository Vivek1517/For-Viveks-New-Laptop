package ConditionalStatement;

public class CompareMinValue {
    public static void main(String[] args) {
        int a=50, b=-10, c=-100;
        System.out.println(""+a+", "+b+", "+c);
        if(a>b && b>c){
            System.out.println(c+" is lowest value");
        }
        else if(a<b && b<c){
            System.out.println(a+" is lowest value");
        }
        else{
            System.out.println(b+" is lowest value");
        }
    }
}
