package com.pluralsight;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    // Constructor
    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel,int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }
    // Getters and Setters
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
    // Override getValue
    @Override
    public double getValue() {
        double originalCost = getOriginalCost();
        int currentYear = Year.now().get

        }


    }
    /* A car's value is determined as
// 0-3 years old - 3% reduced value of cost per year
// 4-6 years old - 6% reduced value of cost per year
// 7-10 years old - 8% reduced value of cost per year
// over 10 years old - $1000.00
// MINUS reduce final value by 25% if over 100,000 miles
// unless makeModel contains word Honda or Toyota */
}
