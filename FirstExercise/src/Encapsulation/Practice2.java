package Encapsulation;

public class Practice2 {
    private String carBrand;
    private String carModel;
    private int carPrice;
    private int year;
    private String regNumber;
    private int milesPerLitter;

    public String getCarBrand(){
        return carBrand;
    }
    public void setCarBrand(String carBrand){
        this.carBrand=carBrand;
    }
    public String getCarModel(){
        return carModel;
    }
    public void setCarModel(String carModel){
        this.carModel=carModel;
    }
    public int getCarPrice(){
        return carPrice;
    }
    public void setCarPrice(int carPrice){
        this.carPrice=carPrice;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String getRegNumber(){
        return regNumber;
    }
    public void setRegNumber(String regNumber){
        this.regNumber=regNumber;
    }
    public int getMilesPerLitter(){
        return milesPerLitter;
    }
    public void setMilesPerLitter(int milesPerLitter){
        this.milesPerLitter=milesPerLitter;
    }
}
