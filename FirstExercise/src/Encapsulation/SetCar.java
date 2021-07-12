package Encapsulation;

public class SetCar {
    public static void main(String[] args) {
        Car details = new Car();
        details.setCarBrand("Range Rover");
        details.setCarYear(2021);
        details.setCarEngine(3.9);
        details.setFunction("Manual");
        System.out.println("Car Make: "+details.getCarBrand());
        System.out.println("Manufacturing year: "+details.getCarYear());
        System.out.println("Engine size: "+details.getCarEngine()+"l");
        System.out.println("Car type: "+details.getFunction());
    }
}
