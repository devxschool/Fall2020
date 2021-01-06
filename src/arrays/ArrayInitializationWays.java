package arrays;

public class ArrayInitializationWays {


    public static void main(String[] args) {
        String[] cars = {"Mercedes", "BMW", "Porche", "Ferrari"};
        System.out.println(cars[1]);

        for (int i = 0; i<4; i++) {
            System.out.println(cars[i]);
        }

        //create an array which will have days of week as String.
        //ex: Monday,Tuesday

        //using this array write a logic which would print out weekdays only
        //using this array write a logic which would print out weekends only


        //every single unit(element) have default values
        //of the array data type. int => 0;
        int[] nums = new int[5];
        System.out.println(nums[1]);


        for (int i=0; i<5; i++) {
            System.out.println(nums[i]);
        }


        String[] animals = new String[7];
        System.out.println(animals[0]);
        for (int i=0; i <7; i++) {
            System.out.println(animals[i]);
        }

        animals[0] = "Horse";

        System.out.println(animals[0]);

        animals[0] = "Cow";//reassign
    }
}
