package CompanyDetails;

public class PrintOrganisation {
    public static void main(String[] args) {
        Organisation objOrganisation = new Organisation();
        objOrganisation.name = "GSR";
        objOrganisation.registerationNumber = 54552542;
        objOrganisation.email = "info@gsr.co.uk";
        System.out.println("Business Name: " + objOrganisation.name);
        System.out.println("Registeration Number: " + objOrganisation.registerationNumber);
        System.out.println("Contact email: " + objOrganisation.email);
        System.out.println("**************************************");
       //Person Below is an Engineer of the Organisation
        objOrganisation.objEngineer.firstName="Vivek";
        objOrganisation.objEngineer.lastName="Salgaonkar";
        objOrganisation.objEngineer.dob= "06/07/1979";
        objOrganisation.objEngineer.niNumber= 5465465;
        objOrganisation.objEngineer.isEngineer= true;
        //Person Below is a Responsible Person of the Organisation
        objOrganisation.objResponsiblePerson.firstName="Sharmilee";
        objOrganisation.objResponsiblePerson.lastName="Sharmilee";
        objOrganisation.objResponsiblePerson.dob="14/10/1986";
        objOrganisation.objResponsiblePerson.niNumber=546463;
        objOrganisation.objResponsiblePerson.isResponsiblePerson=true;
        //Printing Engineers Details First
        System.out.println("Engineer Name: "+objOrganisation.objEngineer.firstName + " " +objOrganisation.objEngineer.lastName);
        System.out.println("D.O.B: "+objOrganisation.objEngineer.dob);
        System.out.println("NI Number: "+objOrganisation.objEngineer.niNumber);
        System.out.println("Is Engineer: "+objOrganisation.objEngineer.isEngineer);
        System.out.println("**************************************");
        //Printing Responsible Person Details
        System.out.println("Responsible Persons Name: "+objOrganisation.objResponsiblePerson.firstName+objOrganisation.objResponsiblePerson.lastName);
        System.out.println("D.O.B: "+objOrganisation.objResponsiblePerson.dob);
        System.out.println("NI Number: "+objOrganisation.objResponsiblePerson.niNumber);
        System.out.println("Responsible Person: "+objOrganisation.objResponsiblePerson.isResponsiblePerson);
    }
}
