package ForLoop;

public class Prime4 {
    public boolean isPrimeNumber(int n){
        boolean flag=true;
        for(int i=2; i<n; i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        Prime4 obj = new Prime4();
        for(int j=2; j<=100; j++){
            if(obj.isPrimeNumber(j)==true){
                System.out.println(j);
            }
        }
    }
}
