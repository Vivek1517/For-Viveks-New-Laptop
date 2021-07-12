package ArrayList;

import java.util.ArrayList;

public class PracticeArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<String>();
    names.add("Xena");
    names.add("Xitalaly");
    names.add("Xyla");
    names.add("Vickyx");
    names.add("Kiyaanx");
    names.add("Sharmileex");
    for(String n1:names){
        System.out.println(n1);
    }
        System.out.println("Printing names ending with letter 'X'");
    for(String n1:names){
               if(n1.endsWith("x")){
            System.out.println(n1);
        }

    }
    }

}
