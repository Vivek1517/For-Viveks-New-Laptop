import java.util.ArrayList;
import java.util.Collections;

public class Exercise5 {
    public static void main(String[] args) {
        ArrayList<Integer> minimum= new ArrayList<Integer>();
        minimum.add(-0);
        minimum.add(-10);
        minimum.add(-100);
        minimum.add(1);
        for (int i=0; i<minimum.size(); i++){
            System.out.println("Giving you lowest number from the list: "+minimum.get(i));
        }
        System.out.println("The lowest number is: "+ Collections.min(minimum));
    }
}
