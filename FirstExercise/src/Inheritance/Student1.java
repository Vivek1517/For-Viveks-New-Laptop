package Inheritance;

public class Student1 extends Student{
    int fees;
    Student1(int fees, String name, long studentContactNumber, int studentID){
        super(name, studentContactNumber, studentID);
        this.fees= fees;
    }
    public void display(){
        System.out.println("Student name: "+ name);
        System.out.println("Student Contact details: "+ studentContactNumber);
        System.out.println("Student ID: "+studentID);
        System.out.println("Fees: "+fees);
        System.out.println("College Contact Number: "+super.collegeContactNumber);
        System.out.println("University enrolled for: "+super.university);
    }

    public static void main(String[] args) {
        Student1 getDetails= new Student1(2500,"Vivek", 12345678, 1510);
        getDetails.display();
    }
}
