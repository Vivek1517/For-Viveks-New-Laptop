package ForLoop;

public class PrimeNumber3 {
    public boolean isPrimeNumber(int n){
        boolean flag=true;
        for(int j=2; j<n; j++){
            if(n%j==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        PrimeNumber3 obj= new PrimeNumber3();
        for(int i=2; i<=100; i++){
            if(obj.isPrimeNumber(i)==true)
            System.out.println(i);
        }

    }
}

