package ArrayList;


import org.testng.annotations.BeforeClass;

import java.util.ArrayList;

public class PracticeArayList4 {
    PracticeArayList4 obj = new PracticeArayList4();


    public void tes() {
        System.out.println("");
    }

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Vivek");
        name.add("Kiyaan");
        name.add("Sharmilee");
        System.out.println(name);
        System.out.println(name.get(0) + " " + name.get(1) + " " + name.get(2));
        name.set(0, "Vicky");
        System.out.println(name);
        for (String i : name) {
            System.out.println(i.trim());
        }

    }
}

