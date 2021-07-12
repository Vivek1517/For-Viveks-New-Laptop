public class BankAccount {
    int age;
    int openingBalance;
    String accountType;
    String branchName;
    int interestRate;
    BankAccount(int accountHolderAge, int holderOpeningBalance, String account, String branch, int interest){
        age= accountHolderAge;
        openingBalance= holderOpeningBalance;
        accountType= account;
        branchName= branch;
        interestRate= interest;
    }
    public void display(){
        System.out.println("Age of the account holder: "+age);
        System.out.println("Opening balance: "+openingBalance);
        System.out.println("Account type: "+accountType);
        System.out.println("Branch of the account holder: "+branchName);
        System.out.println("Interest rate for this account holder: "+interestRate+"%");
    }

    public static void main(String[] args) {
        BankAccount printDetails= new BankAccount(18, 500,"Saving","Cholsey",8);
        BankAccount printDetails1= new BankAccount(28, 200,"Current","Walingford",7);
        printDetails.display();
        System.out.println(" ");
        printDetails1.display();
        new Constructor();
    }
}

