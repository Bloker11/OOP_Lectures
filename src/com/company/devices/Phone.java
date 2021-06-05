package com.company.devices;

import com.company.Human;

public class Phone extends Device implements Sellable {
    public final Double screenSize;
    public String os;

    public static String greetings = "HELLO";

    public Phone(String producer, String model, Double screenSize, String os) {
        this.screenSize = screenSize;
        this.os = os;
    }

    public String toString() {
        return "producer: " + this.producer
                + " model: " + this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is turned on");
    }

    @Override
    public boolean sell(Human seller, Human buyer, Double price) {
        if (seller.phone == this){
            if (buyer.cash >= price){
                buyer.cash -= price;
                buyer.phone = this;
                seller.phone = null;
                System.out.println("Phone has been sold");
                return true;

            }
        }
        System.out.println("The buyer does not have enough money");
        return false;
    }
}
