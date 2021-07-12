package ArrayList;

import java.util.ArrayList;

public class PracticeArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(20);
        numbers.add(31);
        numbers.add(40);
        numbers.add(33);
        numbers.add(50);
        System.out.println("Printing values from the list");
        for(int n1:numbers){
            System.out.println(n1);
        }
        System.out.println("Printing even numbers from the above list");
        for(int n:numbers){
            if(n%2 == 0){
                System.out.println(n);
            }
        }
    }
}
