package Encapsulation;

public class SetEmployee {
    public static void main(String[] args) {
        Practice employeeRecord= new Practice();
        Practice employeeRecord1= new Practice();
        employeeRecord.setEmployeeName("Mr Vivek K Salgaonkar");
        employeeRecord.setAge(41);
        employeeRecord.setGender('M');
        employeeRecord.setSalary(7000);
        employeeRecord.setContactNumber(01234567);
        employeeRecord1.setEmployeeName("Sharmilee V Salgaonkar");
        employeeRecord1.setAge(34);
        employeeRecord1.setGender('F');
        employeeRecord1.setSalary(8500);
        employeeRecord1.setContactNumber(759861);
        System.out.println("Employees Name: "+employeeRecord.getEmployeeName());
        System.out.println("Employees Age: "+employeeRecord.getAge());
        System.out.println("Employees Gender: "+employeeRecord.getGender());
        System.out.println("Employees Salary: $"+employeeRecord.getSalary());
        System.out.println("Employees Contact Number: " +employeeRecord.getContactNumber());
        System.out.println("Employee number 1410 Details");
        System.out.println("Employee Name: "+employeeRecord1.getEmployeeName());
        System.out.println("Employees Age: "+employeeRecord1.getAge());
        System.out.println("Employees Gender: "+employeeRecord1.getGender());
        System.out.println("Employees Salary: "+employeeRecord1.getSalary());
        System.out.println("Employees Contact Number: "+employeeRecord1.getContactNumber());
    }
}
