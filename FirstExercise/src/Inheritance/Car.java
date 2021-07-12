package Inheritance;

public class Car {
    String color;
    final String Brand="BMW";
    String regNumber;
    int milesPerHour;
    Car(String color, String regNumber, int milesPerHour){
        this.color=color;
        this.regNumber=regNumber;
        this.milesPerHour=milesPerHour;
    }

    public Car() {
        System.out.println("Parent class");
    }

    public void carEngine(String engine){
        System.out.println("Car Engine: "+engine);
    }

}
