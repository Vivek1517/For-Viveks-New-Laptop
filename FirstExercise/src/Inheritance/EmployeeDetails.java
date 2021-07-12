package Inheritance;

public class EmployeeDetails extends Employee{
    float salary;
    String companyBranch;
    EmployeeDetails(String name, int id, int contract, float salary, String companyBranch){
        super(name, id, contract);
        this.salary=salary;
        this.companyBranch=companyBranch;
    }
    public void display(){
        System.out.println("Employers name: "+name);
        System.out.println("Employers id: "+id);
        System.out.println("Employers Salary: "+"$"+salary);
        System.out.println("Employers Contract: "+contract+" months");
        System.out.println("Company Branch: "+companyBranch);
        System.out.println("Company Name: "+super.companyName);
        super.nextOfKin("Sharmilee");
    }

    public static void main(String[] args) {
        EmployeeDetails print= new EmployeeDetails("Vivek", 1510, 12, 7000, "Cholsey");
        print.display();
    }
}
