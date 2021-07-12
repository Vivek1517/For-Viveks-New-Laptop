package Array;

public class Practice1 {
    public static void main(String[] args) {
//        int[] numbers= {2,4,6,19,21,27};
//        for (int i=0; i< numbers.length; i++){
//            if(numbers[i]%2==0){
//            System.out.println(numbers[i]);
//            }
//        }

//        int[] number={3,6,9,19,31};
//        int sum = 0;
//        for(int i=0; i< number.length; i++){
//            System.out.println(number[i]);
//            sum= number[i]+sum;
//        }
//        System.out.println("Sum of the above number is: "+sum);
//        System.out.println("Average taken from the sum: "+sum/ number.length);

        int[] number1 = {3,6,9,19,31};
        int lowestNumber=5;
        for(int i=0; i<number1.length; i++){
            System.out.println(number1[i]);
            if(number1[i]<lowestNumber){
                lowestNumber=number1[i];
            }
        }
        System.out.println("Printing lowest number from the list above: "+lowestNumber);
    }
}