package oop.classes;

import java.util.Set;

//one java file can have multiple classes
//there can only be one public class.
//Entity means one object.
//We have created our own data type.
public class Candidate {
    //Every Entity must have some characteristics
    //aka state.
    //instance variables define an object characteristics
    String name;
    int yearsOfExperience;
    boolean hasEad;
    char gender;
    Set<String> skills;
    String phoneNumber;
    String email;

    /**
     * Constructor is a special method that is used to
     * initialize instance variables, it's also used to
     * force the users of the class to provide required info.
     *
     * constructor can be used preceded by new keyword.
     * ex: new Candidate();
     *
     * Constructor params are no different than method params.
     */
    public Candidate() {
        System.out.println("Calling a constructor 123");
    }

    /**
     * Constructor overloading -different params;
     *
     * demonstrating:
     * Constructor is a special method that is used to
     * initialize instance variables, it's also used to
     * force the users of the class to provide required info.
     */
    public Candidate(String fullName, String emailAddress, int years){
        System.out.println("Creating a Candidate Object with three params");
        name= fullName;
        yearsOfExperience = years;
        email = emailAddress;
    }
}


class Mentor{
    public Mentor(){

    }
}