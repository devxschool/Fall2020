package methods;

public class MethodDesign1 {

    //nothing besides package, import statement can be outside class scope.
    //any method will have to be outside of main method but inside a class
    public static void main(String[] args) {

        //we can call methods inside other methods.
        //in this case we are calling(use) printSumOfTwoNumbers methods inside main method.
        //main method is static method so we can call printSumOfTwoNumbers method
        //directly.
//        System.out.println(10);
//        System.out.println(2);
//        System.out.println(34);
//        System.out.println(534);

        System.out.println("Adding two numbers together: " + (2 + 10));
        System.out.println("Adding two numbers together:" + (534 + 34));
        System.out.println("Adding two numbers together:" + (12 + 34));


        printSumOfTwoNumbers(2,10);
        printSumOfTwoNumbers(534,34);
        printSumOfTwoNumbers(12,34);

        printHello();
        printHello();

        System.out.println("Multiplication");
        //   <===  multiply(3.2,6.4);
        double result = multiply(2,43);
        System.out.println(result);

        System.out.println(multiply(10,9));

        System.out.println("----------");
        double resultOFConversion = convertCtoF(10.5);
        System.out.println(resultOFConversion);

        //calculate the average temp of 4 days
        //in F given C.

        double day1TempInC = 18;
        double day2TempInC = 20;
        double day3TempInC = 14;
        double day4TempInC = 22;

        //compare the temps?

        double day1F = convertCtoF(day1TempInC);
        double day2F = convertCtoF(day2TempInC);
        double day3F = convertCtoF(day3TempInC);
        double day4F = convertCtoF(day4TempInC);

        double averageTempInF = (day1F+day2F+day3F+day4F)/4;





        System.out.println(averageTempInF);


       double result2 = convertCtoF(20);

       login("TestUser", "BadPassword");
       login("Demo", "TestPassword");

    }

    /**
     * We dont have to put return statement bc the return type is void
     */
    public static void printSumOfTwoNumbers(int num1, int num2) {
        //in method body we can put
        //as many statements as we need to
        System.out.println("Adding two numbers together: " + (num1 + num2));
    }

    public static void printHello() {
        System.out.println("Hello World");
    }

    //create a method(function) which return multiplication of two numbers
    //1. do we need to return int, double or what? -> double
    //2. do we need to multiply intgers, doubles? -> double
    public static double multiply(double num1, double num2) {
        double product = num1 * num2;
        return product;
    }

    //convert Celcius to F
    //(C * 9/5) + 32 = F;

    public static double convertCtoF(double c) {
        double f = (c * 9/5) + 32;
        return f;
    }

    //Login functionality
    //user should be successfully logged in if the given user name is "Demo"
    //and password is "TestPassword"

    //so for successful login print out Success
    //otherwise printout "Failure"

    //print out inside a method



    public static void login(String username, String password) {
        if (username.equals("Demo") && password.equals("TestPassword")) {
            System.out.println("Success");
        }
        else {
            System.out.println("Failure");
        }
     }
}
