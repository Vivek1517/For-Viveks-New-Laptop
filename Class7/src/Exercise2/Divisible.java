package Exercise2;

public class Divisible {
    public void isDivisibleby5(){
        int d=0;
        for(int i=1; i<100; i++){
            d=i%5;
            if(d==0){
            System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        Divisible newDivision= new Divisible();
        newDivision.isDivisibleby5();

        }
    }


