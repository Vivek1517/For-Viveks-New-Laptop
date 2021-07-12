package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeArrayList5 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Lamborghini");
        cars.add("Rollsroyce");
        cars.add("Rangerover");
        cars.add("AstonMartin");
        cars.add("Bentley");
        //System.out.println(cars);
        cars.set(0,"Luxurious Lamborghini");
        //System.out.println("After replacing Lamborghini "+cars);
        Collections.sort(cars);
        //System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.get(4));

        for(String i: cars){
            System.out.println(i);
        }
    }
}
