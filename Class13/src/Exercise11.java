import java.util.ArrayList;

public class Exercise11 {
    public static void main(String[] args) {
       ArrayList<String> name= new ArrayList<String>();
       name.add("Sharmilee");
       name.add("Kiyaan");
       name.add("Vivek");
       for(int i=0; i<3; i++){
           System.out.println(name.get(i));
       }
    }


}
