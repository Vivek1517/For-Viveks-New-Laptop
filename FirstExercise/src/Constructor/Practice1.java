package Constructor;

public class Practice1 {
    String name;
    String titel;
    int salary;
    static String country="U.K";
    int contactNumber;
    String address;
    Practice1(String name, String titel, int salary, int contactNumber){
        this.name= name;
        this.titel= titel;
        this.salary= salary;
        this.contactNumber= contactNumber;
    }
    Practice1(String name, String titel, int salary, int contactNumber, String address){
        this.name= name;
        this.titel= titel;
        this.salary= salary;
        this.contactNumber= contactNumber;
        this.address=address;
    }
    public void result(){
        System.out.println("Job titel: "+titel+" of "+country);
        System.out.println("Prime Ministers Name: "+name);
        System.out.println("Yearly Salary: "+"$"+salary);
        System.out.println("Contact Number: "+"01249"+contactNumber);

    }
    public void result1(){
        System.out.println("Job titel: "+titel+" of "+country);
        System.out.println("Prime Ministers Name: "+name);
        System.out.println("Yearly Salary: "+"$"+salary);
        System.out.println("Contact Number: "+"01249"+contactNumber);
        System.out.println("Address of Chancellor: "+address);

    }

    public static void main(String[] args) {
        Practice1 display= new Practice1("Boris Johnson", "Prime Minister", 1000000, 782206);
        Practice1 display1= new Practice1("Rishi Sunak", "Chancellor", 100000, 782206);
        display1.result();
        System.out.println(" ");
        display.result();
    }
}
