package Encapsulation;

public class Practice {
    private String employeeName;
    private int salary;
    private int age;
    private char gender;
    private long contactNumber;

    public String getEmployeeName(){

        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName=employeeName;
    }
    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public long getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(long contactNumber){
        this.contactNumber= contactNumber;
    }
}
