package Exercise1;

public class MaximumValue {
    public void maxValue(int a, int b, int c){
        if (a>b && a>c){
            System.out.println(a+" Is the greatest Value");
        }
        else {
            if(b>a && b>c){
                System.out.println(b+" Is the greatest Value");
            }
            else{
                System.out.println(c+" Is the greatest Value");
            }
        }
    }

    public static void main(String[] args) {
        MaximumValue newValue= new MaximumValue();
        newValue.maxValue(5, 5, 5);
    }
}
