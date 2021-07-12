package Exercise4;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccountDetails {
    int deposit=5000, withdrawn=1500, balance= deposit-withdrawn;

    void accountNumber(){
        int accountNumber=1541564;
        System.out.println("Account Number: "+accountNumber);
    }
    void accountName(){
        String name= "Jock";
        System.out.println("Account Holder Name: "+name);
    }
    void deposit(){

        System.out.println("Money Deposited: "+deposit);
    }
    void withdrawn(){
        System.out.println("Money Withdrawn: "+withdrawn);
    }
    void balance(){
        System.out.println("Balance amount after withdrawl:" +balance);
    }
    void dateAccountOpened(){
        LocalDateTime myDate= LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd MM YY");
        String formatedDate= myDate.format(myFormat);
        System.out.println("Date Account Opened: "+formatedDate);
    }
}
