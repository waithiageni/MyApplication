package com.example.oop;

public class Taxi extends Car {

    private int maximumPassengers;

    public Taxi(String color, String bodyType, int doors, int speed) {
        super(color, bodyType, doors, speed);
    }

    public Taxi(String color, String bodyType, int doors, int speed, int maximumPassengers) {
        super(color, bodyType, doors, speed);
        this.maximumPassengers = maximumPassengers;
    }
}
