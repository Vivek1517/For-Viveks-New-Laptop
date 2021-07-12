package Encapsulation;

public class GetEmployeeDetails {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setEmployeeName("Vivek");
        employee1.setEmployeeAddress("06"+"\n"+"Ashfield Way"+"\n"+"Cholsey");
        employee1.setEmployeeNextToKin("Sharmilee");
        employee1.setEmployeeNumber(1234567890);
        employee1.setEmployeeSalary(60000);

        System.out.println("Employees name: "+employee1.getEmployeeName());
        System.out.println("Employees address: "+employee1.getEmployeeAddress());
        System.out.println("Employees Next to Kin: "+employee1.getEmployeeNextToKin());
        System.out.println("Employees contact Number: "+employee1.getEmployeeNumber());
        System.out.println("Employees salary: "+"$"+employee1.getEmployeeSalary());
    }

}
