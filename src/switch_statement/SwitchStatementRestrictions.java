package switch_statement;

import java.util.Scanner;

public class SwitchStatementRestrictions {

    public static void main(String[] args) {

        //
        System.out.println("Enter an animal");
        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine();

//        switch (animal) {
//            System.out.println("Hello world");  ==> cannot be executed, only cases are allowed inside switch
//        }


        final String CHKN = "Chicken"; //value of a final variable cannot be changed.

        switch (animal) {
            case CHKN:// only constant values are allowed.
                System.out.println("Domestic");
                break;
        }
        //list of constant values: literals, and final variables, ENUMs.
        //literals -> values that are used to initialize a variable.
        //4,5,612, 'c', "sfkddskn". true or false


//        switch (animal) {
//            case 1:  not allowed bc 1 and animal are different data types
//                System.out.println("Integer");
//        }


        //example tell me the day of the week given a number from 1 -7
        //1 -> Monday
        //2 -> Tueday


        System.out.println("Enter the week day in number");
        int weekDayInNum = sc.nextInt();

        switch (weekDayInNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");

        }


        //tell me which days left after the given day

        switch (weekDayInNum) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
        }


        //given a day in word ex: Monday, Tuesday etc.
        //tell if it's a weekday or a weekend
        //ex: Enter a day
        //Wednesday  --> user input
        //Weekday -> output


        //given a day in both word and in number ex: Monday, Tuesday, 2,3,4,7 etc.
        //tell if it's a weekday or a weekend

        //ex: Enter a day in number or word
        //7
        //Weekend

        //ex: Enter a day in number or word
        //Saturday
        //Weekend



        //Mercedes -> C,E,S,G

        ///Ask a user to choose a class
        //C class should list "C230", "CLK320", "C65 AMG".
        //E class should list "E350", "E55 AMG", "E65 AMG"
        //S class should list "S500", "S550", "S65 AMG"
        //G class should list "G550" ,"G63 AMG", "G65 AMG"

        //if not a valid class say unsupported Mercedes Class.


        System.out.println("Enter your gender");
         char gender = sc.next().charAt(0);

        switch (gender) {
            case 'F':
                System.out.println("Go to second floor");
                break;
            case 77: //technically you can but use 'M' instead in real world.
                System.out.println("Go to first floor");
                break;
        }


//        final double price = 12.0;
//        long distance = 100;
//        boolean answer = true;
//        float n = 12.22f;
//        switch (n){
//                     ==> non of the above data types are supported by switch.
//        }

    }
}
