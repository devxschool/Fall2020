package methods;

import java.util.Scanner;

public class MethodsWithSwitch {

    public static void main(String[] args) {
        System.out.println(getAnimalKind("cat"));
        String str = getAnimalKind("tiger");//you have to use the result once you call the method.
        System.out.println(str);

        if (getAnimalKind("dog").equals("Domestic")) {
            //do something.
        }

        //we are printing out the result of caluculateBonus method which
        //should calculate the bonus for 323232 salary 2 year experience.
        double result = calculateBonus(2, 100_000); //IDE
        System.out.println(result);
        System.out.println(calculateBonus(1, 100_000));
        System.out.println(calculateBonus(5, 150_000));
        System.out.println(calculateBonus(5, 120_000));


        printAnimalType("tiger");
    }


    //write a method that return domestice for domestic animals
    //and wild for wild animals
    //take animal as String
    public static String getAnimalKind(String animalType) {
        switch (animalType.toLowerCase()) {
            case "cat":
            case "chicken":
            case "horse":
            case "dog":
                return "Domestic";//also acts like break
            case "tiger":
            case "snake":
            case "hippo":
            case "rhino":
                return "Wild";
            //default is equivalent to else
            default:
                return "Unknown animal";
            //optional break
        }
    }


    //variables -> store information
    //parameters => they act like variable inside a method
    //they are specified in parenthesis after name
    //what their usage?
    //in order to execute this method(job) we need to provide required info.
    //params are required info for this job to be able to execute.

    public static void test() {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int num = sc.nextInt();
    }

    //Bonus with years of service
    //take salary and years of service from the user
    //return their expected bonus

    //for years less than 2 give 5% bonus
    //for years more than or equal 2 give 10%

    //what it the yearOFService is negative?
    //print out error message and return 0;

    //how many years do you want to consider?
    //it's more than 30 years then printout we can no longer offer you bonus and return 0;

    public static double calculateBonus(int yearsOfService, double salary) {
        if (yearsOfService < 5) {
            return salary * 5 / 100;
        } else {
            return salary * 10 / 100;
        }
    }


    public static void printAnimalType(String animalType) {
        switch (animalType.toLowerCase()) {
            case "cat":
            case "chicken":
            case "horse":
            case "dog":
                System.out.println("Domestic");//also acts like break
                break;
            case "tiger":
            case "snake":
            case "hippo":
            case "rhino":
                System.out.println("Wild");
                break;
            //default is equivalent to else
            default:
                System.out.println("Unknown animal");
                //optional break
        }
    }
}
