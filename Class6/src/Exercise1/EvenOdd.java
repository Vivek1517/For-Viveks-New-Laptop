package Exercise1;

public class EvenOdd {
    public void even(int x){
        if (x%2==0){
            System.out.println(x+" Is the even number");
        }
        else{
            System.out.println(x+" Is the odd number");
        }
    }

    public static void main(String[] args) {
        EvenOdd newValue= new EvenOdd();
        newValue.even(100);
    }
}
