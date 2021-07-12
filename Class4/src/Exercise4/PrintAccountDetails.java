package Exercise4;

public class PrintAccountDetails {
    public static void main(String[] args) {
        AccountDetails newAccount= new AccountDetails();
        newAccount.accountName();
        newAccount.accountNumber();
        newAccount.dateAccountOpened();
        newAccount.deposit();
        newAccount.withdrawn();
        newAccount.balance();

    }
}
