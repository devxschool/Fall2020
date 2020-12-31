package loops;

public class ForLoop {

    public static void main(String[] args) {

        //print out Hello World 5 times
        //using for loop.

        int i = 0;//initialization
        while (i < 5) {//booleanExpression
            System.out.println("Hello World");
            i++;//updateStatement
        }


        //is not always guaranteed to run
        for (int count = 0; count < 0; count++) {
            System.out.println("Hello From For Loop");
        }

        //count is a local variable inside for loop.
        for (int count = 0; count < 5; count++) {
            System.out.println("Hello From For Loop");
        }


        //print out
        //DevX School 1
        //DevX School 2
        //DevX School 3
        //DevX School 4
        //DevX School 5

        int x = 1;

        while (x <= 5) {
            System.out.println("DevX School " + x);
            x++;
        }

        //for(initialization, booleanExpression, updateExpression)

        for (int y = 1; y <= 5; y++) {
            System.out.println("DevX School " + (y));
        }


        //Google 5
        //Google 4
        //Google 3
        //Google 2
        //Google 1


        //iteration -> cycle.
        //initialization -> in the context of variable means assign a value
        //for the first time

        //initialization -> in the context of loops means
        //starting point.
        for (int j = 5; j >= 1; j--) {
            System.out.println("Google " + j);
        }


        //sum of numbers from 1-10
        //1+2+3+4+5+6+7+9+10
        int sum = 0;
        //you should only create variables
        //that are used for the boolean expression
        //of the loop in the loop (Signrature)

        for (int z = 1; z <= 10; z++) {
            sum+=z;//sum = sum+z;sum = 0 + 1;, sum = 1 + 2; sum = 3+3; sum = 6 + 4;
        }

        System.out.println(sum);

        //to find first 10 fibonacci numbers.
        //1 1 2 3 5 8 13 21 34 55.
    }
}
