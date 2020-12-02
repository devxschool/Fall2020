package input_from_user;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        // Convert gallons to liters
        // I want to have many liters in any amount of gallon
        // without making any code changes.
        Scanner sc = new Scanner(System.in);

        System.out.println("How many gallons do you want to convert to liters?");
        //bc gallons can be decimal ex: 1.5 gallons.
        double gallon = sc.nextDouble();
        double litersInAGallon = 3.78541;
        double result = litersInAGallon * gallon;

        System.out.println(result);

    }
}
