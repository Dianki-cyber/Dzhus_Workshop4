package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() {
        init();
    }

    private void init() {

        this.dealership = DealershipFileManager.getDealership();
    }

    private void logMenu() {
        System.out.printf("Welcome to %s,we sell the best car! ", this.dealership.getName());
        System.out.printf("Located at %s%n", this.dealership.getAddress());
        System.out.println("Select from the following options:");
        System.out.println("0. Exit Program");
        System.out.println("1. View all vehicles");
        System.out.println("2. Search for vehicles by price");
        System.out.println("3. Search for vehicles by make/model");
        System.out.println("4. Search for vehicles by year");
        System.out.println("5. Search for vehicles by color");
        System.out.println("6. Search for vehicles by mileage");
        System.out.println("7. Search for vehicles by vehicleType");
        System.out.println("8. Add a vehicle");
        System.out.println("9. Remove a vehicle");
        System.out.println("10.Purchase vehicle");
        System.out.print("Enter choice: ");
    }

    public void start() {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            logMenu();
            try {

                int choice = scanner.nextInt();
                scanner.nextLine();//always put this
                switch (choice) {
                    case 0:
                        System.out.println("Goodbye!");
                        running = false;
                        break;
                    case 1:
                        showAllVehicles();
                        break;
                    case 2:
                        searchForVehiclesByPrice(scanner);
                        break;
                    case 3:
                        searchForVehiclesByModelMake(scanner);
                        break;
                    case 4:
                        searchByYear(scanner);
                        break;
                    case 5:
                        searchByColor(scanner);
                        break;
                    case 6:
                        searchByMileage(scanner);
                        break;
                    case 7:
                        searchByVehicleType(scanner);
                        break;
                    case 8:
                        addVehicle(scanner);
                        break;
                    case 9:
                        removeVehicle(scanner);
                        break;
                    case 10:
                        purchaseVehicle(scanner);
                        break;
                    default:
                        System.out.println("Invalid option , please try again.");
                        break;
                }
            } catch (InputMismatchException exception){
                System.out.println("Invalid input");
                scanner.nextLine();
            } catch (Exception exception){
                System.out.println("Invalid input try again");
                scanner.nextLine();

            }

        }
        scanner.close();
    }

    private void showAllVehicles() {
        ArrayList<Vehicle> vehicles = dealership.getAllVehicles();
        logVehicles(vehicles);
    }

    private void searchForVehiclesByPrice(Scanner scanner) {
        System.out.println("Enter min amd max price:");
        double min = scanner.nextDouble();
        double max = scanner.nextDouble();
        ArrayList<Vehicle> vehicles = dealership.searchByPrice(min, max);
        logVehicles(vehicles);
    }

    private void searchForVehiclesByModelMake(Scanner scanner) {
        System.out.println("Enter make or model:");
        String makeOrModel = scanner.nextLine();
        ArrayList<Vehicle> vehicles = dealership.searchByMakeModel(makeOrModel, makeOrModel);
        logVehicles(vehicles);
    }


    private void searchByYear(Scanner scanner) {
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Vehicle> vehicles = dealership.searchByYear(year);
        logVehicles(vehicles);
    }

    private void searchByColor(Scanner scanner) {
        System.out.println("Enter your color:");
        String color = scanner.nextLine();
        ArrayList<Vehicle> vehicles = dealership.searchByColor(color);
        logVehicles(vehicles);

    }

    private void searchByMileage(Scanner scanner) {
        System.out.println("Enter mileage:");
        scanner.nextLine();
        ArrayList<Vehicle> vehicles = dealership.searchByMileage(0, 200000);
        logVehicles(vehicles);


    }

    private void searchByVehicleType(Scanner scanner) {
        System.out.println("Enter your Vehicle type:");
        String type = scanner.nextLine();
        ArrayList<Vehicle> vehicles = dealership.searchByVehicleType(type);
        logVehicles(vehicles);
    }


    private void addVehicle(Scanner scanner) {
        System.out.println("Enter your vin:");
        int vin = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your year:");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your make:");
        String make = scanner.nextLine();
        System.out.println("Enter your model:");
        String model = scanner.nextLine();
        System.out.println("Enter vehicle type:");
        String vehicleType = scanner.nextLine();
        System.out.println("Enter your color:");
        String color = scanner.nextLine();
        System.out.println(" Enter odometer:");
        int odometer = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your price:");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Vehicle vehicle = new Vehicle();
        vehicle.setVin(vin);
        vehicle.setYear(year);
        vehicle.setMake(make);
        vehicle.setModel(model);
        vehicle.setVehicleType(vehicleType);
        vehicle.setColor(color);
        vehicle.setOdometer(odometer);
        vehicle.setPrice(price);
        dealership.addVehicle(vehicle);
        DealershipFileManager.writeVehicle(vehicle);

    }
    private void purchaseVehicle(Scanner scanner){
        System.out.println("Enter vin:");
        int vin = scanner.nextInt();
        scanner.nextLine();
        dealership.purchaseVehicle(vin);

    }

     private void removeVehicle(Scanner scanner) {
        System.out.println("Enter the vin:");
        int vin = scanner.nextInt();
        scanner.nextLine();
        dealership.removeVehicle(vin);

    }

    private void logVehicles(ArrayList<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            String showVehicle = vehicle.toString();
            System.out.println(showVehicle);
        }
    }
}



