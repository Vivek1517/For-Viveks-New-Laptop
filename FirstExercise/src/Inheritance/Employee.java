package Inheritance;

public class Employee {
    String name;
    int id;
    int contract;
    String companyName= "Koolfabs";
    Employee(String name, int id, int contract){
        this.name = name;
        this.id = id;
        this.contract = contract;
    }
    public void nextOfKin(String kin){
        System.out.println("Next of Kin Name: "+kin);
    }
}
