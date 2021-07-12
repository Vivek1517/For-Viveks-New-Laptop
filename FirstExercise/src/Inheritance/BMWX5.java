package Inheritance;

public class BMWX5 extends Car{
    int price;
    String model="BMWX5";
    BMWX5(int price, String color, String regNumber, int milesPerHour){
        super(color, regNumber, milesPerHour);
        this.price=price;
        System.out.println("Color of the Car: "+color);
        System.out.println("Reg Number: "+regNumber);
        System.out.println("Miles Per Hour: "+milesPerHour);
        System.out.println("On the road price: "+"$"+price);
        System.out.println("Model of the car: "+model);
    }
    public void carEngine(){
        String engine="3.1l";
        System.out.println("Car engine size: "+engine);
    }

    public static void main(String[] args) {
       BMWX5 getDetails= new BMWX5(70000, "Silver", "WP61HTY", 100);
       Car getCar= new Car();
       getCar.carEngine("3.2l");
       getDetails.carEngine();
        System.out.println("Brand of the car: "+getDetails.Brand);

    }
}
