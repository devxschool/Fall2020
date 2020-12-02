package input_from_user;

import java.util.Scanner;

public class PersonalInformation {

    public static void main(String[] args) {


        //take first
        //last name
        //gender
        //age
        //salary

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Firstname");
        //takes the first String before space.
        String firstname = sc.next();
        sc.nextLine(); //finish the previous line input.

        System.out.println("Enter your last name");
        //nextLine can also mean finish previous line.
        //if you have used anything except nextLine() ex(next(), nextInt(), nextDouble()) before nextLine()
        String lastName = sc.nextLine();

        //that the way we take a character from user.
        System.out.println("Enter your gender");
        char gender = sc.next().charAt(0);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        System.out.println("Name: " + firstname + " " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);




    }
}
