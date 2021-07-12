package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PracticeArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(24);
        numbers.add(51);
        numbers.add(53);
        numbers.add(19);
        numbers.add(21);
        numbers.add(9);
        System.out.println(numbers);
       Iterator itr = numbers.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
       Collections.sort(numbers);
        System.out.println("Getting highest value "+Collections.max(numbers));
        System.out.println(numbers.contains(24));
    }

    }



