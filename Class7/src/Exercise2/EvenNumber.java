package Exercise2;

public class EvenNumber {
    public void even(){
        int n=1;
        while(n<=100){
            int even=n%2;

            if(even==0){
                System.out.print(n+" ");
            }
n++;
        }

    }

    public static void main(String[] args) {
        EvenNumber newNumber= new EvenNumber();
        newNumber.even();
    }
}
