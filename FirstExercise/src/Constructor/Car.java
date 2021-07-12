package Constructor;

public class Car {
    int year;
    int maxSpeed;
    String colour;
    String brand;
    double engine;
    String functional;
    Car(int year, int maxSpeed, String colour, String brand, double engine, String functional){
        this.year=year;
        this.maxSpeed= maxSpeed;
        this.colour=colour;
        this.brand=brand;
        this.engine=engine;
        this.functional=functional;
    }
    public void display(){
        System.out.println("Car Brand: "+brand);
        System.out.println("Registered Year: "+year);
        System.out.println("Car Colour: "+colour);
        System.out.println("Car Engine: "+engine);
        System.out.println("Car Functionality: "+functional);
        System.out.println("Maximum Speed of your Car: "+maxSpeed+" miles per hour");
    }


    public static void main(String[] args) {
        Car obj= new Car(2021, 200, "White", "Range Rover", 3.9, "Manual");
        obj.display();
        Car obj1= new Car(202200,  200,"Black", "BMW", 4.9, "automatic");
        obj1.display();
    }
}
