package Constructor;

public class PracticeEmployee {
    String employeeName;
    String employeeLastName;
    int mobileNumber;
    String nextOfKin;
    public PracticeEmployee(String employeeName, String employeeLastName, int mobileNumber, String nextOfKin){
        this.employeeLastName=employeeLastName;
        this.employeeName=employeeName;
        this.mobileNumber=mobileNumber;
        this.nextOfKin=nextOfKin;
    }
    public void printEmployeeDetails(){
        System.out.println(employeeName);
        System.out.println(employeeLastName);
        System.out.println(mobileNumber);
        System.out.println(nextOfKin);
    }

    public static void main(String[] args) {
        PracticeEmployee getDetails = new PracticeEmployee("Vivek","Salgaonkar",795765367,"Milee");
        getDetails.printEmployeeDetails();
    }
}
