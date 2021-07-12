package Encapsulation;

public class Car {
    private String carBrand;
    private int carYear;
    private String function;
    private double carEngine;

    public String getCarBrand(){
        return carBrand;
    }
    public void setCarBrand(String carBrand){
        this.carBrand=carBrand;
    }
    public int getCarYear(){
        return carYear;
    }
    public void setCarYear(int carYear){
        this.carYear=carYear;
    }
    public String getFunction(){
        return function;
    }
    public void setFunction(String function){
        this.function=function;
    }
    public double getCarEngine(){
        return carEngine;
    }
    public void setCarEngine(double carEngine){
        this.carEngine=carEngine;
    }
}
