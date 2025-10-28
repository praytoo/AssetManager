package com.pluralsight;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public Vehicle(String makeModel, int year, int odometer) {
        super("Cyber Truck", "12/25/2025", 100000);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }
    @Override
    public double getValue(){
        if (year >= 2025 || year <= 2022){
            return getOriginalCost() - (getOriginalCost() * .03);
        }else if (year >= 2021 || year <= 2019) {
            return getOriginalCost() - (getOriginalCost() * .06);
        }else if (year >= 2018 || year <= 2015){
            return getOriginalCost() - (getOriginalCost() * .08);
        }else if (year <= 2015){
            return getOriginalCost() - 1000.00;
        }else if (makeModel == "Honda" || makeModel == "Toyota" && odometer > 100000){
            getOriginalCost();
        }else if (odometer > 100000){
            return getOriginalCost() - (getOriginalCost() * .25);
        }
        return -1;
    }
}
