package ForLoop;

public class TriangleShapeStars {
    // printing 1 to 100 without using loop
   /* public static void printNum(int num){
        if(num<=100){
        System.out.print(num+" ");
        num++;
        printNum(num);
        }
    }*/
    // printing 1 to 100 without using loop
    public static void printNum(int startNum, int endNum){
        if(startNum<=endNum){
            System.out.print(startNum+" ");
            startNum++;
            printNum(startNum, endNum);
        }
    }
    public static void main(String[] args) {
       /* printNum(1, 100);
        System.out.println();
        for(int i = 0; i<=5; i ++ ){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k = 0; k<=4; k++){
            for(int m = 4; m>=k; m--){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*for(int i = 1; i<=10; i=i+2){
            System.out.println(i);
        }*/

       /* int sum = 0;
        for(int i= 1; i<=10; i++){
            sum = i+sum;
            }
        System.out.println(sum);*/

        for(int i= 1; i<=10; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("---------------------");
        for(int i= 10; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
