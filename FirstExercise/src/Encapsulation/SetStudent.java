package Encapsulation;

public class SetStudent {
    public static void main(String[] args) {
        Student print= new Student();
        print.setName("Kiyaan");
        print.setAge(18);
        print.setContactNumber(1234567890);
        print.setSubject("PHD");
        print.setId(1510);
        System.out.println("Student Name: "+print.getName());
        System.out.println("Student Age: "+print.getAge());
        System.out.println("Student Contact Number: "+print.getContactNumber());
        System.out.println("Subject student studying: "+print.getSubject());
        System.out.println("Student ID: "+print.getId());
    }
}
