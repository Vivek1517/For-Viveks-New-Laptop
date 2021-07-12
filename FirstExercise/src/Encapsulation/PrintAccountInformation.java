package Encapsulation;

public class PrintAccountInformation {
    public static void main(String[] args) {
        AccountHolder printDetails= new AccountHolder();
        printDetails.setName("Vivek");
        printDetails.setAccountNumber(1234);
        printDetails.setContactNumber(12345678);
        printDetails.setBranch("Cholsey");
        printDetails.setSecurityNumber(1);
        System.out.println("Name of the account Holder: "+printDetails.getName());
        System.out.println("Account number: "+printDetails.getAccountNumber());
        System.out.println("Contact number: "+printDetails.getContactNumber());
        System.out.println("Bank Branch: "+printDetails.getBranch());
        System.out.println("Security number: "+printDetails.getSecurityNumber());

    }

}
