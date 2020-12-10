package switch_statement;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class FirstSwitch {


    public static void main(String[] args) {
        //User needs input -> cat, dog, tiger, snake

        //we should tell user if the animal is Domestic or wild animal
        //Chicken, Horse, Cat, Dog.

        //Tiger, Snake, Hippo, Rhino
        //Rhino attacks you -> try not to move.
        //

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter animal");

        String animal = sc.nextLine();//next() vs nextLine() -> "Hippo", "White Shark"


//        if (animal.equalsIgnoreCase("Chicken") || animal.equalsIgnoreCase("Cat") || animal.equalsIgnoreCase("Dog") || animal.equalsIgnoreCase("Horse")) { //|| //&&
//            System.out.println("Domestic from if");
//        }
//        else if (animal.equalsIgnoreCase("Tiger") || animal.equalsIgnoreCase("Snake") || animal.equalsIgnoreCase("Hippo") || animal.equalsIgnoreCase("Rhino")) {
//            System.out.println("Wild from else if");
//        }
//        else {
//            System.out.println("Unknown animal from else");
//        }


        //inside switch parantesis we need use a variable that we want to compare.
        //we are telling compare this animal value to the following cases
        //switch statement only and only uses == or .equals comparison operators. not .equalsIgnoreCase()
        switch (animal) {
            //case followed by a constant value and :
            case "Chicken":
                //put the body, block, work.
                System.out.println("Domestic");
                //break to finish the body of a case.
                break;//break out of the whole switch.
            case "Cat":
                System.out.println("Domestic");
                break;
            case "Dog":
                System.out.println("Domestic");
                break;
            case "Horse":
                System.out.println("Domestic");
                break;
            case "Tiger":
                System.out.println("Wild");
                break;
                //default is equivalent to else
            default:
                System.out.println("Unknown animal from else");
                //optional break
                break;
        }

        System.out.println("End of the switch");
        System.out.println("More stuff");


        switch (animal) {
            //break statement is totally optional.
            //what happens if the case doesnt have break statement?
            //java is going to execute the body of the case if it has anything and jump to the body of the next
            //case top to bottom and executes the body of the next case.

            case "Chicken":
                System.out.println("Domestic Chicken");
            case "Cat":
                System.out.println("Domestic Cat");
            case "Dog":
                System.out.println("Domestic Dog");
                break;
            case "Horse":
                System.out.println("Domestic");
                break;
            case "Tiger":
                System.out.println("Wild");
                break;
            //default is equivalent to else
            default:
                System.out.println("Unknown animal from else");
                //optional break
                break;
        }


        System.out.println("Most optimal switch case for our example");


        //no duplicate cases are allowed.
        switch (animal) {
            //java waits until the first case is matched before entering any cases body.
            case "Cat":
            case "Chicken":
            case "Horse":
            case "Dog":
                System.out.println("Domestic");
                break;
            case "Tiger":
            case "Snake":
            case "Hippo":
            case "Rhino":
                System.out.println("Wild");
                break;
            //default is equivalent to else
            default:
                System.out.println("Unknown animal");
                //optional break
                break;
        }

        System.out.println("default above cases");

        switch (animal) {
            //java waits until the first case is matched before entering any cases body.
            case "Cat":
            case "Chicken":
            case "Horse":
            case "Dog":
                System.out.println("Domestic");
                break;
            //putting default on top of cases is not a common practice.
            //default usually comes last
            default:
                System.out.println("Unknown animal");
                break;
            case "Tiger":
            case "Snake":
            case "Hippo":
            case "Rhino":
                System.out.println("Wild");
                break;
        }

        System.out.println("How can we ensure case insensitive ");

        //after any string variable we can call .toLowerCase() -> which will return the whole String lowerCased.
        System.out.println(animal.toLowerCase());
        switch (animal.toLowerCase()) {
            //java waits until the first case is matched before entering any cases body.
            case "cat":
            case "chicken":
            case "horse":
            case "dog":
                System.out.println("Domestic");
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
                break;
        }




    }
}
