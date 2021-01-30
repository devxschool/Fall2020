package oop.hospital;

public class Patient {
    //static final int MAX;

    //Patient phoneNumbers should only be assigned number which meet the following format
    //ddd-ddd-dddd

    //static variable are global variables.
    static final int ibuprofenPrice = 120;
    static int advilPrice = 10;
    private static int halls = 5;

    private final String dob;
    private String fullName;
    private char gender;
    private String phoneNumber;
    private final String nationality;
    private double balance;
    private boolean married;

    /**
     * C
     *
     * @param dob
     * @param fullName
     * @param gender
     * @param phoneNumber
     * @param nationality
     */
    public Patient(String dob, String fullName, char gender, String phoneNumber, String nationality) {
        //give initial state of an object.
        this.dob = dob;
        this.fullName = fullName;

        if (gender == 'M' || gender == 'F' || gender == ' ') {
            this.gender = gender;
        } else {
            System.out.println("No such gender exists: " + gender);
            System.out.println("Choose a valid gender by calling setGender method");
        }
        //nnn-nnn-nnnn
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


    public Patient(String dob, String fullName, char gender, String phoneNumber) {
        this(dob, fullName, gender, phoneNumber, "American");
    }


    public Patient(String fullName, char gender, String phoneNumber, String nationality) {
        this("xx/xx/xxxx", fullName, gender, phoneNumber, nationality);
    }

    /**
     * Give user ability to create a Patient Object
     * without DOB
     * and without natiaonality
     * <p>
     * default DOB should be - xx/xx/xxxx
     * default nationality should be - American
     *
     * @param fullName
     * @param gender
     * @param phoneNumber
     */
    public Patient(String fullName, char gender, String phoneNumber) {
        this("xx/xx/xxxx", fullName, gender, phoneNumber);
    }


    //Instance variables are accessible anywhere in the class;

    /**
     * Prints out full info about a Patient
     */

    //if the dob is default do not include it in the patient info.
    public void printAllInfo() {
        System.out.println("Patient Info");
        System.out.println("Full name: " + fullName);
        System.out.println("Date of birth: " + dob);
        System.out.println("Gender: " + gender);
        System.out.println("phone: " + phoneNumber);
        System.out.println("Balance: " + balance);
    }


    //return the age of the patient
    //return 0 for default ages xx/xx/xxxx
    public int getAge() {
        //01/22/1994
        int year = Integer.parseInt(dob.substring(dob.lastIndexOf("/") + 1));
        return 2021 - year;
    }

    //which ever patient object will call this method
    //we will change their number
    public void changeNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    //Updates balance
    //Charge Patients if they orderMedicine
    //if the medicine is Ibuprofen patient needs to charged $120
    //if the medicine is Advil patient needs to be charged $10
    //if the medicine is halls charge $5
    //if we dont sell the medicine Say we dont have that medicine.

    public void orderMedicine(String medicine) {
        switch (medicine) {
            case "Ibuprofen":
                this.balance += ibuprofenPrice;
                break;
            case "Advil":
                this.balance += advilPrice;
                break;
            case "Halls":
                this.balance += halls;
                break;
            default:
                System.out.println("We do not have such medicine");
        }
    }


    //pay partial balance
    public void payBalance(double amount) {
        if (amount > this.balance) {
            System.out.println("We charge you " + amount + ". Your balance is: " + this.balance);
            amount -= this.balance;
            System.out.println("Your change is " + amount);
            this.balance = 0;
        } else {
            this.balance -= amount;
        }
    }

    /**
     * Mutator method
     * Just call it setter method.
     * it updates the desired instance variable
     * after the value gets checked.
     *
     * @param gender
     */
    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F' || gender == ' ') {
            this.gender = gender;
        } else {
            System.out.println("No such gender exists: " + gender);
        }
    }

    public char getGender(){
        return gender;
    }


    public String getDob() {
        return dob;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    //////sdfsdfsdf
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
