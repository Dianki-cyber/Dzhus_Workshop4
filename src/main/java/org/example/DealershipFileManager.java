package org.example;

import java.io.FileNotFoundException;

import java.io.*;
import java.util.*;
import java.io.FileWriter;


public class DealershipFileManager {

    public static Dealership getDealership() {
        Dealership dealership = new Dealership("Dream Motors", "501 Luxury Ave", "512-777-7777");
        try {
            FileReader fr = new FileReader("src/main/resources/inventory.csv");
            BufferedReader reader = new BufferedReader(fr);

            String line;
            //not read first line
            reader.readLine();
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) continue;
                String[] vehicleData = line.split("\\|");

                //vin|year|make|model|vehicleType|color|odometer|price
                Vehicle newVehicle = new Vehicle();
                newVehicle.setVin(Integer.parseInt(vehicleData[0]));
                newVehicle.setYear(Integer.parseInt(vehicleData[1]));
                newVehicle.setMake(vehicleData[2]);
                newVehicle.setModel(vehicleData[3]);
                newVehicle.setVehicleType(vehicleData[4]);
                newVehicle.setColor(vehicleData[5]);
                newVehicle.setOdometer(Integer.parseInt(vehicleData[6]));
                newVehicle.setPrice(Double.parseDouble(vehicleData[7]));

                dealership.addVehicle(newVehicle);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Again");

        } catch (IOException e) {
            System.out.println("Again again");
        }

        return dealership;

    }

    public static void writeVehicle(Vehicle vehicle){
    //open the file
        try{
        FileWriter writer = new FileWriter("src/main/resources/inventory.csv", true);
        //write to the file
        writer.write("\n");
        writer.write(vehicle.getVin());
        writer.write("|");
        writer.write(vehicle.getYear());
        writer.write("|");
        writer.write(vehicle.getMake());
        writer.write("|");
        writer.write(vehicle.getModel());
        writer.write("|");
        writer.write(vehicle.getVehicleType());
        writer.write("|");
        writer.write(vehicle.getColor());
        writer.write("|");
        writer.write(vehicle.getOdometer());
        writer.write("|");
        writer.write(String.valueOf(vehicle.getPrice()));


        // close the file when you are finished using it
        writer.close();
    } catch (IOException e) {
        System.out.println("ERROR: An unexpected error occurred");

    }

}}
