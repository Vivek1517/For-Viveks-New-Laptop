import java.util.ArrayList;

public class Exercise10 {
    public static void main(String[] args) {
        ArrayList<Integer> value= new ArrayList<Integer>();
        value.add(11);
        value.add(13);
        value.add(15);
        value.add(2);
        value.add(3);
        value.add(9);
      for(int i=0; i<value.size(); i++){
          boolean isPrime=true;
          for(int j=2; j<value.get(i)-1; j++){
              if(value.get(i)%j==0){
                  isPrime =false;
              }
          }
          if(isPrime){
              System.out.println(value.get(i));}
      }


      }

    }

