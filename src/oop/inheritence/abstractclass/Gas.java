package oop.inheritence.abstractclass;

public class Gas extends Car {
    //miles per gallon
    private double mpg;

    public Gas(String vin, String model, long mileage, String make, String color, double mpg) {
        super(vin, model, mileage, make, color);
        this.mpg = mpg;
    }

    public void drive() {
        System.out.println("Using Gas to drive");
    }

    public void print(){
        System.out.println("Gas");
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    @Override
    public void startEngine() {

    }

    @Override//changing how this behavior(method) works
    public String getMake() {
        System.out.println("Child Class");
        return "Child";
    }
}