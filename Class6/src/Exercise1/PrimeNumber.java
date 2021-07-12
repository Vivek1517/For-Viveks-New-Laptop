package Exercise1;

public class PrimeNumber {
    public void number(int n){
        if(n%2==0 || n%3==0 || n%5==0 || n%7==0 ){
            System.out.println(n+" Is not prime number");

        }
        else{
            System.out.println(n+" Is a prime number");
        }
    }

    public static void main(String[] args) {
        PrimeNumber newPrime= new PrimeNumber();
        newPrime.number(5);
    }
}
