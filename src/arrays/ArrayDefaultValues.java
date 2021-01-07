package arrays;

public class ArrayDefaultValues {

    public static void main(String[] args) {
        //as soon as we initialize an array
        //java will create an array with the given size
        //which will contain default values of the data type of
        //an array.
        double[] employees = new double[20];
        employees[0] = 100_000.00;
        employees[1] = 130_000.00;
        employees[2] = 120_000.00;
        employees[3] = 110_000.00;
        employees[4] = 115_000.00;
        employees[5] = 112_000.00;

        System.out.println(employees[4]);
        //0.0 => default of a double.
        //if the array was an int[] it would be 0
        System.out.println(employees[10]);


        String[] animals = new String[5];
        animals[0] = "Dog";

        System.out.println(animals[0]);
        //null is a default value of all non-primitive data types.
        System.out.println(animals[3]);
        //what does null represent?
        //null

        System.out.println(animals.length);
        //since we are using String arrays we are accessing
        //a String.
        //the method a
        System.out.println("-----");
        System.out.println(animals[4].length());

        System.out.println("SDET");



    }
}
