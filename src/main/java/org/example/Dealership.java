package org.example;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;
    // declare the list
    // Constructor
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
        // instantiate the list
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehicles() {
        return inventory;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.inventory = vehicles;
    }



    // Add a vehicle
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }


    // Get all vehicles
    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }

    // Placeholder search methods
    public Vehicle searchByVin(String vin) { return null; }

    public ArrayList<Vehicle> searchByMakeModel(String make,String model) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for(Vehicle vehicle: inventory){
            if(vehicle.getModel().equalsIgnoreCase(model) || vehicle.getMake().equalsIgnoreCase(make)){
              result.add(vehicle);
            }
        }
        return result; }

    public ArrayList<Vehicle> searchByYear(int year){
        ArrayList<Vehicle> result = new ArrayList<>();
        for(Vehicle vehicle: inventory){
            if(vehicle.getYear() == year){
                result.add(vehicle);
            }
        }
        return result;
    }
    public ArrayList<Vehicle> searchByColor(String color) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for(Vehicle vehicle: inventory){
            if(vehicle.getColor().equalsIgnoreCase(color)){
                result.add(vehicle);
            }
        }
        return result; }

    public ArrayList<Vehicle> searchByPrice(double minPrice, double maxPrice) {
       ArrayList<Vehicle> result = new ArrayList<>();
       for(Vehicle vehicle : inventory){
           if(vehicle.getPrice()>minPrice && vehicle.getPrice()<maxPrice){
               result.add(vehicle);
           }
       }
        return result ;
    }
    //public List<Vehicle>
    // Placeholder remove method
    public void removeVehicle(int vin) {
        // for(Vehicle vehicle : inventory){
        //if( vehicle.getVin()==vin){
        inventory.removeIf(vehicle -> vehicle.getVin() == vin);

    }
}

