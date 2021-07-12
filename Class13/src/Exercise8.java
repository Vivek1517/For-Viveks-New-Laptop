import java.util.ArrayList;

public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(101);
        numbers.add(102);
        numbers.add(104);
        numbers.add(150);
        numbers.add(199);
        numbers.add(0);
        numbers.add(290);
        System.out.println("Selecting even numbers from the list: "+numbers);
        for (int i=0; i<numbers.size(); i++){
            if(numbers.get(i)%2==0){
                System.out.println(numbers.get(i));
            }
            }

    }
}
