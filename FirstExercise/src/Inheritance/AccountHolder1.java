package Inheritance;

import Encapsulation.AccountHolder;

public class AccountHolder1 extends Bank{
    int openingBalance;
    String accountHolderName;
    String accountHolderContactNumber;
    AccountHolder1(String bankName, int contactNumber, String branch, int miniAmount){
        super(bankName, contactNumber, branch, miniAmount);
    }
    public void holderDetails(int openingBalance, String accountHolderName, String accountHolderContactNumber){
        this.openingBalance=openingBalance;
        this.accountHolderName=accountHolderName;
        this.accountHolderContactNumber=accountHolderContactNumber;
        System.out.println("Account Holder Name: "+ accountHolderName);
        System.out.println("Contact Number: "+ accountHolderContactNumber);
        System.out.println("Opening Balance: "+openingBalance);
            }
//    public void accountHolderdisPlay(){
//        System.out.println("Account Holder Name: "+ accountHolderName);
//        System.out.println("Contact Number: "+ accountHolderContactNumber);
//        System.out.println("Opening Balance: "+openingBalance);
//    }

    public static void main(String[] args) {
        AccountHolder1 obj = new AccountHolder1("Santander", 12345678, "Cholsey", 200);
        obj.holderDetails(500,"Vivek", "07957653672");

    }
}
