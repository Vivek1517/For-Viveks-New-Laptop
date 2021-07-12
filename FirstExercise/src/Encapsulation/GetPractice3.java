package Encapsulation;

public class GetPractice3 {
    public static void main(String[] args) {
        Practice3 print = new Practice3();
        print.setStudentName("Vivek.K.Salgaonkar");
        print.setStudentNumber(0+795765367+2);
        print.setStudentAddress("Cholsey");
        print.setCourseName("Advanced Java");
        System.out.println("Student Name: "+print.getStudentName());
        System.out.println("Student Contact Number: "+print.getStudentNumber());
        System.out.println("Student Address: "+print.getStudentAddress());
        System.out.println("Course Enrolled: "+print.getCourseName());
    }
}
