public class Exercise1 {
    private int employeeID;
    private int employeeAge;
    private String employeeName;
    private String employeeContactNumber;

    public int getemployeeID(){
        return employeeID;
    }
    public int getemployeeAge(){
        return employeeAge;
    }
    public String getemployeeName(){
        return employeeName;
    }
    public String getemployeeContactNumber(){
        return employeeContactNumber;
    }

    public void setemployeeid(int id){
        employeeID=id;
    }
    public void setemployeeName(String name){
        employeeName=name;
    }
    public void setemployeeAge(int age){
        employeeAge=age;
    }
    public void setemployeeContactNumber(String number){
        employeeContactNumber=number;
    }
}
