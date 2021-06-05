package com.company.devices;

import com.company.Human;

public class Car extends Device {

    public Double engineSize;
    public String fuelType;

    @Override
    public void turnOn() {
        System.out.println("Car is turned on");
    }

    @Override
    public boolean sell(Human seller, Human buyer, Double price) {
        if (seller.car == this){
            if (buyer.cash >= price){
                buyer.cash -= price;
                buyer.car = this;
                seller.car = null;
                System.out.println("Car has been sold");
                return true;
}
        }

        System.out.println("The buyer does not have enough money");
        return false;
}
}