package Array;

public class PracticeArray {
    public static void main(String[] args) {
        System.out.println("Printing index values in Array");
        int[] numbers={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for(int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("Printing index value of an array & returning average value");
        int[] numbers1={23, 6, 47, 35, 2, 14};
        float sum=0;
        for(int i=0; i< numbers1.length; i++){
            System.out.println(numbers1[i]);
            sum=numbers1[i]+sum;
        }
        float average=sum/ numbers1.length;
        System.out.println("Sum of the above numnber is "+sum+" & the average is: "+average);
        System.out.println(" ");
        System.out.println("Printing index values of an array & returning the highest number");
        int[] numbers2={23, 6, 47, 35, 2, 14};
        int highestNumber=0;
        for(int i=0; i<numbers2.length; i++){
            System.out.println(numbers2[i]);
            if(numbers2[i]>highestNumber){
                highestNumber=numbers2[i];
            }
        }
        System.out.println("Printing highest value number from the above list: "+highestNumber);
        System.out.println(" ");

        System.out.println("Printing just odd numbers from the below list");
        int[] number3={1, 3, 5, 7, 9, 12, 14, 16, 18, 20};
        int oddNumber=0;
        for(int i=0; i<number3.length; i++){

                    if(number3[i]%2!=0){
                        oddNumber=number3[i];
                System.out.println(oddNumber);
            }
        }
    }
}
