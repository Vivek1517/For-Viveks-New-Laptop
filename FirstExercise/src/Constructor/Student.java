package Constructor;

public class Student {
    String name;
    int id;
    String subject;
    String postCode;

    Student(String name, int id, String subject, String postCode){
        this.name=name;
        this.id= id;
        this.subject= subject;
        this.postCode= postCode;
    }
    public void display(){
        System.out.println("Student name: "+name);
        System.out.println("Student id: "+id);
        System.out.println("Subject enrolled for: "+subject);
        System.out.println("Students home postcode: "+postCode);
    }

    public static void main(String[] args) {
        Student student1= new Student("Vivek", 102, "JAVA Automation", "OX10 9FU");
        student1.display();
    }
}
