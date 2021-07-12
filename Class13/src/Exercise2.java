import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(159);
        numbers.add(101);
        numbers.add(301);
        numbers.add(59);
        numbers.add(-10);
        numbers.add(-100);
        Collections.sort(numbers);
        for (int i=0; i< numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        }
    }

