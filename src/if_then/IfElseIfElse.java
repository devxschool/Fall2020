package if_then;

public class IfElseIfElse {

    public static void main(String[] args) {

        //if else

        //find out if the given number is even or odd?
        //even number is a number divisible by 2 with 0 remainder

        int num = 11;

        if ( num % 2==0 ) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }


        //Work in labor department
        //we need write a program which tells
        //if the person is eligible to work.

        //people from age of 18 till 60 are eligible to work

        //if the person is too young to work
        //say You are a minor
        // not eligible to work

        //if person is eligible to work
        //say you are eligible to work
        //please fill out the application

        //if person is too old
        //say you are a senior
        //Please collect your pension

        int age = 38;

        //in if condition we can only have booleanExpression.
        //so whatever you eventually what you inside () must return boolean
        if (age >= 18 && age <= 60) {
            System.out.println("You elible to work");
            System.out.println("Fill out the application");
        } else if(age < 18) {
            System.out.println("You are a minor");
            System.out.println("Not eligible to work");
        }
         else {
            System.out.println("You are senior");
            System.out.println("Please collect pension");
        }



        //calculate my tax.
        //salary

        //we need tell the user how much tax they need pay.

        //if salary is less than or equal to60,000 => tax is 10%
        //if salary is more than 60,001 and less than or equal to 100,000 => 20%
        //if salary is more than 100,001 you pay => 25%

        //ex: 100000
        //printout you need to pay 25000



        //second

        //calculate my tax.
        //get marital status
        //salary

        //we need tell the user how much tax they need pay.

        //if married and salary is less than or equal to 60,000 => tax is 5%
        //if married and salary is more than 60,001 and less than or equal to 100,000 => 15%
        //if married and salary is more than 100,001 you pay => 20%

        //if not married and salary is less than or equal to60,000 => tax is 10%
        //if not married and salary is more than 60,001 and less than or equal to 100,000 => 20%
        //if not married and salary is more than 100,001 you pay => 25%


        //ex: 100000
        //printout you need to pay 25000

    }
}
