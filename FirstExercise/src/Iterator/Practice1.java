package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Papa");
        name.add("Aiee");
        name.add("Bhaiee");
        name.add("Bhau");
        name.add("Sanjay");
        name.add("Vicky");
        name.add("Fenil");
        name.add("Syu");
        name.add("Shambi");
        name.add("Kuhu");
        name.add("Sharmilee");
        name.add("Kiyaan");

        Iterator<String> getName = name.iterator();
        String get1stName = getName.next();
        String get2ndName = getName.next();
        System.out.println(get1stName+" "+get2ndName);
        while(getName.hasNext()){
            String i = getName.next();
            if(i.equalsIgnoreCase("Aiee")){
                System.out.println(i);
                break;
            }
            else{
                System.out.println("Name not found");
            }

        }

    }

}
