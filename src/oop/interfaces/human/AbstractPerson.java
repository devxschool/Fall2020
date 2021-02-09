package oop.interfaces.human;

public abstract class AbstractPerson implements Human, Health {

    private double foodConsumed;
    private double weight;

    public AbstractPerson(double foodConsumed, double weight) {
        this.foodConsumed = foodConsumed;
        this.weight = weight;
    }

    public double getFoodConsumed() {
        return foodConsumed;
    }

    public double getWeight() {
        return weight;
    }
}


////We wanted to create an app for men and women
//We wanted for this man and women to have same functions.
//so we created an interface which both man and women must have
//also we created an AbstractPerson class which implements Human interface.
//but it's primary purpose is to put common characteristics of concrete classes. Man and Women.
//and at the same time not to worry about the abstract methods that are inherited form the Human interface.
