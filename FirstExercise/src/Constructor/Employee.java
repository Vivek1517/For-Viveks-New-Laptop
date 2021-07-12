package Constructor;

public class Employee {
    String employeeName;
    int employeeNumber;
    long salary;
    String jobTitle;
    String companyName;
    int companyNumber;
    long companyTaxCode;
    String companyAddress;
    String ownersName;

    Employee(String employeeName, int employeeNumber, long salary, String jobTitle){
        this.employeeName=employeeName;
        this.employeeNumber=employeeNumber;
        this.salary=salary;
        this.jobTitle=jobTitle;
    }
    public void printEmployeeDetails(){
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employees Contact Number: "+employeeNumber);
        System.out.println("Salary of the Employee: "+"$"+salary);
        System.out.println("Designation: "+jobTitle);
        System.out.println(" ");
    }
    Employee(String companyName, int companyNumber, long companyTaxCode, String companyAddress, String ownersName){
        this.companyAddress=companyAddress;
        this.companyName=companyName;
        this.companyTaxCode=companyTaxCode;
        this.companyNumber=companyNumber;
        this.ownersName=ownersName;
    }
    public void printCompanyDetails() {
        System.out.println("Printing Company Info");
        System.out.println("Company Name: " + companyName);
        System.out.println("Contact Number: " + companyNumber);
        System.out.println("Tax Code: " + companyTaxCode);
        System.out.println("Company Address: " + companyAddress);
        System.out.println("Owners Name: " + ownersName);
    }

    public static void main(String[] args) {
        Employee employeeDetails= new Employee("Vivek", 123456, 7000, "QA Engineer");
        Employee companyDetails= new Employee("IBM", 23456, 999, "London","Kiyaan");
        employeeDetails.printEmployeeDetails();
        companyDetails.printCompanyDetails();
    }
}
