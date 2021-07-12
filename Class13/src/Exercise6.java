import java.util.ArrayList;
import java.util.Collections;

public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<String>();
        names.add("Xavier");
        names.add("Xerxes");
        names.add("Xzavian");
        names.add("Xayne");
        names.add("Vivek");
        names.add("Kiyaan");
        names.add("Sharmilee");
        Collections.sort(names);
        System.out.println("List of names starting with 'X': ");
        for(int i=0; i<names.size(); i++){
            if(names.get(i).startsWith("X")){
                System.out.println(names.get(i));
            }
        }

    }
}
