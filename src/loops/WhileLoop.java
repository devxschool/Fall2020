package loops;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        //Print out Hello World 10 times
        //when you have a set amount of iterations.
        //you have to use numbers in the condition.


        //loop, iteration, cycle all mean the same thing.
        int iteration = 1;

//        while (iteration < 10) {
//            System.out.println("Hello World");
//        }  ==> will enter infinite loop.


        while (iteration > 1) {
            System.out.println("Hello World");
        }//Not going to run at all bc the conditon was false
        //from the first iteration(loop).


        while (iteration <= 10) {
            System.out.println("Hello World");
            iteration++;//condition update expression.
        }


        int counter = 0;
        int amountOfTimes = 5;
                //5    <   5
        while (counter < amountOfTimes) {
            System.out.println("DevX");
            ++counter;
        }

        int counter1 = 1;

        while (counter1 <= 5) {
            System.out.println("DevX1");
            ++counter1;
        }



        System.out.println();

        //Java - 1
        //Java - 2
        //Java - 3
        int counter2 = 0;
        while (counter2 < 7) {
            //counter2++;
            System.out.println("JAVA " + ++counter2);
        }



        System.out.println();

        //calculate the sum of numbers from 1-12;
        //ex: 1+2+3+4+5+6+7+8+9+10+11+12

        int counter5 = 0;

        //keep outside of the loop
        int sum = 0;

        while (counter5 < 12) {
            //int sum = 0; => dangerous, bc before every iteration
            //sum will be reinitialized to 0.
            counter5++;
            System.out.print(counter5 + " + ");
            sum+=counter5;
        }


        //1+2+3+4+5+6+7+8+9+10+11+12 = 78;


        //ask to enter 5 exam scores
        //and print out the average score.

        //first ask the user how many scores you want to enter
        //10
        //ex: Enter Score 1
        //100
        //your average score is:

        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many scores do you want to enter?");
        int amountOfScores = sc.nextInt();
        int scoreCounter = 0;
        //calculate the sum of all scores.
        int allScoresSum = 0;

        while (scoreCounter < amountOfScores) {
            System.out.println("Enter Exam Score:");
            int score = sc.nextInt();
            allScoresSum+=score;
            scoreCounter++;
        }

        //use the result of the loop calculation outside of the loop.
        System.out.println("Your average score is - " + allScoresSum/amountOfScores);
    }
}
