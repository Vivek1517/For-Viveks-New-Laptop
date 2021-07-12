package Encapsulation;

public class GetPractice2{
    public static void main(String[] args) {
        Practice2 print = new Practice2();
        print.setCarBrand("Ford");
        print.setCarModel("Mustang");
        print.setYear(2021);
        print.setCarPrice(100000);
        print.setRegNumber("WP61HTY");
        print.setMilesPerLitter(25);
        System.out.println("Brand Name: "+print.getCarBrand());
        System.out.println("Model Name: "+print.getCarModel());
        System.out.println("Year: "+print.getYear());
        System.out.println("Price: "+print.getCarPrice());
        System.out.println("Reg Number: "+print.getRegNumber());
        System.out.println("Miles per Litter: "+print.getMilesPerLitter());
    }
}
