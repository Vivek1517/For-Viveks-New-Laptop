package Constructor;

public class PracticeConstructor {
    int age;
    String name;
    String className;
    int minimumFees;
    PracticeConstructor(int age, String name, String className, int minimumFees){
        this.age=age;
        this.name=name;
        this.className=className;
        this.minimumFees=minimumFees;
        }

        public void display(){
            System.out.println("Students Name: "+name);
            System.out.println("Students Age: "+age);
            System.out.println("Class Attending: "+className);
            System.out.println("Fees for the Class: "+minimumFees);
        }

    public static void main(String[] args) {
        PracticeConstructor printDetails= new PracticeConstructor(18,"Vivek", "Java", 1200);
        printDetails.display();
    }
}
