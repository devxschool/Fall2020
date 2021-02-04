package oop.inheritence.abstractclass;

public abstract class Truck extends Vehicle{

    private String trailerModel;

    public Truck(String vin, String model, long mileage, String make, String color, String trailerModel) {
        super(vin, model, mileage, make, color);
        this.trailerModel = trailerModel;
    }


}
