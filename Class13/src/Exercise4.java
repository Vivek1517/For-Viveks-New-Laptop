import java.util.ArrayList;
import java.util.Collections;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<Integer> maximum= new ArrayList<Integer>();
        maximum.add(20);
        maximum.add(30);
        maximum.add(40);
        maximum.add(50);
        maximum.add(60);

        for (int i=0; i< maximum.size(); i++){
            System.out.println("Values in the array list are: "+maximum.get(i));
        }
        System.out.println("The greatest value is: "+Collections.max(maximum));
        System.out.println("The lowest value is: "+Collections.min(maximum));
    }

}
