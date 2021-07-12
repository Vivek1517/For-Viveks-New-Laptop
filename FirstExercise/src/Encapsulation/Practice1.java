package Encapsulation;

public class Practice1 {
    String name;
    String address;
    int contactNumber;
    String nextOfKin;

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getContactNumber(){
        return contactNumber;
    }
    public String getNextOfKin(){
        return nextOfKin;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setContactNumber(int contactNumber){
        this.contactNumber=contactNumber;
    }
    public void setNextOfKin(String nextOfKin){
        this.nextOfKin=nextOfKin;
    }
}
