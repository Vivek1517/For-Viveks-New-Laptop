import java.util.Scanner;

public class Grades {
    public void grades (int grades) {
        if (grades>=90){
            System.out.println("Congratulations you scored Grade A");
        }
        else{
            if (grades>=70 && grades<=89){
                System.out.println("Good job you have scored Grade B");}
                if (grades>=37 && grades<=69){
                    System.out.println("You have scored Grade C");}
                    if (grades==36){
                        System.out.println("You have Just Passes");}
                        if (grades<36){
                            System.out.println("You Failed your exam");}
                        }
                    }


    public static void main(String[] args) {
        Grades grades=new Grades();
        Scanner grade= new Scanner(System.in);
        System.out.println("Enter your marks to give you a Grade:");
        int grad= grade.nextInt();
        grades.grades(grad);
    }
}
