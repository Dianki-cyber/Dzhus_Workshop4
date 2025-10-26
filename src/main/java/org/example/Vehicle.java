package org.example;

public class Vehicle {
    private  int vin;
    private int year;
    private  String make;
    private  String model;
    private  String vehicleType;
    private String color;
    private  int odometer;
    private  double price;

    public Vehicle() {
        this.vin = 0;
        this.year = 0;
        this.make = "";
        this.vehicleType = "";
        this.model = "";
        this.color = "";
        this.odometer = 0;
        this.price = 0;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

 @Override
    public  String toString(){
        return  String.format("%d | %s | %s |  %s | (Vin: %s) - $%.2f",year,make,model,color,vin,price);
 }
}
