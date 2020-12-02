package input_from_user;


import java.util.Scanner;

/**
 * We want to ask the user(customer)
 * to enter description of an item(cucumber, ice-cream)
 * amount of items
 * and it's price
 *
 * we have to print everything out in one line
 *
 * tax: 12%
 *
 * EX:
 *     2 Cucumbers $1.99 each
 *     Subtotal: $3.98;
 *     Tax: $0.39
 *     Total: $4.47
 */
public class CashierProgram {

    public static void main(String[] args) {

        //We are creating scanner
        Scanner sc = new Scanner(System.in);

        //declaring a variable
        //it has to have it's own
        //non-primitive data
        //initialization;
        //assigning a value to a variable for the first time
        //terminologies
        String str = sc.nextLine();
        System.out.println("1: " + str);


        //difference between next() vs nextLine();
        //next() takes only first word of a sentence from user.
        //nextLine() takes whole sentence only one line




        //declaring a variable
        //data type
        int num = 10;

        //what problem variables solve?
        //we are giving name to information.
        //variable store information.
        //and the type of the information will
        //depend on the data type.


    }
}
