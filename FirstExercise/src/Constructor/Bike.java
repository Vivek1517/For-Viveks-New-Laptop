package Constructor;

public class Bike {
    String brandName, model, cc;
    int price, mileage;

    public Bike(String brandName, String model, String cc, int price, int mileage){
        this.brandName = brandName;
        this.model = model;
        this.cc = cc;
        this.price = price;
        this.mileage = mileage;
    }
    public void displayDetails(){
        System.out.println("Brand name: "+brandName);
        System.out.println("Model: "+model);
        System.out.println("Bike CC: "+cc);
        System.out.println("Bike price: "+"$"+price);
        System.out.println("Miles per liter:"+mileage);
    }

    public static void main(String[] args) {
        Bike details = new Bike("BMW","B1","500cc",10000,100);
        details.displayDetails();
    }
}
