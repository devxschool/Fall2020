package exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeExceptions {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] a = new int[2];

        try {
            sc.nextInt();

            a[3]=0;


        }
        catch (InputMismatchException e) {
            System.out.println("There was a mismatch in the input please enter number");
        }
        //Parent class exceptions can handle child class exceptions.
        catch (IndexOutOfBoundsException e) {
            System.out.println("Hey you can not use index more than "+ (a.length-1));
        }


//
//        try {
//            sc.nextInt();
//
//            WriteFile.writeToFile("dfgdfgdfg");
//
//
//            System.out.println("First Try");
//        }
//        catch (InputMismatchException e) {
//            System.out.println("There was a mismatch in the input please enter number");
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println("Hello World");
    }
}
