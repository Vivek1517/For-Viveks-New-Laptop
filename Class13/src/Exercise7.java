import java.util.ArrayList;
import java.util.Collections;

public class Exercise7 {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<String>();
        names.add("Maddox");
        names.add("Alex");
        names.add("Jax");
        names.add("Kiyaan");
        names.add("Sharmilee");
        Collections.sort(names);
        System.out.println("Printing names ending with x:");
        for (int i=0; i< names.size(); i++){
            if(names.get(i).endsWith("x")){
                System.out.println(names.get(i));
            }
        }
    }
}
