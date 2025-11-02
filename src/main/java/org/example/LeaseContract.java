package org.example;

public class LeaseContract extends Contract{
    double expectedEndingValue;
    double leaseFee;

    public LeaseContract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicle,double expectedEndingValue,double leaseFee) {
        super(dateOfContract, customerName, customerEmail, vehicle);
        this.expectedEndingValue= vehicle.getPrice()* expectedEndingValue;
        this.leaseFee = vehicle.getPrice()* leaseFee;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    public double getExpectedEndingValue() {
        return expectedEndingValue;
    }

    public void setExpectedEndingValue(double expectedEndingValue) {
        this.expectedEndingValue = expectedEndingValue;
    }

    @Override
    public double getTotalPrice() {
        return getVehicle().getPrice() + getExpectedEndingValue()+getLeaseFee();
    }

    @Override
    public double getMonthlyPayment() {
        return (getTotalPrice()*0.04 + getTotalPrice())/36;
    }
    @Override
    public String toCsvLine(){
        return  String.format("%s | %s | %s | (Vin: %s) - $%.2f , $%.2f, $%.2f, $%.2f",getDateOfContract(),getCustomerName(), getCustomerEmail(), getVehicle().toString(), getExpectedEndingValue(),getLeaseFee(), getTotalPrice(), getMonthlyPayment());
    }
}
