package ArrayList;

import java.util.ArrayList;

public class PracticeArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(20);
        numbers.add(31);
        numbers.add(49);
        numbers.add(33);
        numbers.add(50);
        System.out.println("Printing numbers from the list");
        for(int n:numbers){
            System.out.println(n);
        }
        System.out.println("Printing odd numbers from the above list");
        for(int n1:numbers){
            if(n1%2!=0){
                System.out.println(n1);
            }
        }
    }
}
