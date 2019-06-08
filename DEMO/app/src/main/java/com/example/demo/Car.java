package com.example.demo;

public class Car {
    private String color;
    private String bodyType;
    private int doors;
    private int speed;

    public Car(String color, String bodyType, int doors, int speed) {
        this.color = color;
        this.bodyType = bodyType;
        this.doors = doors;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
