public class EmployeeInformation {
    public static void main(String[] args) {
        Exercise1 employeeDetails= new Exercise1();
employeeDetails.setemployeeName("Sharmilee");
employeeDetails.setemployeeAge(34);
employeeDetails.setemployeeid(786);
employeeDetails.setemployeeContactNumber("07957653672");
        System.out.println("Employees name: "+employeeDetails.getemployeeName());
        System.out.println("Employees age: "+employeeDetails.getemployeeAge());
        System.out.println("Employees id: "+employeeDetails.getemployeeID() );
        System.out.println("Employees contact number: "+employeeDetails.getemployeeContactNumber());

    }
}
