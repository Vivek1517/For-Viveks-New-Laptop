package Inheritance;

public class ImplementCar1 extends Car1{
    String modelColor;
    String carReg;
    public ImplementCar1(String modelColor, String carReg, String carModel, String carPrice){
        super(carModel,carPrice);
        this.modelColor=modelColor;
        this.carReg=carReg;
    }
    public void printDisplay(){
        System.out.println("Car Brand: "+super.carBrand);
        System.out.println("Wheels Specification: "+super.wheels);
        System.out.println("Car Model: "+carModel);
        System.out.println("Price: "+carPrice);
        System.out.println("Model Color: "+modelColor);
        System.out.println("Car reg: "+carReg);

    }

    public static void main(String[] args) {
        ImplementCar1 impl = new ImplementCar1("White","WP61HTY","Mustang","$50000");
        impl.printDisplay();
    }
}
