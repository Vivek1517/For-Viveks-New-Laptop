package Exercise2;

public class Grade {
    public void marks(int grade){
        if(grade>=90){
            System.out.println("Congratulations you have scored grade 'A' as you scored: "+grade);
                    }
        else{
            if(grade>=70 && grade<=89){
                System.out.println("Good job you have scored grade 'B' as you scored: "+grade);
            }
            if(grade>=37 && grade<=69){
                System.out.println("Welldone you have scored grade 'C' as you scored: "+grade);
            }
            if(grade==36){
                System.out.println("You have just managed to 'Pass' as you only scored: "+grade);
            }
            if(grade<36){
                System.out.println("Sorry you have 'Failed' your exam as you only socred: "+grade);
            }
        }
    }

    public static void main(String[] args) {
        Grade newM= new Grade();
        newM.marks(69);
    }
}
