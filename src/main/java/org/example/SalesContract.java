package org.example;

public class SalesContract extends Contract{
    double salesTaxAmount;
    double recordingFee;
    double processingFee;
    boolean isFinance;

    public SalesContract(String dateOfContract, String customerName, String customerEmail,Vehicle vehicle, double salesTaxAmount, double recordingFee, boolean isFinance) {
        super(dateOfContract, customerName, customerEmail,vehicle);
        double price = vehicle.getPrice();
        this.salesTaxAmount= salesTaxAmount;
        this.recordingFee = recordingFee;
        this.processingFee = price >= 10000 ? 495 : 295;//ternary operator
        this.isFinance = isFinance;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(int salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return isFinance;
    }

    public void setFinance(boolean finance) {
        isFinance = finance;
    }


    @Override
    public double getTotalPrice() {
        return getVehicle().getPrice() + getSalesTaxAmount()*getVehicle().getPrice() + getRecordingFee();
    }

    @Override
    public double getMonthlyPayment() {
        double result=0;
        if (isFinance){
            double totalPrice=getTotalPrice();
            if (totalPrice >= 10000){
                result = (totalPrice * 0.0425 + totalPrice) / 48;
            } else{
                result=(totalPrice * 0.0525 +totalPrice)/ 24;
            }
        }
        return  result;
    }

    @Override
    public String toCsvLine(){
        return  String.format("%s | %s | %s | (Vehicle: %s) -|$%.2f, $%.2f, $%.2f, $%.2f",getDateOfContract(),getCustomerName(), getCustomerEmail(), getVehicle().toString(), getSalesTaxAmount(),getRecordingFee(), getTotalPrice(), getMonthlyPayment());
    }

}
