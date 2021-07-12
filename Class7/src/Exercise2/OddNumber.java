package Exercise2;

public class OddNumber {
    public void odd(){
        int n=1;
        while(n<=100){
            int odd=n%2;
            if(odd!=0){
                System.out.print(n+" ");

            }
            n++;
        }
    }


    public static void main(String[] args) {
        OddNumber neNum= new OddNumber();
        neNum.odd();
    }
}
