package Constructor;

public class Practice {
    String carBrand;
    String carModel;
    int price;
    int year;
    String regNumber;
    int milesPerLitter;

    public Practice(String carBrand, String carModel, int price, int year, String regNumber, int milesPerLitter){
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.price = price;
        this.year = year;
        this.regNumber = regNumber;
        this.milesPerLitter = milesPerLitter;
    }
    public void printSpecification(){
        System.out.println("Brand Name: "+carBrand);
        System.out.println("Model Name: "+carModel);
        System.out.println("On the Road Price: "+price);
        System.out.println("Manufactured Year: "+ year);
        System.out.println("Car Reg Number: "+regNumber);
        System.out.println("Miles per litter: "+milesPerLitter);
    }

    public static void main(String[] args) {
        Practice printDetails = new Practice("Ford","Mustang",100000,2021,"WP61HTY",20);
        printDetails.printSpecification();
    }
}
