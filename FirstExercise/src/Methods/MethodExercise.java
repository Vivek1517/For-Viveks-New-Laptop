package Methods;

public class MethodExercise {

    void addCalc(){
        int m=10, n=20;
        int result= m+n;
        System.out.println("Addition of "+m+" & "+n+" is "+result);
    }
    public void division(double x, double y){
        double divisionResult= x/y;
        System.out.println("Divison of "+x+" & "+y+" :"+divisionResult);
    }

    public static float salaryCalculation(float p, float q){
        float r= 30*(p*q);
        return r;

    }

    public static void main(String[] args) {
        MethodExercise m= new MethodExercise();
        m.addCalc();
        m.division(95, 20);
        System.out.println("Salary of a particular employee is "+salaryCalculation(8, 6));

    }
}
