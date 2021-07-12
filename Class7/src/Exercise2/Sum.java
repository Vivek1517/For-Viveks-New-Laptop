package Exercise2;

public class Sum {

    public void sum() {
        int sum=0;

        for (int n = 0; n <= 50; n++) {

            sum = n + sum;

        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        Sum newObj= new Sum();
        newObj.sum();


    }
}
