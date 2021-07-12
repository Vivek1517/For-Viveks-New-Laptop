package Encapsulation;

public class Employee {
    private String employeeName, employeeAddress, employeeNextToKin;
    private int employeeSalary, employeeNumber;

    public String getEmployeeName(){
        return employeeName;
    }
    public String getEmployeeAddress(){
        return employeeAddress;
    }
    public String getEmployeeNextToKin(){
        return employeeNextToKin;
    }
    public int getEmployeeSalary(){
        return employeeSalary;
    }
    public int getEmployeeNumber(){
        return employeeNumber;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }
    public void setEmployeeAddress(String employeeAddress){
        this.employeeAddress = employeeAddress;
    }
    public void setEmployeeNextToKin(String employeeNextToKin){
        this.employeeNextToKin = employeeNextToKin;
    }
    public void setEmployeeSalary(int employeeSalary){
        this.employeeSalary = employeeSalary;
    }
    public void setEmployeeNumber(int employeeNumber){
        this.employeeNumber = employeeNumber;
    }
}
