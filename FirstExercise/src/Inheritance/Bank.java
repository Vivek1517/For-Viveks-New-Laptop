package Inheritance;

public class Bank {
    String bankName;
    int contactNumber;
    String branch;
    int miniAmount;
    Bank(String bankName, int contactNumber, String branch, int miniAmount){
        this.bankName=bankName;
        this.contactNumber=contactNumber;
        this.branch=branch;
        this.miniAmount=miniAmount;
    }
    Bank(){
        System.out.println("jfjf");
    }
}
