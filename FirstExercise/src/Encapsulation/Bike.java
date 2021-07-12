package Encapsulation;

public class Bike {
    private String brand;
    private String cc;
    private String regNumber;
    private int bikeCost;

    public String getBrand(){
        return brand;
    }
    public String getCc(){
        return cc;
    }
    public String getRegNumber(){
        return regNumber;
    }
    public int getBikeCost(){
        return bikeCost;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setCc(String cc){
        this.cc = cc;
    }
    public void setRegNumber(String regNumber){
        this.regNumber = regNumber;
    }
    public void setBikeCost(int bikeCost){
        this.bikeCost = bikeCost;
    }
}
