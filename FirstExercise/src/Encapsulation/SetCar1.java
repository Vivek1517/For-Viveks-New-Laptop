package Encapsulation;

public class SetCar1 {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.setBrand("Land Rover");
        car.setName("Evoque");
        car.setEngineSize(4);
        car.setPrice(40000);
        System.out.println("Brand Name: "+car.getBrand());
        System.out.println("Car Type: "+car.getName());
        System.out.println("Engine size: "+car.getEngineSize());
        System.out.println("Cost of Car: "+"$"+car.getPrice());
    }
}
