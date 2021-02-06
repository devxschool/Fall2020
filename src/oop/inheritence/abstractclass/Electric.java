package oop.inheritence.abstractclass;

public class Electric extends Car {

    private int batterRange;

    public Electric(String vin, String model, long mileage, String make, String color, int batterRange) {
        super(vin, model, mileage, make, color);
        this.batterRange = batterRange;
    }

    @Override
    public void drive() {
        System.out.println("Using battery to drive");
    }

    public int getBatterRange() {
        return batterRange;
    }

    public void setBatterRange(int batterRange) {
        this.batterRange = batterRange;
    }

    @Override
    public void startEngine() {

    }
}
