package Exercise2;

import java.util.Scanner;

public class MultiplicationTables {


        public static void main(String[] args) {

            Scanner  newMultiply= new Scanner(System.in);
            System.out.println("Enter the number for multiplication");
           float num= newMultiply.nextFloat();
          float multi=0;
        for(int n=1; n<=10; n++){
            multi=num*n;
            System.out.println(num+" * "+n+"= "+multi);
        }
    }


    }

