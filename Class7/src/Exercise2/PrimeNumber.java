package Exercise2;

public class PrimeNumber {
    //returns true if y is prime
    public boolean checkPrime(int y) {
        for(int i=2; i<y; i++){
            int prime=y%i;
            if(prime==0){
                return false;
            }
        }
return true;
    }

    public void printPrimeNumbers()
    {
        for(int i=1; i<=100; i++)
        {
            if(checkPrime(i) ) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        PrimeNumber objprime= new PrimeNumber();
        objprime.printPrimeNumbers();

    }
}