package oop.staticvsinstance;

public class Car {
    //instance initializer;
    //the purpose is to initialize default values of instance variables;
    {

    }


    //to keep the code cleaner
    //when there is a task to use hard coded values within the class
    //more than once.
    private static final String MESSAGE = "Hello Car Buyer";

    //share info between all objects.
    //static variable contains a value that is exactly the same for all objects.
    //if it's updated it's updated to all objects.
    public static int count = 0;

    //instance variable are characteristics of each car that are unique to each
    private long vin;
    private String plateNumber;
    private String make;
    private String model;


    public Car(long vin, String plateNumber, String make, String model) {
        this.vin = vin;
        this.plateNumber = plateNumber;
        this.make = make;
        this.model = model;
        System.out.println(MESSAGE);
        count++;
    }

    public long getVin() {
        return vin;
    }

    public void setVin(long vin) {
        this.vin = vin;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        System.out.println(MESSAGE);
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
