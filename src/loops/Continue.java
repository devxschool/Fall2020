package loops;

public class Continue {


    public static void main(String[] args) {
        //continue -> is used only inside loops
        //when java sees continue statement
        //it means the current loop will jump to the next
        //iteration skipping the part which comes after the continue
        //statement in the loop.


        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");

            if (i == 3) {
                continue;//jump to next loop
            }
            System.out.println("Ending of Loop " + i);
            System.out.println("WWW");
            System.out.println("John Doe");
        }


        System.out.println();


        //print out odd numbers from 0-100
        //continue is used to skip so part of the loop
        //for the performance's sake.
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }


        //print all champions from 2000 2030

        for (int i = 2000; i < 2030; i++) {
            if (i == 2020) {
                System.out.println("No champions due to social distancing");
                continue;
            }

            System.out.println("Champion of " + i + " some team name");
        }
    }
}
