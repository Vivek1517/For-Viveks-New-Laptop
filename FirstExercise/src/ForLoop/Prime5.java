package ForLoop;

import java.util.Scanner;

public class Prime5 {
   public boolean isPrime(int n){
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
       Prime5 obj = new Prime5();
        for(int j=2; j<=100; j++){
            if(obj.isPrime(j)==true){
                System.out.println(j);
            }
        }
    }
}
