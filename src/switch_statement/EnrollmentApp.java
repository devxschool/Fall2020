package switch_statement;


import java.util.Scanner;

/**
 * Tell a student which classes they have to take.
 * <p>
 * Which major are you in?
 * - Accounting  --> year 1 and 2 should take Math 1,2. Calculus.  3,4 -> Excel, Macroeconomics. Microeconomics.
 * - Computer Science --> year 1 and 2 should take Math 1,2, Calculus. 3,4 => Java, Intro to Information Systems.
 * - Psychology  --> year 1 and 2 should take Public Speaking, Body Language. 3,4 Psychology, Neuroscience.
 * <p>
 * <p>
 * Which college year are you in?
 */
public class EnrollmentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Which major are you in?");
        String major = sc.nextLine();

        //major = accounting
        switch (major.toLowerCase()) {
            case "accounting":
            case "computer science":
            case "psychology":
                System.out.println("Which college year are you in?");
                int year = sc.nextInt();
                switch (year) {
                    case 1:
                    case 2:
                        switch (major.toUpperCase()) {
                            case "ACCOUNTING":
                            case "COMPUTER SCIENCE":
                                System.out.println("You should take Math 1,2 and Calculus");
                                break;
                            case "PSYCHOLOGY":
                                System.out.println("You should take Public Speaking, Body Language");
                                break;
                        }
                        break;
                    case 3:
                    case 4:
                        switch (major.toUpperCase()) {
                            case "ACCOUNTING":
                                System.out.println("You should take Macroeconomics and Microeconomics");
                                break;
                            case "COMPUTER SCIENCE":
                                System.out.println("You should take Java, Intro to Information Systems ");
                                break;
                            case "PSYCHOLOGY":
                                System.out.println("You should take Psychology, Neuroscience ");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid Year");
                }
                break;
            default:
                System.out.println("Please choose another major");
        }

//        switch (year) {
//            case 1:
//            case 2:
//                switch (major.toUpperCase()) {
//                    case "ACCOUNTING":
//                    case "COMPUTER SCIENCE":
//                        System.out.println("You should take Math 1,2 and Calculus");
//                        break;
//                    case "PSYCHOLOGY":
//                        System.out.println("You should take Public Speaking, Body Language");
//                        break;
//                    default:
//                        System.out.println("Please select another major");
//                }
//                break;
//            case 3:
//            case 4:
//                switch (major.toUpperCase()) {
//                    case "ACCOUNTING":
//                        System.out.println("You should take Macroeconomics and Microeconomics");
//                        break;
//                    case "COMPUTER SCIENCE":
//                        System.out.println("You should take Java, Intro to Information Systems ");
//                        break;
//                    case "PSYCHOLOGY":
//                        System.out.println("You should take Psychology, Neuroscience ");
//                        break;
//                    default:
//                        System.out.println("Please select another major");
//                }
//                break;
//            default:
//                System.out.println("Invalid Year");
//        }
    }
}

//switch (major.toLowerCase()) {
//                    case "accounting":
//                        switch (year) {
//                            case 1:
//                            case 2:
//                                System.out.println("You should take Math 1,2 and Calculus");
//                                break;
//                            case 3:
//                            case 4:
//                                System.out.println("You should take Macroeconomics and Microeconomics");
//                                break;
//                        }
//                        break;
//                    case "computer science":
//                        switch (year) {
//                            case 1:
//                            case 2:
//                                System.out.println("You should take Math 1,2 and Calculus ");
//                                break;
//                            case 3:
//                            case 4:
//                                System.out.println("You should take Java, Intro to Information Systems ");
//                                break;
//                        }
//                        break;
//                    case "psychology":
//                        switch (year) {
//                            case 1:
//                            case 2:
//                                System.out.println("You should take Public Speaking, Body Language ");
//                                break;
//                            case 3:
//                            case 4:
//                                System.out.println("You should take Psychology, Neuroscience ");
//                                break;
//                        }
//                        break;
//                }

