public class Exercise3 {
    public static void main(String[] args) {
        int highestNumber=0;
        int value[]= {23, 6, 47, 35, 2, 14};
        for(int i=0; i< value.length; i++){
            if(value[i]>highestNumber){
                highestNumber=value[i];
            }

        }
        System.out.println(highestNumber);
    }
}
