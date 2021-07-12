package Encapsulation;

public class GetPractice1 {
    public static void main(String[] args) {
        Practice1 obj = new Practice1();
        obj.setName("Vivek");
        obj.setAddress("Cholsey");
        obj.setContactNumber(123456);
        obj.setNextOfKin("Sharmilee");
        System.out.println("Census Name: "+obj.getName());
        System.out.println("Address: "+obj.getAddress());
        System.out.println("Contact Number: "+obj.getContactNumber());
        System.out.println("Name of Kin: "+obj.getNextOfKin());
    }
}
