package Array;

public class MaxArray {
    public static void main(String[] args) {
        int a[][]= {{2,3,4},{5,15,7},{8,-9,6}};
        int max = 10;
        for(int i=0; i<3; i++){

            for(int j=0; j<3; j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
