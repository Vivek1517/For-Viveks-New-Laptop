package Loop;

public class ForLoop {
    public void practice(){

        for(int i=1; i<=100; i++){
           if(i%2!=0)
            System.out.println(i+" Is not an even Number ");
        }
    }

    public static void main(String[] args) {
        ForLoop newObj= new ForLoop();
        newObj.practice();
    }
}
