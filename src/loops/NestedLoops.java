package loops;

public class NestedLoops {


    public static void main(String[] args) {

        //Nested Loops
        //Loops inside another loop.

        //outer for, while.
        //inner for, while
        //can be used in any combination,
        //while inside while
        //for inside for
        //for inside while
        //while inside for

        for (int x = 0; x < 4; x++) {

        }

        //for inside for
        //outer for
        //the variable of an outer loop is fully accessible inside
        //the inner for loop.
        for (int i = 0; i < 5; i++) {
            //inner for is designed to run 4 times
            for (int x = 0; x < 4; x++) {
                System.out.println("i = " + i + " x = " + x);
            }
        }
        //inner loop will run it self completely once for every iteration of the outer loop
        //inner loop starts itself from beginning for every iteration of the outer


//outer loop should be between 5 and 6
        // ==========================

        //5 * 1 = 5
        //5 * 2 = 10
        //5 * 3 = 15
        //5 * 4 = 20
        //5*10=50
        // ==========================

        //6 * 1 = 6
        //6 * 2 = 12
        //6 * 3 = 18
        //6 * 4 = 24
        // ==========================

//
//        for (int a = 5; a <= 6; a++) {
//            System.out.println(a + " * 1 = " + (a * 1));
//            System.out.println(a + " * 2 = " + (a * 2));
//            System.out.println(a + " * 3 = " + (a * 3));
//            System.out.println(a + " * 4 = " + (a * 4));
//            System.out.println(a + " * 5 = " + (a * 5));
//            System.out.println(a + " * 6 = " + (a * 6));
//            System.out.println(a + " * 7 = " + (a * 7));
//            System.out.println(a + " * 8 = " + (a * 8));
//            System.out.println(a + " * 9 = " + (a * 9));
//            System.out.println(a + " * 10 = " + (a * 10));
//        }

        //starting point should 5
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.println(a + " * " + b + " = " + (a * b));
            }
            System.out.println("=================================");
        }

        //How many numbers I need create a table for?
        //How many times I need execute certain statement?
        //the multiplication of number of iteration of a outer loop and inner loop will be the number
        //of total iteration of the inner loop.



        //# # # # #
        // # # # # #
        //# # # # #
        // # # # # #
        //# # # # #
    }
}
