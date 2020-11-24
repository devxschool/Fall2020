package arithmetic_operators;

public class MathematicalOperators {

    //variable enable great code maintainability
    public static void main(String[] args) {
        //Strings
        //Non primitive data type. Can store any length of text. should be surrounded by ""
        //primitive -> something super simple, basic.

        String myFavBooks = "B. Franklin biography + by Isaacson";

        System.out.println(myFavBooks);

        String hello = "hello";
        System.out.println(hello);

        String w = "world";
        System.out.println(w);

        System.out.println(myFavBooks);
        System.out.println(myFavBooks);

        //everything in between double quotes are part of the text(String);
        System.out.println("hello + w");
        //+ between two Strings mean it's concatenation(adding two words(text) together)

        System.out.println(hello + w);

        String firstName = "Jane"; //John
        String lastName = "Doe";
        String dob = "02/22/2222 ";

        System.out.println();//give one empty space
        System.out.println(firstName + lastName + dob);


        //Java ignores white spaces.
        //To Add texts together
        //Scenario 1: I have a Text in "Jane" and I want to add a text from a variable
        //"Jane" + variable

        //Scenario 2: I have a variable and a text "Jane"
        //variable + "Jave"

        //If i want to add a space between them I add "Jane" + " " + variable;
        //variable + " " + variable2  + " " + variable3
        String finalText = "Jane" + " " + lastName;
        System.out.println(finalText);

        System.out.println();
        System.out.println("****" + firstName + "**** ^" + lastName + "^ (" + dob + " )");
        System.out.println(firstName + "\t" + lastName + "\t" + dob);

        //[] -> brackets
        //() -> parenthesis
        //{} -> curly braces
        //cmd + option + L => format the class code. (Mac)
        //windows -> ctrl + alt + L


        //***Jane*** ^Doe^ (02/22/2222);


        //Welcome to Apple
        //Jane
        System.out.println("Welcome to Apple");
        System.out.println(firstName);
    }

}
