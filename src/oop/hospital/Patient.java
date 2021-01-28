package oop.hospital;

public class Patient {
    //static final int MAX;

    private final String dob;
    private String fullName;
    private char gender;
    private String phoneNumber;
    private final String nationality;

    public Patient(String dob, String fullName, char gender, String phoneNumber, String nationality) {
        this.dob = dob;
        this.fullName = fullName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }

//    public Patient(String dob, String fullName, char gender, String phoneNumber){
//        this.dob = dob;
//        this.fullName = fullName;
//        this.gender = gender;
//        this.phoneNumber = phoneNumber;
//        //hard coded value
//        this.nationality = "American";
//    }


    public Patient(String dob, String fullName, char gender, String phoneNumber){
        this(dob,fullName,gender,phoneNumber,"American");
    }


    public Patient(String fullName, char gender, String phoneNumber, String nationality){
        this("xx/xx/xxxx",fullName,gender,phoneNumber,nationality);
    }

    /**
     * Give user ability to create a Patient Object
     * without DOB
     * and without natiaonality
     *
     * default DOB should be - xx/xx/xxxx
     * default nationality should be - American
     * @param fullName
     * @param gender
     * @param phoneNumber
     */
    public Patient(String fullName, char gender, String phoneNumber) {
        this("xx/xx/xxxx",fullName,gender,phoneNumber);
    }


    //Instance variables are accessible anywhere in the class;

    /**
     * Prints out full info about a Patient
     *
     *
     */

    //if the dob is default do not include it in the patient info.
    public void printAllInfo(){
        System.out.println("Patient Info");
        System.out.println("Full name: " + fullName);
        System.out.println("Date of birth: " + dob);
        System.out.println("Gender: " + gender);
        System.out.println("phone: " + phoneNumber);
    }


    //return the age of the patient
    //return 0 for default ages xx/xx/xxxx
    public int getAge(){
        //01/22/1994
        int year = Integer.parseInt(dob.substring(dob.lastIndexOf("/")+1));
        return 2021 - year;
    }
}
