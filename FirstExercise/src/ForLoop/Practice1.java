package ForLoop;

public class Practice1 {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            //System.out.println(i+" outer loop");
            for(int j=1; j<11-i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        int m=1;
        for(int k=0; k<=4; k++){

            for(int l=1; l<5-k; l++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println("");

        }
    }
}
