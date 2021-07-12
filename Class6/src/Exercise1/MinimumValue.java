package Exercise1;

public class MinimumValue {
    public void min(int a, int b, int c){
        if(a<b && a<c ){
            System.out.println(a+" Is the lowest number");
        }
        else{
            if(b<a && b<c){
                System.out.println(b+" Is the lowest number");
            }
            else{
                System.out.println(c+" Is the lowest number");
            }
        }
    }

    public static void main(String[] args) {
        MinimumValue newNumber= new MinimumValue();
        newNumber.min(2, 3, 1);
    }
}
