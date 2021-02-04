package oop.inheritence.abstractclass;

public abstract class Vehicle {

    private String vin;
    private String model;
    private long mileage;
    private String make;
    private String color;


    public Vehicle(String vin, String model, long mileage, String make, String color) {
        this.vin = vin;
        this.model = model;
        this.mileage = mileage;
        this.make = make;
        this.color = color;
    }

    public abstract void startEngine();

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
