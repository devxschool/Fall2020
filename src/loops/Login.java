package loops;

import java.util.Scanner;

public class Login {

    //HomeWork -> Create two Strings one for username
    //        //second for password
    //
    //        //String username = "JohnDoe@tesla.com"
    //        //String password = "HardP@$$"
    //
    //        //create a program which takes input for username and pass from user(scanner).
    //
    //        //check if username and password are valid(match). -> if they are valid -> say Logged in.
    //        //if the user enters the invalid password 3 times. We dont count invalid User name inputs.
    //        //Print out account is blocked.
    //        //Hint: use Do while.
    //for invalid userNames only allow 5 invalid userNames.

    public static void main(String[] args) {
        String userName = "JohnDoe@tesla.com";
        String password = "HardP@$$";

        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int userNameCounter = 0;

        boolean isLoggedIn = false;

        do {
            System.out.println("Enter your userName");
            String userNameEntered = sc.nextLine().trim();

            System.out.println("Enter Password");
            String passwordEntered = sc.nextLine().trim();

            if (userName.equals(userNameEntered)) {
                if (password.equals(passwordEntered)) {
                    System.out.println("Logged in");
                    //if you are using if statments in the loop
                    //you have to make sure every scenario has a condition update statement
                    isLoggedIn = true;
                } else {
                    counter++;
                    if (counter > 2){
                        System.err.println("Account is Blocked");
                    }
                }
            }
            else {
                System.err.println("Incorrect Username please try again");
                userNameCounter++;
                if (userNameCounter > 4){
                    System.err.println("Too many invalid UserName Attempts");
                }
            }
        } while (!isLoggedIn && counter < 3 && userNameCounter < 5);
    }
}

// &&
