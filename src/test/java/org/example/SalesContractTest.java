package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesContractTest {

    @Test
    void getSalesTaxAmount() {
        //arrange
        Vehicle vehicle = new Vehicle();
        vehicle.setPrice(30000);
        SalesContract salesContract = new SalesContract("2025/11/01","Kros Richardson","krosrichardson@gmail.com",vehicle,0.05,100,false);
        double amountSales = salesContract.getSalesTaxAmount();
        //assert
        assertEquals(0.05,amountSales);
    }

    @Test
    void getRecordingFee() {
        Vehicle vehicle = new Vehicle();
        SalesContract salesContract = new SalesContract("2025/11/01","Kros Richardson","krosrichardson@gmail.com",vehicle,0.05,100,false);
        double recordingFee= salesContract.getRecordingFee();
        //assert
        assertEquals(100,recordingFee);
    }

    @Test
    void setRecordingFee() {
        Vehicle vehicle = new Vehicle();
        SalesContract salesContract = new SalesContract("2025/11/01","Kros Richardson","krosrichardson@gmail.com",vehicle,0.05,100,false);
        salesContract.setRecordingFee(150);
        double recordingFee= salesContract.getRecordingFee();
        //assert
        assertEquals(150,recordingFee);
    }

    @Test
    void testGetProcessingFeeReturns295ForVehicleUnder10000() {
        Vehicle vehicle = new Vehicle();
        vehicle.setPrice(9000);
        SalesContract salesContract = new SalesContract("2025/11/01","Kros Richardson","krosrichardson@gmail.com",vehicle,0.05,100,false);
        double processingFee = salesContract.getProcessingFee();
        //assert
        assertEquals(295,processingFee);
    }

    @Test
    void testGetProcessingFeeReturns495ForVehicleAbove10000() {
        Vehicle vehicle = new Vehicle();
        vehicle.setPrice(30000);
        SalesContract salesContract = new SalesContract("2025/11/01","Kros Richardson","krosrichardson@gmail.com",vehicle,0.05,100,false);
        double processingFee = salesContract.getProcessingFee();
        //assert
        assertEquals(495,processingFee);
    }
    @Test
    void setProcessingFee() {
    }

    @Test
    void isFinance() {
    }

    @Test
    void setFinance() {
    }

    @Test
    void getTotalPrice() {
    }

    @Test
    void getMonthlyPayment() {
    }

    @Test
    void toCsvLine() {
    }
}