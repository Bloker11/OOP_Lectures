package com.company;

import com.company.devices.Sellable;

public class Animal implements Sellable {
    final static Double DEFAULT_DOG_WEIGHT = 6.0;
    public String name;
    final static Double DEFAULT_CAT_WEIGHT = 1.0;
    final static Double DEFAULT_ELEPHANT_WEIGHT = 2000.0;
    final static Double DEFAULT_WEIGHT = 0.5;
    public final String species;
    private Double weight;

    public Animal(String species) {
        this.species = species;

        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "cat":
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case "elephant":
                this.weight = DEFAULT_ELEPHANT_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_WEIGHT;
        }

    }

    void printWeight() {
        System.out.println(weight);
    }

    void feed(Double foodWeight) {
        weight += foodWeight;
        System.out.println("thx for food, bro");
        System.out.println("my weight is now " + weight);
    }

    String returnSpeciesAndName() {
        return species + " " + name;
    }

    String returnNameAndOwner(String owner) {
        return name + " " + owner;
    }

    @Override
    public boolean sell(Human seller, Human buyer, Double price) {
        if (seller.pet == this){
            if (buyer.cash >= price){
                buyer.cash -= price;
                buyer.pet = this;
                seller.pet = null;
                System.out.println("Pet has been sold");
                return true;
            }
        }

        System.out.println("The buyer does not have enough money");
        return false;
    }
}