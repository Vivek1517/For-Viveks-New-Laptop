package Exercise2;

import java.util.concurrent.locks.Condition;

public class ConditionalStatements {
    public void less(int a, int b) {
                if (a < b) {
            System.out.println("Value of A is "+a+" Value of B is "+b+" So A is less than B");
        }
                else{
                    System.out.println("Value of A is "+a+" Value of B is "+b+" So A is greater than B");}

    }

        public void lessEqual(int a, int b){
        if (a<=b){
            System.out.println("Value of A is "+a+" Value of B is "+b+" So A is less or equal to B");

        }
        else{

            System.out.println("Value of A is "+a+" Value of B is "+b+" So A is not less than or equal to B");
        }
    }
public void greater(int a, int b) {
    if (a > b) {
        System.out.println("Value of A is "+a+" Value of B is "+b+" So A is greater than B");
    } else {
        System.out.println("Value of A is "+a+" Value of B is "+b+" So B is greater than A");
    }

}

    public static void main(String[] args) {
        ConditionalStatements condition= new ConditionalStatements();
        condition.less(43, 42);
        condition.lessEqual(39, 39);
        condition.greater(75, 85);

    }
}
