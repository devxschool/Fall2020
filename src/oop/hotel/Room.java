package oop.hotel;

import java.util.Map;

public class Room {

    //these are going to be instance variables of the object.
    int beds;
    int baths;
    Map<String, Integer> bedTypes;
    boolean isAvailable;
    int number;

    //what are constructors?
    //is a special method that we use to initialize the instance variables
    //Constructors are used to force the class users to provide the required information
    //before they are able to use this data type(before they are able to initialize an object
    //from this class.

    //constructors can be overloaded as well.
    //Constructor is a special method that matches the name of the class and
    // has no return type.
    //no arg constructor
//    public Room(){
//
//    }

    public Room(int number, int beds, int baths, Map<String, Integer> bedTypes, boolean isAvailable) {
        this.beds = beds;
        this.baths = baths;
        this.bedTypes = bedTypes;
        this.isAvailable = isAvailable;
        this.number = number;
//        System.out.println("calling constructor");
//        System.out.println("beds " + beds);
//        System.out.println("baths " + baths);
//        System.out.println("bedTypesMap " + bedTypes);
//        System.out.println("isAvailable " + isAvailable);

        //establishes the initial state of a particular Room object.
        //this keyword to initialize an instance variable in our constructor.
        //if you use different variable names in the params.
    }
}
