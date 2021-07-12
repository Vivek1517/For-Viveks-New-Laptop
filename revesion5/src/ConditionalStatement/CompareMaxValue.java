package ConditionalStatement;

public class CompareMaxValue {
    public static void main(String[] args) {
        int a=150, b=110, c=80;
        System.out.println(" "+a+", "+b+", "+c);
        if(a>b && b>c){
            System.out.println(a+" is the greatest number");
        }
        else if(a<b && b<c){
            System.out.println(c+" is the greatest number");
        }
        else{
            System.out.println(b+" is the greatest number");
        }
    }
}
