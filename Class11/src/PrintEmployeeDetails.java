public class PrintEmployeeDetails {
    public static void main(String[] args) {
        EmployeeDetails e= new EmployeeDetails();
        EmployeeDetails e1= new EmployeeDetails();
        e.setEmployeeName("Vivek");
        e.setAge(41);
        e.setEmployeeId(8678);
        e.setEmployeeSalary(5000);
        System.out.println("Employees Name: "+e.getEmployeeName());
        System.out.println("Employees Age: "+e.getAge());
        System.out.println("Employees Company Id: "+e.getEmployeeId());
        System.out.println("Employees Salary: "+e.getEmployeeSalary());
        e1.setEmployeeName("Archana");
        System.out.println("Employee Name: "+e1.getEmployeeName());

    }
}
