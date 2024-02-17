package com.whatkinda.ch12.sec11.exam02;

public class Car {

    private String model;
    private String owner;

    public Car() {}

    public Car(String model, String owner) {
        this.model = model;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
