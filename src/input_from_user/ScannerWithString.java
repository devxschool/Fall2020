package input_from_user;

import java.util.Scanner;

public class ScannerWithString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your address");
        //123 main st
        String address = input.nextLine();

        //difference between input.next() and input.nextLine() for
        //next() ->  a single word until first whitespace.
        //nextLine() -> you can enter big sentences here.

        System.out.println("Enter your gender -> m for male, f for female");
        //get the first word and out of the first word get it's first char
        char gender = input.next().charAt(0);

        System.out.println("Address entered: " + address );
        System.out.println("Gender entered: " + gender);
    }
}
