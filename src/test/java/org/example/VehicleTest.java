package org.example;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @org.junit.jupiter.api.Test
    void testGetVinReturnsCorrectVin() {
        // arrange
       Vehicle vehicle = new Vehicle();
        // act
        int originalVin = 237;
        vehicle.setVin(originalVin);
        // assert
        int actualVin = vehicle.getVin();
        assertEquals(originalVin, actualVin);
    }

    @org.junit.jupiter.api.Test
    void testSetVinSavesNewVin() {
        Vehicle vehicle = new Vehicle();
        // act
        int originalVin = 30;
        vehicle.setVin(originalVin);
        // assert
        int actualVin = vehicle.getVin();
        assertEquals(originalVin, actualVin);
    }

    @org.junit.jupiter.api.Test
    void getYear() {
        Vehicle vehicle = new Vehicle();
        // act
        int originalYaer=2024;
        vehicle.setYear(originalYaer);
        // assert
        int actuaYear = vehicle.getYear();
        assertEquals(originalYaer, actuaYear);
    }

    @org.junit.jupiter.api.Test
    void setYear() {
        Vehicle vehicle = new Vehicle(2,2023,"Toyota","Rav4","SUV","Gold",10000,15000);
        // act
        vehicle.setYear(2019);
        // assert
        int actuaYear = vehicle.getYear();
        assertEquals(2019, actuaYear);
    }

    @org.junit.jupiter.api.Test
    void getMake() {
        String originalMake = "Toyota";
        Vehicle vehicle = new Vehicle(2,2023,originalMake,"Rav4","SUV","Gold",10000,15000);
        // act
        // assert
        String actualMake = vehicle.getMake();
        assertEquals(originalMake, actualMake);
    }

    @org.junit.jupiter.api.Test
    void setMake() {
    }

    @org.junit.jupiter.api.Test
    void getModel() {
    }

    @org.junit.jupiter.api.Test
    void setModel() {
    }

    @org.junit.jupiter.api.Test
    void getVehicleType() {
    }

    @org.junit.jupiter.api.Test
    void setVehicleType() {
    }

    @org.junit.jupiter.api.Test
    void getOdometer() {
    }

    @org.junit.jupiter.api.Test
    void setOdometer() {
    }

    @org.junit.jupiter.api.Test
    void getColor() {
    }

    @org.junit.jupiter.api.Test
    void setColor() {
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
    }

    @org.junit.jupiter.api.Test
    void setPrice() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}