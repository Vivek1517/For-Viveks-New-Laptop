package Exercise5;

public class Static {
    static String bankName="Santander";
    static long phoneNumber= 1243782205;
    static String branch="Cholsey";
    int customerID;
    String customerName;

    public void customerDetails1(int id, String name){
        this.customerID=id;
        this.customerName=name;
        System.out.println("Customer ID: "+id);
        System.out.println("Customer Name: "+ name);
        System.out.println("Name of the Bank: "+bankName);
        System.out.println("Contact Number for the Bank: "+phoneNumber);
        System.out.println("Branch address: "+branch);

    }
    public static void customerDetails2(int id, String name){
        System.out.println("Customer ID: "+id);
        System.out.println("Customer Name: "+ name);
        System.out.println("Name of the Bank: "+bankName);
        System.out.println("Contact Number for the Bank: "+phoneNumber);
        System.out.println("Branch address: "+branch);
    }

    public static void main(String[] args) {
        Static customerDetails= new Static();
        customerDetails.customerDetails1(200, "Vivek");
        customerDetails.customerDetails1(250, "Sharmilee");
        customerDetails2(300, "Kiyaan");


    }
}
