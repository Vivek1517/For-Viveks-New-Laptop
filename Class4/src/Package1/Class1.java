package Package1;

public class Class1 {

    private int accessFromPakage = 0;
    private void addition(){
       int a= 200, b= 500;
         int result= a+b;
        System.out.println(result);
    }
    void multiplication(){
        int a=650, b=550;
        int result =a*b;
        System.out.println(result);
            }

            public void division(){
        int a=5, b=20;
        int result=b/a;
                System.out.println(result);
            }

    public static void main(String[] args) {
        Class1 addition= new Class1();
        addition.addition();
    }
}
