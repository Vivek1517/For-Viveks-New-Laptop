public class Exercise2 {
    public static void main(String[] args) {
        double average = 0;
        int value[]= {23, 6, 47, 35, 2, 14};
        double sum=0;
        for(int i=0; i< value.length; i++){
            sum =value[i]+sum;
                  }
        average=sum/6;
        System.out.println(sum);
        System.out.println("Average value of the above figure is: "+average);
    }
}
