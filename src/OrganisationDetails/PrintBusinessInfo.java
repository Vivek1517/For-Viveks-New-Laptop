package OrganisationDetails;

public class PrintBusinessInfo {
    public static void main(String[] args) {
        BusinessInformation objBusiness= new BusinessInformation();
        objBusiness.name= "Kool Fabs";
        objBusiness.location= "Cholsey";
        objBusiness.contactNumber= "0149782206";
        objBusiness.businessID= 4343;
        objBusiness.revenueTurnover= 70.50;
        System.out.println("Business Name: "+objBusiness.name);
        System.out.println("Business Location: "+objBusiness.location);
        System.out.println("Contact Number: "+objBusiness.contactNumber);
        System.out.println("Business ID: "+objBusiness.businessID);
        System.out.println("Yearly Turnover: "+objBusiness.revenueTurnover+ "Billion");
        //adding managers info
        objBusiness.objManager.firstName="Vivek";
        objBusiness.objManager.lastName="Salgaonkar";
        objBusiness.objManager.contactNumber="07957653672";
        objBusiness.objManager.employeeID=4546;
        objBusiness.objManager.salary=5000d;
        objBusiness.objManager.isManager=true;
        //printing managers info
        System.out.println("**********************************");
        System.out.println("Employee Details");
        System.out.println("--------------------------------------------------------------------");
        System.out.print("Employee Name       | ");
        System.out.print("Contact Number| ");
        System.out.print("Employee ID| ");
        System.out.print("Salary| ");
        System.out.println("Is Manager| ");
        System.out.print(objBusiness.objManager.firstName+" "+objBusiness.objManager.lastName+"    |");
        System.out.print(objBusiness.objManager.contactNumber+"    |");
        System.out.print(objBusiness.objManager.employeeID+"        |");
        System.out.print(objBusiness.objManager.salary+" |");
        System.out.print(objBusiness.objManager.isManager+"       |");
        //adding staff info
        objBusiness.objStaff.firstName="Sharmilee";
        objBusiness.objStaff.lastName="Salgaonkar";
        objBusiness.objStaff.contactNumber="07552216175";
        objBusiness.objStaff.employeeID=4545;
        objBusiness.objStaff.salary=6000d;
        objBusiness.objStaff.isStaff=false;
        System.out.println("");

        //printing staff info
        System.out.print(objBusiness.objStaff.firstName+" "+objBusiness.objStaff.lastName+"|");
        System.out.print(objBusiness.objStaff.contactNumber+"    |");
        System.out.print(objBusiness.objStaff.employeeID+"        |");
        System.out.print(objBusiness.objStaff.salary+" |");
        System.out.print(objBusiness.objStaff.isStaff+"      |");

    }
}
