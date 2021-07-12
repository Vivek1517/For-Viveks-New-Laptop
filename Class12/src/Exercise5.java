public class Exercise5 {
    public static void main(String[] args) {
        int value[]={10, 20, 40, 50, 60, 70, 80, 90, 100};
        int sum=0;
        for(int i=0; i<value.length; i++){
            sum=value[i]+sum;
        }
        System.out.println(sum);
    }
}
