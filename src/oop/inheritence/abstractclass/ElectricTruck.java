package oop.inheritence.abstractclass;

public class ElectricTruck extends Truck {

    public ElectricTruck(String vin, String model, long mileage, String make, String color, String trailerModel) {
        super(vin, model, mileage, make, color, trailerModel);
    }

    @Override
    public void startEngine() {

    }
}
