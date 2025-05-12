package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Yellow");
        car.setCargoCapacity(23);
        car.setNumberOfPassengers(4);
        car.setFuelCapacity(12);

        SemiTruck semiTruck = new SemiTruck("Yellow", 4, 23, 12);

        Moped moped = new Moped();
        moped.setColor("Red");
        moped.setCargoCapacity(10);
        moped.setNumberOfPassengers(2);
        moped.setFuelCapacity(5);

        Moped moped1 = new Moped("Red", 2, 10, 5);

        SemiTruck semiTruck1 = new SemiTruck();
        semiTruck1.setColor("Blue");
        semiTruck1.setCargoCapacity(40);
        semiTruck1.setNumberOfPassengers(6);
        semiTruck1.setFuelCapacity(24);

        SemiTruck semiTruck2 = new SemiTruck("White", 6, 40, 24);

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setColor("Black");
        hovercraft.setCargoCapacity(24);
        hovercraft.setNumberOfPassengers(3);
        hovercraft.setFuelCapacity(12);

        Hovercraft hovercraft1 = new Hovercraft("Black", 3, 24, 12);



    }


}
