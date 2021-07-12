package Package1;

public class Class2 {
    int age= 40;
    char gender= 'F';
    String name="Vivek";
    double yearlyWifesIncome= 120000.987;
    byte salary=0;
    short child =1;
    float height=6.1f;
    long numberOfKids=251123;
    boolean male=true;

    public String getGender(){
        if(gender=='F'){
            return "Female";

        }
        else{
            return "Male";
        }
    }


    public static void main(String[] args) {
        Class2 printValue= new Class2();

        System.out.println("My Name is "+printValue.name);
        System.out.println("I'm "+printValue.age+" years old");
        System.out.println("My Height is "+printValue.height);
        System.out.println("My gender is "+printValue.getGender());
        System.out.println("I have "+printValue.child+" Child");
        System.out.println("My Salary is "+printValue.salary);
        System.out.println("My wifes salary is "+printValue.yearlyWifesIncome);
        System.out.println("I would like to have "+printValue.numberOfKids+" kids");
        System.out.println("I'm a man & it is "+printValue.male);
    }
}
