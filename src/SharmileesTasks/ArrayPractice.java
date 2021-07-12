import javax.swing.*;

public class ArrayPractice {
    public static void main(String[] args) {
        int greatestIndex = 0;
        int[] a = new int[6];
        a[0] = 20;
        a[1] = 52;
        a[2] = 66;
        a[3] = 56;
        a[4] = 28;
        a[5] = 20;
        System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4] + " " + a[5] + " ");
        for (int i = 0; i < 5; i++) {

            if (a[i] > a[i + 1]) {
                greatestIndex = i;
            } else {
                greatestIndex = i + 1;
            }

        }
        System.out.println("Greatest number is: " + a[greatestIndex]);
        String[] name = {"Vivek", "Kiyaan", "Sharmilee"};
        System.out.println("Salgaonkar family living in the UK: " + name[0] + ", " + name[1] + ", " + name[2]);
        int b[][] = {{1, 2, 7}, {3, 4, 8}, {5, 6, 9}, {7, 8, 6}};
        for (int i = 0; i < b.length; i++ ) {
            for (int j=0; j<3; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}

