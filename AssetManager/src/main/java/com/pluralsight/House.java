package com.pluralsight;

import java.awt.*;

public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    //Constructor
    protected House(String address, int condition, int squareFoot, int lotSize) {
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;

    }
    protected House() {

    }
    //Getters Setters

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() { //1 -excellent, 2 -good, 3 -fair, 4 -poor
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() { // 25 cents per square foot of lot size

        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    //Override getValue
    @Override
    public double getValue() {
        double perSqFt;
        switch (condition) {
            /*
            / A house's value is determined as
// $180.00 per square foot (excellent)
// $130.00 per square foot (good)
// $90.00 per square foot (fair)
// $80.00 per square foot (poor)
// PLUS 25 cents per square foot of lot size
*/

            case 1:
                perSqFt = 180.00;
                break;
            case 2:
                perSqFt = 130.00;
                break;
            case 3:
                perSqFt = 90.00;
                break;
            case 4:
                perSqFt = 80.00;
                break;
            default:
                perSqFt = 0.0; // default case if the value is outside of the condition 1-4 it's gonna print 0.0
        }
        return (squareFoot * perSqFt) + (lotSize * 0.25); //Calculate total value of a house based on
        //squareFoot times perSqFt plus lotSize time 25 cents
    }

}
