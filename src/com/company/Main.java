package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");

        dog.name = "Szarik";

        Human me = new Human(1000.0);
        me.firstName = "John";
        me.lastName = "Rambo";
        me.pet = dog;
        me.cash = 2000.0;



        Phone onePlus = new Phone("onePlus",
                "8Pro",
                2.3,
                "Android");

        Human seller = new Human(2000.0);
        seller.phone = onePlus;
        seller.cash = 20000.0;

                Phone iPhone6 = new Phone("apple", "6s", 5.0, "iOs");

        System.out.println("phone: " + onePlus);
        System.out.println("phone: " + iPhone6);
        System.out.println("human: " + me);


        onePlus.turnOn();

        Car fiat = new Car();
        fiat.engineSize = 1.9;
        fiat.fuelType = "disel";
        fiat.producer = "Fiat";
        fiat.model = "Bravo";
        fiat.setYearOfProduction(2000);

        System.out.println(iPhone6.os);
        System.out.println(iPhone6.screenSize);
        System.out.println(iPhone6.model);
        System.out.println(iPhone6.producer);

        fiat.turnOn();
        iPhone6.turnOn();

        System.out.println(me instanceof Human);
        System.out.println(me instanceof Animal);

        System.out.println(me.getClass());
        System.out.println(me.getClass().getSuperclass());
        System.out.println(me.getClass().getSuperclass().getSuperclass());
        System.out.println(me.getClass().getSuperclass().getSuperclass().getSuperclass());
        System.out.println(fiat.toString());

        onePlus.sell(seller,me,150.0);
        dog.sell(me,seller,200.0);
    }
}