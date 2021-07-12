package Encapsulation;

public class PrintBike {
    public static void main(String[] args) {
       Bike details = new Bike();
       details.setBrand("BMW");
       details.setCc("1000CC");
       details.setRegNumber("WP61HTY");
       details.setBikeCost(10000);
        System.out.println("Bike Brand: "+details.getBrand());
        System.out.println("Bike CC: "+details.getCc());
        System.out.println("Bike Registration: "+details.getRegNumber());
        System.out.println("Bike Cost: "+"$"+details.getBikeCost());
    }

}
