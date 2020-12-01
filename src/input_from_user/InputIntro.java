package input_from_user;

//Scanner class is located inside java.util package
//so we have to include imports.

import java.util.Scanner;

public class InputIntro {

    public static void main(String[] args) {


        //Taking input from users?
        //When on website they ask you to enter something.
        //input when users enter the values.

        //We will have data types and variables
        // but their initialization will be done by users.

        //static ->
        //we want all of our programs to be super dynamic.


        //It can be achieved by using Scanner class from JDK.

        //Scanner sc = new Scanner(System.in);
        //Scanner scanner = new Scanner(System.in);
        //Scanner input = new Scanner(System.in);

        //System.in means taking the input from console.
        //Create scanner object(variable) only once per class;
        Scanner sc = new Scanner(System.in);

        //we can use all primitive data types besides char
        //char can be used directly
        //char we can use but will do a workaround


        System.out.println("Please enter an integer value");
        //green part is executed by scanner class
        int  num = sc.nextInt();


        //black part by System.out.println
        System.out.println(num);


        /**
         * Write an expression for all unmarried male,
         * age between 21 and 35,
         * with height above 180,
         * and weight between 70 and 80.
         */

        //local variables do not have default values.

        System.out.println("Are you married? Enter true for yes, false for no");
        boolean isMarried = false;

        System.out.println("Enter your age");
        int age = sc.nextInt();

        int height = 181;

        int weight = 77;


        boolean isJamesBond = age >= 21 && age <= 35
                &&
                height > 180
                &&
                weight >= 70 && weight <= 80
                &&
                !isMarried;

        System.out.println(isJamesBond);
    }
}
