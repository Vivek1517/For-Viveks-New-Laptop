import java.util.ArrayList;

public class Exercise9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(9);
        numbers.add(101);
        numbers.add(103);
        numbers.add(104);
        numbers.add(150);
        numbers.add(199);
        numbers.add(291);
        System.out.println("Giving you odd numbers from the list: "+numbers);
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i)%2!=0){
                System.out.println(numbers.get(i));
            }
        }
    }
}
