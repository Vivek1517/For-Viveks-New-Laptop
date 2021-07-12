package Encapsulation;

public class Car1 {
    private String brand;
    private String name;
    private int engineSize;
    private int price;

    public String getBrand(){
        return brand;
    }
    public String getName(){
        return name;
    }
    public int getEngineSize(){
        return engineSize;
    }
    public int getPrice(){
        return price;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }
    public void setPrice(int price){
        this.price=price;
    }
}
