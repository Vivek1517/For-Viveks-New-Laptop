package Exercise3;

public class Grades {
    public void marks(int a){
        if (a>=90){
            System.out.println("You have scored "+a+"% Congratulations you have got Grade A");
        }

        if (a>=70)
        {if (a<=89) {
            System.out.println("You have scored "+a+"%you scored Grade B");
        } }
        if (a>=37){
            if (a<=69){
                System.out.println("You have scored "+a+"% You could do better you have scored Grade C");
            }
        }
        if (a==36){
            System.out.println("You have scored "+a+"% Dont be so happy you have just passed");
        }
    if (a<36){
        System.out.println("You have scored "+a+"% you have failed");
    }
    }

    public static void main(String[] args) {
        Grades result= new Grades();
        result.marks(92);
        result.marks(35);
        result.marks(85);
        result.marks(65);
        result.marks(36);
    }

}
