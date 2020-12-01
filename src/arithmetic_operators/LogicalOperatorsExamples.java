package arithmetic_operators;

public class LogicalOperatorsExamples {

    public static void main(String[] args) {

        /**
         * Write an expression for all married male,
         * age between 21 and 35,
         * with height above 180,
         * and weight between 70 and 80.
         */

        //local variables do not have default values.

        boolean isMarried = true;
        int age = 30;
        int height = 181;
        int weight = 77;


        boolean isJamesBond = age >= 21 && age <= 35
                &&
                height > 180
                &&
                weight >= 70 && weight <= 80
                &&
                isMarried;

        System.out.println(isJamesBond);


        //with booleans we dont use == signs.
        //bc true == true => true;
        // true

        //false == true => false;
        //false;

        //boolean isMarried = false;
        // !isMarried  => negating

        /**
         * 2) Given the year, month (1-12), and day (1-31), write a boolean
         * expression which returns true for dates before
         * October15,2010 (Gregorian calendar cut-over date).
//         */
//        int year = xx;
//        int day = xx;
//        int month = xx;
//

    }
}
