public class EmployeeDetails {
    private int age;
    private int employeeId;
    private String employeeName;
    private int employeeSalary;

    public int getAge(){
        return age;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public int getEmployeeSalary(){
        return employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setEmployeeId(int id){
        this.employeeId=id;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
