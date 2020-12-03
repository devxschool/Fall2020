package if_then;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        //if the number is positive or negative
        int num = 10;

        if (num >= 0) {
            System.out.println("Positive");
        }

        //java always compares this if for negative number
        //regardless of the first if statement result
        //so both if statement are completely independent from each other.
        if (num < 0) {
            System.out.println("Negative");
        }


        //if statement get compared no matter what
        //since it's the beginning of the if and else statement.
        if(num >= 0) {
            System.out.println("Positive 2");
        }
        //else statement's execution will depend on the first if statements
        //result
        //so if first if statement returns true then else is skipped
        //if first if statement returns false else is executed.
        else {
            System.out.println("Negative");
        }



        //print out sleep if today is weekend
        //or I am on vacation

        boolean isWeekday = true;
        boolean onVac = false;

        if (!isWeekday || onVac) {
            //send work related email.
            System.out.println("Sleep");
        }
        //else means in case of all unhandled scenarios
        else {
            System.out.println("Wake up");
        }


        //we cant start else without a preceding if.
//        else {
//
//        }


        //zelle application
        //write a logic to approve money transfer
        //reqs: must have enough balance
        //transfer amount should not be more than 800

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your balance?");
        double balance = sc.nextDouble();
        System.out.println("Enter transfer amount");
        double transactionAmount = sc.nextDouble();

        double transcationLimit = 800;

        //&& vs || and & vs && and | vs ||?
        //performance of an application
        if (transactionAmount <= transcationLimit && balance >= transactionAmount) {
            System.out.println("Transfer success!");
            balance -= transactionAmount;//balance = balance - transcationAmount;
        } else {
            System.out.println("Transfer declined");
        }

        System.out.println("Balance: " + balance);


//        if (balance >= transactionAmount && transactionAmount <= 800) {
//            System.out.println("Transfer success!");
//        }
//
//        if(balance < transactionAmount || transactionAmount > 800) {
//            System.out.println("Transfer declined");
//        }
    }
}
