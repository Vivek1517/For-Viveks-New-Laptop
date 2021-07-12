package ArrayList;



import java.util.ArrayList;
import java.util.Collections;

public class PracticeMix {
    public static void main(String[] args) {
       /* ArrayList<String> list = new ArrayList<String>();
        list.add("v");
        list.add("s");
        list.add("k");
        System.out.println(list);
       // System.out.println(list.get(2));
        list.add("f");
        Collections.sort(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
        /*ArrayList<String> list = new ArrayList<String>();
        list.add("Kiyaan");
        list.add("Syu");
        list.add("Kuhu");
        list.add("Shambhavi");
        System.out.println(list.size());
        for (int i = 0; i< list.size(); i++){
            System.out.println(i+" "+ list.get(i));

        }*/
       /* ArrayList<String> namesWithX = new ArrayList<String>();
        namesWithX.add("XKiyaanx");
        namesWithX.add("XSyux");
        namesWithX.add("Kuhux");
        namesWithX.add("XShambhavix");
        Collections.sort(namesWithX);
        System.out.println(namesWithX);;
        for(String names:namesWithX){
            System.out.println(names);
            //System.out.println(names.startsWith("X"));
        }*/
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(23);
        numbers.add(3);
        numbers.add(9);
        numbers.add(17);
      //  boolean flag = true;
        for(int i =0; i<numbers.size(); i++){
           boolean flag = true;
            for(int j =2; j< numbers.get(i)-1; j++) {
                if (numbers.get(i) % j == 0) {

                    flag = false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(numbers.get(i));

        }

        }


    }
}

