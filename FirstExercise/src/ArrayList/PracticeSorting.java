package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeSorting {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(87);
        numbers.add(73);
        numbers.add(98);
        numbers.add(701);
        numbers.add(890);
        numbers.add(580);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println("Printing minimum value number: "+Collections.min(numbers));
        System.out.println("Printing maximum value number: "+Collections.max(numbers));
    }


}
