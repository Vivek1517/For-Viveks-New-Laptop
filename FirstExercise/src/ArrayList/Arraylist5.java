package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(9);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1000);
//        Collections.sort(list);
//        System.out.println("Getting the highest number from the above list: "+Collections.max(list));
        for(int i=0; i<list.size(); i++){
            if(list.get(i)%2==0){
                System.out.println(list.get(i));
            }

        }

    }




}
