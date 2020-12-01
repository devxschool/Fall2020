package arithmetic_operators;

public class Constants {

    //class variables are defined on the class level
    //in order to be able to use a variable inside main method
    //that variable must be static

    //constant(final) variable must be named with all capital letters separated by _ in case of more than one words
    //it's a naming convention.
    //purpose is to visdsually see that the variable is constant
    static final char GENDER = 'F';
    static int population = 10000;

    public static void main(String[] args) {

        System.out.println(GENDER);
        population = 1000;

        System.out.println(population);
        //all variables that are created inside a method are called local variables

        //imagine a scenario where you want to assign one value to a variable
        //and you want to make sure that variable carries the same value
        //for the entire life of the program

        final int DOB = 1990; //final keyword can be put before the declaration of a variable
        //before the data type.
        //final variables can only be initialized once.

        System.out.println(DOB);
       //dob = 1995; will not compile bc cannot assign a value to final variable

        final String SSN;

        SSN = "499-33-5555";//able to assign a value bc it's the first time we are doing it
        //ssn = "12"; doesnt compile bc cannot assign a value to final variable more than once

        final char PLUS_SIGN = '+';
        final double PI = 3.14;

        System.out.println(GENDER);//in order to get to the declaration of a variable
        //we can hit cmd + click on a variable for mac
        //ctrl + click on a variable for windows


    }
}
