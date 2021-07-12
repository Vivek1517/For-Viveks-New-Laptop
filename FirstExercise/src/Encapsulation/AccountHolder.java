package Encapsulation;

import java.math.BigInteger;
import java.util.Random;

public class AccountHolder {
    private String name;
    private int accountNumber;
    private String branch;
    private long contactNumber;
    private int securityNumber;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber= accountNumber;
    }
    public String getBranch(){
        return branch;
    }
    public void setBranch(String branch){
        this.branch= branch;
    }
    public long getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(long contactNumber){
        this.contactNumber=contactNumber;
    }
    public int getSecurityNumber(){
        return securityNumber;
    }
    public void setSecurityNumber(int securityNumber){
        Random sNumber= new Random();
        int secNumber= sNumber.nextInt(1001);
        this.securityNumber=securityNumber+secNumber;
    }
    }

