package ConditionalStatement;

public class PrintGrade {
    int gradeAUpperLimit=100;
    int gradeALowerLimit=90;
    int gradeBUpperLimit=89;
    int gradeBLowerLimit=70;
    int gradeCUpperLimit=69;
    int gradeCLowerLimit=37;
    int justPass = 36;
    public void result(int gradeResult){
        if(gradeResult<=gradeAUpperLimit && gradeResult>=gradeALowerLimit){
            System.out.println("You got grade A as you scored "+gradeResult);
        }
        else if(gradeResult<=gradeBUpperLimit && gradeResult>=gradeBLowerLimit){
            System.out.println("You got grade B as you scored "+gradeResult);
        }
        else if(gradeResult<=gradeCUpperLimit && gradeResult>=gradeCLowerLimit){
            System.out.println("You got grade C as you scored "+gradeResult);
        }
        else if(gradeResult==justPass){
            System.out.println("You have just managed to pass & you scored "+gradeResult);
        }
        else{
            System.out.println("You failed your exam try harder");
        }
    }

    public static void main(String[] args) {
        PrintGrade printGrades= new PrintGrade();
        printGrades.result(35);
        printGrades.result(95);
        printGrades.result(85);
        printGrades.result(37);
        printGrades.result(36);
    }
}
