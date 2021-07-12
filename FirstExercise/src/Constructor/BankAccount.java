package Constructor;

public class BankAccount {
    int accountNumber;
    String accountType;
    String postCode;
    String branch;
    int accountHolderContactNumber;
    String accountHolderAddress;
    int accountHolderAge;
    BankAccount(int account, String accountType, String postCode, String branch){
        this.accountNumber= account;
        this.accountType= accountType;
        this.postCode= postCode;
        this.branch= branch;
    }
    BankAccount(int accountHolderContactNumber, String accountHolderAddress, int accountHolderAge){
        this.accountHolderContactNumber=accountHolderContactNumber;
        this.accountHolderAddress=accountHolderAddress;
        this.accountHolderAge=accountHolderAge;
    }
    public void displayBankDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account type: "+accountType);
        System.out.println("Branch Post Code: "+postCode);
        System.out.println("Branch of the Bank: "+branch);
    }
    public void displayHolderInformaton(){
        System.out.println("Contact number for Account Holder: "+accountHolderContactNumber);
        System.out.println("Account holder address: "+accountHolderAddress);
        System.out.println("Age of the account holder: "+accountHolderAge);
    }

    public static void main(String[] args) {
        BankAccount printBankDetails= new BankAccount(02345, "Saving Account", "OX10 9FU", "Cholsey");
        printBankDetails.displayBankDetails();
        System.out.println("Account Holder Details");
        BankAccount printAccountHolderDetails= new BankAccount(012345, "06 Ashfield Way", 41);
        printAccountHolderDetails.displayHolderInformaton();
    }
}
