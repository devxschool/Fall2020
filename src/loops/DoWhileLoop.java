package loops;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        boolean run = false;

        while (run) {
            System.out.println("Run Forest Run");
        }

        int counter = 0;

        while (counter > 1) {
            System.out.println("Run Forest Run");
        }

//        do { //execute the body without checking the conditions once in
//            //the first iteration
//            //then check the condition.
//
//            //body of the loop
//        }while ()//condition);

        boolean run1 = false;
        do {
            System.out.println("Run Forest Run3");
        } while (run1);


        int counter1 = 0;

        do {
            System.out.println("Run Forest Run4");
        } while (counter1 > 1);


        //print out Run Forest Run 5 times

        int counter2 =0;

        do {
            System.out.println("Run Forest Run!");
            counter2++;//condition update
        }while (counter2 < 5);





        Scanner sc = new Scanner(System.in);
        //do we need to run it at least once?
        //variable declared in the loop body are not visible on the
        //condition level.

        int allScores = 0;
        int counter4 = 0;

        String answer = "";
        //I need validate if the score is in the range of 0-100
        //if not give an error and stop the program
         do {
            System.out.println("Please enter test result");
            int score = sc.nextInt();

            if(score > 100 || score < 0) {
                System.err.println("Invalid range");
                System.exit(1);
            }

            allScores+=score;
            sc.nextLine();
            System.out.println("Do you want to add another score?");
            answer = sc.nextLine().trim();
            ++counter4;
        }while (answer.equalsIgnoreCase("yes"));

        System.out.println("Average: " + allScores/counter4);


        //HomeWork -> Create two Strings one for username
        //        //second for password
        //
        //        //String username = "JohnDoe@tesla.com"
        //        //String password = "HardP@$$"
        //
        //        //create a program which takes input fro username and pass from user(scanner).
        //
        //        //check if username and password are valid(match). -> if they are valid -> say Logged in.
        //        //if the user enters the invalid password 3 times. We dont count invalid User name inputs.
        //        //Print out account is blocked.
        //        //Hint: use Do while.
    }
}
