package com.pluralsight;

import jdk.jfr.Description;

public class Asset {
    protected String description;
    protected String dateAcquired;
    protected double originalCost;

    //Constructor
    protected Asset(String description, String dataAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dataAcquired;
        this.originalCost = originalCost;
    }
    protected Asset() {
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDataAcquired() {
        return dateAcquired;
    }

    public void setDataAcquired(String dataAcquired) {
        this.dateAcquired = dataAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }
    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }
    double getValue() {
        return getOriginalCost();
    }
}

