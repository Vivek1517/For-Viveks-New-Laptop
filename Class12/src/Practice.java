public class Practice {
    public static void main(String[] args) {
        int[] num={1,20,30,40,50,60,70,80,90,100};
        System.out.println("Printing index values in Arrays");
        for(int i=0; i< num.length; i++){
        System.out.println(num[i]);
        }
        int[] num1={23,6,47,35,2,14};
        float sum=0;
        float average;
        System.out.println("Printing index values in Array");
        for(int i=0; i< num1.length; i++){
        System.out.println(num1[i]);
        sum=num[i]+sum;
        }
        average=sum/ num1.length;
        System.out.println("Adding all the numers to: "+sum);
        System.out.println("Average value of the Array: "+average);

        int[] num2={23,6,47,35,2,14};
        System.out.println("Printing index values in Array to get the lowest number");
        int lowestNumber=3;
        for(int i=0; i<num2.length; i++){
            System.out.println(num2[i]);
            if (num2[i]<lowestNumber){
                lowestNumber=num2[i];
            }

        }
        System.out.println("Lowest number in Array: "+lowestNumber);
        int[] num3={1,3,5,7,8,10,12,14,15,19};
        int oddNumber=0;
        for(int i=0; i<num3.length; i++){
            if(num3[i]%2!=0){
             oddNumber=num3[i];
            System.out.println(oddNumber);
            }
        }
    int[] num4={1,3,5,7,8,10,12,14,15,19};
    int sum1=0;
    for(int i=0; i<num4.length; i++){
        sum1=num4[i]+sum1;
    }
    double average1=sum1/num4.length;
        System.out.println(sum1);
        System.out.println(average1);
    }


}
