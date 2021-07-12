package PkgEmployee;

public class Print_EmployeeInformation {
    public static void main(String[] args) {
        Employee obj= new Employee();
        obj.firstName= "Sharmilee";
        obj.lastName= "Salgaonkar";
        obj.age= 33;
        obj.gender= 'f';
        obj.bankAccountNo= 1212152521245L;
        obj.permanent= true;
        obj.address.houseNo= 6;
        obj.address.streetName= "Ashfield Way";
        obj.address.postCode= "ox10 9fu";
        Employee objk= new Employee();
        objk.firstName= "Kiyaan";
        objk.lastName= "Salgaonkar";
        objk.age= 3;
        objk.gender= 'M';
        objk.bankAccountNo= 8764546546466L;
        objk.permanent= false;
        double tax= obj.salary/100*obj.afterTax;
        double salaryAfterTax= obj.salary-tax;
        System.out.println("Employees Full Name: " + obj.firstName +" " + obj.lastName);
        System.out.println("Age: "+ obj.age + " Years");
        System.out.println("Tax Payable: " + tax);
        System.out.println("Salary After Tax: "+ "$" +salaryAfterTax);
        System.out.println("Employee ID: "+ obj.employeeID);
        System.out.println("Gender: "+ obj.gender);
        System.out.println("Bank Account Number: "+ obj.bankAccountNo);
        System.out.println("Is Permanent: " +obj.permanent);
        System.out.println("Address: " +obj.address.houseNo + "," + obj.address.streetName + "," + obj.address.postCode);
System.out.println("*******************************************");
        System.out.println("Employees Full Name: " + objk.firstName +" " + objk.lastName);
        System.out.println("Age: "+ objk.age + " Years");
        System.out.println("Tax Payable: " + tax);
        System.out.println("Salary After Tax: "+ "$" +salaryAfterTax);
        System.out.println("Employee ID: "+ objk.employeeID);
        System.out.println("Gender: "+ objk.gender);
        System.out.println("Bank Account Number: "+ objk.bankAccountNo);
        System.out.println("Is Permanent: " +objk.permanent);


    }
}
