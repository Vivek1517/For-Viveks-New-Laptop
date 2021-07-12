import java.util.ArrayList;
import java.util.Iterator;

public class Excercise1 {
    public static void main(String[] args) {
        ArrayList<String> family= new ArrayList<String>();
        family.add("Papa");
        family.add("Aiee");
        family.add("Bhaiee");
        family.add("Ganesh");
        family.add("Sanjay");
        family.add("Syuna");
        family.add("Shambhavi");
        family.add("Anaisha");
        family.add("Kiyaan");
        family.add("Fenil");
        family.add("Sharmilee");
        System.out.println("Size of the list is: "+family.size());
        for(int i=0; i<family.size(); i++){
            System.out.println(family.get(i));
        }
        family.add(5,"Vivek");
        family.add(12, "Baba");
        System.out.println("After adding new value at index 5 & 12");
        for (int i=0; i<family.size(); i++){
            System.out.println(family.get(i));
        }
        family.set(7, "Shamba");
        System.out.println("After replacing value at index 7");
        for (int i=0; i< family.size(); i++){
            System.out.println(family.get(i));
        }
        family.remove(5);
        for (int i=0; i<family.size(); i++){
            System.out.println(family.get(i));
        }
        System.out.println("Size of the List is: "+family.size());
    }
}
